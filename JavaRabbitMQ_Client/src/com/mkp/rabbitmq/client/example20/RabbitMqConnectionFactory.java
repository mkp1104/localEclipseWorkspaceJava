/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.rabbitmq.client.example20;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import io.kodokojo.commons.config.RabbitMqConfig;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

import static java.util.Objects.requireNonNull;

public interface RabbitMqConnectionFactory {

    Logger LOGGER = LoggerFactory.getLogger(RabbitMqConnectionFactory.class);

    default Connection createFromRabbitMqConfig(RabbitMqConfig config){
        LOGGER.info("Trying to connect to RabbitMq '{}:{}'.", config.host(), config.port());
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(config.host());
        factory.setPort(config.port());

        if (StringUtils.isNotBlank(config.login())) {
            factory.setUsername(config.login());
            factory.setPassword(config.password());
            LOGGER.debug("Using login : {} [{}]", config.login(), config.password());
        }

        factory.setVirtualHost(config.virtualHost());
        LOGGER.debug("Use virtualhost {}", config.virtualHost());

        try {
            //ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);
            return factory.newConnection();
        } catch (IOException e) {
            throw new RuntimeException("Unable to create a consumeConnection to Rabbit " + config.host() + ":" + config.port(), e);
        }
    }

}