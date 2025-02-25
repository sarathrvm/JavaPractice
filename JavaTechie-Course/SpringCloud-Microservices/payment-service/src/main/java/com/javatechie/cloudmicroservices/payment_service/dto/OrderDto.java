package com.javatechie.cloudmicroservices.payment_service.dto;

import java.util.Date;

public class OrderDto {

    private String id;
    private String name;
    private String category;
    private double price;
    private Date purchaseDate;
    private String orderId;
    private int userId;
    private String paymentMode;
}
