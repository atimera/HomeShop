package com.opc.amdiatou.homeshop;

public class ExpressDelivery implements Delivery {
    private String city;

    public ExpressDelivery(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public double getPrice() {
        if(city.equals("Paris"))
            return 6.99;
        else
            return 9.99;
    }
}
