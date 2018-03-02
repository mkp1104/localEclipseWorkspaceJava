/*
 * Copyright (C) 2018 { Manish Kumar Prasad } <manis.aec1104@gmail.com>
 * This file is part of localEclipseWorkspaceJava.
 * project can not be copied and/or distributed
 * without the express permission of { Manish Kumar Prasad }.
 */

package com.mkp.immutable;


import java.util.*;
import java.util.concurrent.*;

class Stats {
    public static class StatisticsAggregatorImpl implements StatisticsAggregator {

        @Override
        public void putNewPrice(String symbol, double price) {
            // YOUR CODE HERE

        }

        @Override
        public double getAveragePrice(String symbol) {
            // YOUR CODE HERE

            return 47.00;
        }

        @Override
        public int getTickCount(String symbol) {
            // YOUR CODE HERE

            return 9;
        }
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                final StatisticsAggregator stats = new StatisticsAggregatorImpl();
                final Set<String> symbols = new TreeSet<>();

                String line = scanner.nextLine();
                String[] inputs = line.split(",");
                int threads = Integer.parseInt(inputs[0]);
                ExecutorService pool = Executors.newFixedThreadPool(threads);
                for (int i = 1; i < inputs.length; ++i) {
                    String[] tokens = inputs[i].split(" ");
                    final String symbol = tokens[0];
                    symbols.add(symbol);
                    final double price = Double.parseDouble(tokens[1]);
                    pool.submit(new Runnable() {
                        @Override
                        public void run() {
                            stats.putNewPrice(symbol, price);
                        }
                    });

                }
                pool.shutdown();
                try {
                    pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (String symbol : symbols) {
                    System.out.println(String.format("%s %.4f %d", symbol,
                            stats.getAveragePrice(symbol),
                            stats.getTickCount(symbol)));
                }
            }
            scanner.close();

        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface StatisticsAggregator {
        // This is an input. Make note of this price.
        public void putNewPrice(String symbol, double price);

        // Get the average price
        public double getAveragePrice(String symbol);

        // Get the total number of prices recorded
        public int getTickCount(String symbol);
    }


}