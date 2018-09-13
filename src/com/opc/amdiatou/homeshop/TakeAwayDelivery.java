package com.opc.amdiatou.homeshop;

public class TakeAwayDelivery implements Delivery {

    @Override
    public String getInfo() {
        return "Retrait dans l'entrepot 0.0€";
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
