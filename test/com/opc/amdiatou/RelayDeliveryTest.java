package com.opc.amdiatou;

import com.opc.amdiatou.homeshop.Delivery;
import com.opc.amdiatou.homeshop.RelayDelivery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelayDeliveryTest {

    @Test
    void Given_FreeRelay_WhenGettingDeliveryPrice_Then_Get0e(){
        Delivery delivery = new RelayDelivery(5);
        assertEquals(0.0, delivery.getPrice(), 0.01);
    }
    @Test
    void Given_LowPrice_WhenGettingDeliveryPrice_Then_Get2e99(){
        Delivery delivery = new RelayDelivery(27);
        assertEquals(2.99, delivery.getPrice(), 0.01);
    }
    @Test
    void Given_HighPrice_WhenGettingDeliveryPrice_Then_Get4e99(){
        Delivery delivery = new RelayDelivery(52);
        assertEquals(4.99, delivery.getPrice(), 0.01);
    }

}