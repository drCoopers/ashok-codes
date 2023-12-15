package com.sanketd.multiDbConfig.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class OrderDto {


    private Integer id;

    private String productName;

    private Integer orderAmount;

    private Integer userId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public OrderDto(Integer id, String productName, Integer orderAmount, Integer userId) {
        this.id = id;
        this.productName = productName;
        this.orderAmount = orderAmount;
        this.userId = userId;
    }

    public OrderDto() {
    }
}
