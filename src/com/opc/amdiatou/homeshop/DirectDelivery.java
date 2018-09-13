package com.opc.amdiatou.homeshop;

public class DirectDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 4.90;
    }

    @Override
    public String getInfo() {
        return "Livraison à domicile 4.99€";
    }
}
