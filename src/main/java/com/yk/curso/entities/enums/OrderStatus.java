package com.yk.curso.entities.enums;

import com.yk.curso.entities.Order;

/**
 * OrderStatus
 */
public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CAMCELED(5);

    private int code;

    private OrderStatus(int n) {
        this.code = n;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if(value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Codigo invalido");
    }
}