/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.rabbitmq.client.example3;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public class Publisher {

    public static void main(String[] args) throws NoSuchAlgorithmException, KeyManagementException, URISyntaxException, IOException, InterruptedException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setUri("amqp://guest:guest@localhost");
        factory.setConnectionTimeout(300000);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare("my-queue", true, false, false, null);

        int count = 0;

        while (count < 5000) {
            String message = "Message number " + count;

            channel.basicPublish("", "my-queue", null, message.getBytes());
            count++;
            System.out.println("Published message: " + message);

            Thread.sleep(5000);
        }
    }
}