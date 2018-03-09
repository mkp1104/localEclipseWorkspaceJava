/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.rabbitmq.client.example6;

import static com.june.mq.rabbit.Consts.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * RoutingSendDirect <br>
 *
 * @author ??? wjw.happy.love@163.com
 * @blog https://www.github.com/junehappylove
 * @date 2017?7?13? ??2:49:49
 * @version 1.0.0
 */
public class RoutingSendDirect {

    /**
     * @param args
     * @throws TimeoutException
     * @throws IOException
     * @date 2017?7?13? ??2:49:49
     * @writer junehappylove
     */
    public static void main(String[] args) throws IOException, TimeoutException {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(host);
        factory.setUsername(username);
        factory.setPassword(password);
        factory.setPort(port);
        factory.setVirtualHost(virtualHost);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        // ?????
        channel.exchangeDeclare(EXCHANGE_NAME_ROUTING, "direct");// ???direct
        // ????
        for (String routingKey : routingKeys) {
            String message = "RoutingSendDirect Send the message level:" + routingKey;
            channel.basicPublish(EXCHANGE_NAME_ROUTING, routingKey, null, message.getBytes());
            System.out.println("RoutingSendDirect Send" + routingKey + "':'" + message);
        }
        channel.close();
        connection.close();
    }

}