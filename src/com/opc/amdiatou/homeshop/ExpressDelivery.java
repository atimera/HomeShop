package com.opc.amdiatou.homeshop;

public class ExpressDelivery implements Delivery {
    private String city;

    public ExpressDelivery(String city) {
        this.city = city;
    }

    @Override
    public String getInfo() {
        return "Livraison express à domicile " + getPrice() +"€";
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
