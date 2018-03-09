/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.rabbitmq.client.example13;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.pool.KryoPool;
import com.github.natanbc.discordbotsapi.DiscordBotsAPI;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import gabrielbot.GabrielBot;
import gabrielbot.commands.custom.CustomCommand;
import gabrielbot.core.data.serializers.CustomSerializer;
import gabrielbot.core.data.serializers.Serialize;
import gabrielbot.utils.data.JedisDataManager;
import gabrielbot.utils.data.JedisSerializatorDataManager;
import gabrielbot.utils.starboard.StarboardDataManager;
import gabrielbot.utils.stats.GatewayInfo;
import gnu.trove.impl.unmodifiable.TUnmodifiableLongSet;
import gnu.trove.set.TLongSet;
import gnu.trove.set.hash.TLongHashSet;
import net.dv8tion.jda.core.entities.User;
import org.objenesis.strategy.StdInstantiatorStrategy;
import redis.clients.jedis.Jedis;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static java.util.concurrent.TimeUnit.MINUTES;

@SuppressWarnings({"unused", "WeakerAccess"})
public final class GabrielData {
    public static final CustomSerializer<GuildData> GUILD_SERIALIZER = new CustomSerializer<>(GuildData.class);
    public static final CustomSerializer<ChannelData> CHANNEL_SERIALIZER = new CustomSerializer<>(ChannelData.class);
    public static final CustomSerializer<UserData> USER_SERIALIZER = new CustomSerializer<>(UserData.class);

    @SuppressWarnings("unchecked")
    public static final KryoPool POOL = new KryoPool.Builder(()->{
        Kryo k = new Kryo();
        Kryo.DefaultInstantiatorStrategy strategy = new Kryo.DefaultInstantiatorStrategy();
        strategy.setFallbackInstantiatorStrategy(new StdInstantiatorStrategy());
        k.setInstantiatorStrategy(strategy);
        k.addDefaultSerializer(GuildData.class, GUILD_SERIALIZER);
        k.addDefaultSerializer(ChannelData.class, CHANNEL_SERIALIZER);
        k.addDefaultSerializer(UserData.class, USER_SERIALIZER);
        return k;
    }).build();

    private static JedisSerializatorDataManager<ChannelData> channels;
    private static JedisSerializatorDataManager<GuildData> guilds;
    private static JedisSerializatorDataManager<UserData> users;
    private static StarboardDataManager starboards;
    private static StarboardDataManager shitboards;
    private static JedisDataManager blacklist;
    private static JedisDataManager react;
    private static Config config;
    private static TUnmodifiableLongSet upvoters;
    private static Connection connection;
    private static Channel generalPurposeChannel;

    private GabrielData() {}

    public static JedisSerializatorDataManager<ChannelData> channels() {
        if(channels == null) {
            synchronized(GabrielData.class) {
                if(channels != null) return channels;
                Config.DBInfo info = config().dbs.get("main");
                if(info == null) throw new UnsupportedOperationException("No db info specified in config file");
                channels = new JedisSerializatorDataManager<>(info.host, info.port, "channel:", POOL, 2000, 20, MINUTES);
            }
        }
        return channels;
    }

    public static JedisSerializatorDataManager<GuildData> guilds() {
        if(guilds == null) {
            synchronized(GabrielData.class) {
                if(guilds != null) return guilds;
                Config.DBInfo info = config().dbs.get("main");
                if(info == null) throw new UnsupportedOperationException("No db info specified in config file");
                guilds = new JedisSerializatorDataManager<>(info.host, info.port, "guild:", POOL, 100, 5, MINUTES);
            }
        }
        return guilds;
    }

    public static JedisSerializatorDataManager<UserData> users() {
        if(users == null) {
            synchronized(GabrielData.class) {
                if(users != null) return users;
                Config.DBInfo info = config().dbs.get("main");
                if(info == null) throw new UnsupportedOperationException("No db info specified in config file");
                users = new JedisSerializatorDataManager<>(info.host, info.port, "user:", POOL, 1000, 20, MINUTES);
            }
        }
        return users;
    }

    public static StarboardDataManager starboards() {
        if(starboards == null) {
            synchronized(GabrielData.class) {
                if(starboards != null) return starboards;
                Config.DBInfo info = config().dbs.get("main");
                if(info == null) throw new UnsupportedOperationException("No db info specified in config file");
                starboards = new StarboardDataManager(info.host, info.port, "starboard:");
            }
        }
        return starboards;
    }

    public static StarboardDataManager shitboards() {
        if(shitboards == null) {
            synchronized(GabrielData.class) {
                if(shitboards != null) return starboards;
                Config.DBInfo info = config().dbs.get("main");
                if(info == null) throw new UnsupportedOperationException("No db info specified in config file");
                shitboards = new StarboardDataManager(info.host, info.port, "shitboard:");
            }
        }
        return shitboards;
    }

