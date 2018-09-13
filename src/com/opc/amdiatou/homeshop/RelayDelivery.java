package com.opc.amdiatou.homeshop;

public class RelayDelivery implements Delivery {
    private int relayNumber;

    public RelayDelivery(int relayNumber) {
        this.relayNumber = relayNumber;
    }

    @Override
    public String getInfo() {
        return "Livraison au point relais " + getPrice() +"€";
    }

    @Override
    public double getPrice() {
        if(this.relayNumber >= 1 && this.relayNumber <= 22)
            return 0;
        else if(this.relayNumber > 22 && this.relayNumber <= 47)
            return 2.99;
        else
            return 4.99;
    }
}
