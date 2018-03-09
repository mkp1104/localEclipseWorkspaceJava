/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.rabbitmq.client.example15;

import java.io.IOException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

import io.flowing.retail.adapter.ChannelConsumer;
import io.flowing.retail.adapter.EventHandler;

public class RabbitMqConsumer extends ChannelConsumer {

    public static String EXCHANGE_NAME = "flowing-retail";

    private EventHandler eventHandler;

    private Channel channel;

    private String name;

    public RabbitMqConsumer() {
    }

    public RabbitMqConsumer(String name, EventHandler eventHandler) {
        this.name = name;
        this.eventHandler = eventHandler;
    }

    protected void connect() throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        channel = connection.createChannel();

        String queueName = "flowing-retail-" + name;
        channel.queueDeclare(queueName, true, false, false, null);
        channel.exchangeDeclare(EXCHANGE_NAME, "fanout", true); // publish/subscribe model
        channel.queueBind(queueName, EXCHANGE_NAME, "*");

        System.out.println(" [*] Waiting for messages.");

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(" [x] Received '" + message + "'");
                eventHandler.handleEvent(message);
            }
        };
        channel.basicConsume(queueName, true, consumer);
    }

    protected void disconnect() throws Exception {
        channel.close();
    }

}