    public static JedisDataManager blacklist() {
        if(blacklist == null) {
            synchronized(GabrielData.class) {
                if(blacklist != null) return blacklist;
                Config.DBInfo info = config().dbs.get("main");
                if(info == null) throw new UnsupportedOperationException("No db info specified in config file");
                blacklist = new JedisDataManager(info.host, info.port, "blacklist:");
            }
        }
        return blacklist;
    }

    public static JedisDataManager react() {
        if(react == null) {
            synchronized(GabrielData.class) {
                if(react != null) return react;
                Config.DBInfo info = config().dbs.get("main");
                if(info == null) throw new UnsupportedOperationException("No db info specified in config file");
                react = new JedisDataManager(info.host, info.port, "react:");
            }
        }
        return react;
    }

    public static Config config(boolean reload) {
        if(config == null || reload) {
            try {
                config = Config.load(new File("config.json"));
            } catch(IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        return config;
    }

    public static Config config() {
        return config(false);
    }

    public static TUnmodifiableLongSet upvoters() {
        if(upvoters == null) {
            synchronized(GabrielData.class) {
                if(upvoters != null) return upvoters;
                upvoters = new TUnmodifiableLongSet(new TLongHashSet());
                Thread t = new Thread(()->{
                    DiscordBotsAPI api = GabrielBot.getInstance().discordBotsAPI;
                    if(api.getToken() == null) return;
                    while(true) {
                        upvoters = new TUnmodifiableLongSet(new TLongHashSet(api.getUpvoterIds(GabrielBot.getInstance().getShards()[0].getJDA().getSelfUser().getIdLong())));
                        try {
                            TimeUnit.MINUTES.sleep(3);
                        } catch(InterruptedException e) {
                            GabrielBot.LOGGER.error("Upvoter updater interrupted");
                            return;
                        }
                    }
                });
                t.setName("DBL Upvotes Updater Thread");
                t.setDaemon(true);
                t.setPriority(1);
                t.start();
            }
        }
        return upvoters;
    }

    public static Connection connection() throws IOException, TimeoutException {
        if(connection == null) {
            synchronized(GabrielData.class) {
                if(connection != null) return connection;
                Config config = config();
                ConnectionFactory connectionFactory = new ConnectionFactory();
                connectionFactory.setHost(config.rabbitMQHost);
                connectionFactory.setPort(config.rabbitMQPort);
                connectionFactory.setUsername(config.rabbitMQUsername);
                connectionFactory.setPassword(config.rabbitMQPassword);
                connection = connectionFactory.newConnection();
                generalPurposeChannel = connection.createChannel();
                GatewayInfo.init(generalPurposeChannel);
            }
        }
        return connection;
    }

    public static Channel getGeneralPurposeChannel() {
        if(generalPurposeChannel == null) {
            synchronized(GabrielData.class) {
                if(generalPurposeChannel != null) return generalPurposeChannel;
                try {
                    connection();
                } catch(Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return generalPurposeChannel;
    }

    public static void save() {
        if(channels != null) channels.save();
        if(guilds != null) guilds.save();
        if(blacklist != null) blacklist.save();
        if(users != null) users.save();
        if(starboards != null) starboards.save();
        if(shitboards != null) shitboards.save();
        if(react != null) react.save();
    }

    public static void close() {
        if(channels != null) channels.close();
        if(guilds != null) guilds.close();
        if(blacklist != null) blacklist.close();
        if(users != null) users.close();
        if(starboards != null) starboards.close();
        if(shitboards != null) shitboards.close();
        if(react != null) react.close();
    }

    public static long dbSize() {
        return blacklist().run(Jedis::dbSize);
    }

    public static void prepareExit() {
        save();
        close();
    }

    public static boolean isBlacklisted(User user) {
        return blacklist().get(user.getId()) != null;
    }

    public static class ChannelData {
        @Serialize(id = 0)
        public boolean nsfw = false;
    }

    public static class GuildData {
        @Serialize(id = 0)
        public Map<String, CustomCommand> customCommands = new ConcurrentHashMap<>();
        @Serialize(id = 1)
        public long premiumUntil = 0;

        @Serialize(id = 2)
        public long starboardChannelId;

        @Serialize(id = 3)
        public int minStars = 1;
        @Serialize(id = 4)
        public TLongSet starboardBlacklist;

        @Serialize(id = 5)
        public long maxStarboardMessageAgeMillis;

        @Serialize(id = 6)
        public boolean payRespects = true;

        @Serialize(id = 7)
        public TLongSet starboardDisabledChannels;

        @Serialize(id = 8)
        public String prefix;

        @Serialize(id = 9)
        public long shitboardChannelId;
        @Serialize(id = 10)
        public int minShits = 1;
        @Serialize(id = 11)
        public TLongSet shitboardBlacklist;
        @Serialize(id = 12)
        public long maxShitboardMessageAgeMillis;
        @Serialize(id = 13)
        public TLongSet shitboardDisabledChannels;
    }

    public static class UserData {
        @Serialize(id = 0)
        public long premiumUntil = 0;
        @Serialize(id = 1)
        public long money = 0;
        @Serialize(id = 2)
        public String profileDescription;
    }
}