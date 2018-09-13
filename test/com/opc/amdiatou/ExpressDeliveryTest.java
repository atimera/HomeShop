package com.opc.amdiatou;

import com.opc.amdiatou.homeshop.ExpressDelivery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressDeliveryTest {

    @Test
    void Given_RegionCityAsLocation_WhenGettionDeliveryPrice_Then_Get9e99(){
        ExpressDelivery expressDelivery = new ExpressDelivery("Bordeaux");
        assertEquals(9.99, expressDelivery.getPrice(), 0.01);
    }
    @Test
    void Given_ParisAsLocation_WhenGettionDeliveryPrice_Then_Get4e99(){
        ExpressDelivery expressDelivery = new ExpressDelivery("Paris");
        assertEquals(6.99, expressDelivery.getPrice(), 0.01);
    }

}