package com.sanketd.multiDbConfig.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sanketd.multiDbConfig.model.order.Orders;
import com.sanketd.multiDbConfig.model.user.Users;

import java.util.List;
public class GetAllResponse {

    List<Orders> ordersList;

    List<Users>  usersList;

    public GetAllResponse(List<Orders> ordersList, List<Users> usersList) {
        this.ordersList = ordersList;
        this.usersList = usersList;
    }

    public GetAllResponse() {
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }
}
