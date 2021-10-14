package com.jeet.limitorder;

import java.util.*;

public class OrderBook {
    LinkedHashMap<Double, LinkedList<Order>> bidPriceMap = new LinkedHashMap<>();
    LinkedHashMap<Double, LinkedList<Order>> offerPriceMap = new LinkedHashMap<>();
    private static final OrderBook instance = new OrderBook();

    private OrderBook() {
    }

    public static OrderBook getInstance() {
        return instance;
    }

    public void addOrder(Order order) {
        if (order.getSide() == 'B') {
            addOrUpdateBid(order, bidPriceMap);
        } else {
            addOrUpdateBid(order, offerPriceMap);
        }

    }

    private void addOrUpdateBid(Order order, LinkedHashMap<Double, LinkedList<Order>> priceMap) {
        if (priceMap.containsKey(order.getPrice())) {
            Order currentOrder = priceMap.get(order.getPrice()).getFirst();
            priceMap.get(order.getPrice()).push(new Order(currentOrder.getId(), currentOrder.getPrice(), currentOrder.getSide(), order.getSize()));
        } else {
            LinkedList<Order> temp = new LinkedList<>();
            temp.push(order);
            priceMap.put(order.getPrice(), temp);
        }
    }

    public void removeOrder(long id) {
        bidPriceMap.values().forEach(k -> {
            k.removeIf(v -> (v.getId() == id));
        });
        offerPriceMap.values().forEach(k -> {
            k.removeIf(v -> (v.getId() == id));
        });
    }

    public void modifyOrder(long id, long size) {
        for (LinkedList<Order> orderLinkedList : bidPriceMap.values()) {
            if (orderLinkedList.getFirst().getId() == id) {
                Order currOrder = orderLinkedList.getFirst();
                orderLinkedList.push(new Order(currOrder.getId(), currOrder.getPrice(), currOrder.getSide(), size));
            }
        }
        for (LinkedList<Order> orderLinkedList : offerPriceMap.values()) {
            if (orderLinkedList.getFirst().getId() == id) {
                Order currOrder = orderLinkedList.getFirst();
                orderLinkedList.push(new Order(currOrder.getId(), currOrder.getPrice(), currOrder.getSide(), size));
            }
        }
    }

    public double getPrice(char side, int level) {
        if (side == 'B') {
            Set<Double> keySet = bidPriceMap.keySet();
            Double[] price = keySet.toArray(new Double[keySet.size()]);
            return price[level];
        }
        if (side == 'O') {
            Set<Double> keySet = offerPriceMap.keySet();
            Double[] price = keySet.toArray(new Double[keySet.size()]);
            return price[level];
        }
        return 0;
    }

    public long totalSize(char side, int level) {
        if (side == 'B') {
            int i = 0;
            for (LinkedList<Order> orderLinkedList : bidPriceMap.values()) {
                i++;
                if (i == level) {
                    return orderLinkedList.stream().mapToLong(Order::getSize).sum();
                }
            }
        }
        if (side == 'O') {
            int i = 0;
            for (LinkedList<Order> orderLinkedList : offerPriceMap.values()) {
                i++;
                if (i == level) {
                    return orderLinkedList.stream().mapToLong(Order::getSize).sum();
                }
            }
        }
        return 0;
    }

    public List<Order> returnAllOrders(char side) {
        List<Order> allOrderList = new LinkedList<>();
        if (side == 'B') {
            int i = 0;
            for (LinkedList<Order> orderLinkedList : bidPriceMap.values()) {
                allOrderList.addAll(orderLinkedList);
            }
        }
        if (side == 'O') {
            int i = 0;
            for (LinkedList<Order> orderLinkedList : offerPriceMap.values()) {
                allOrderList.addAll(orderLinkedList);
            }
        }
        return allOrderList;
    }

}
