package com.sanketd.multiDbConfig.controller;

import com.sanketd.multiDbConfig.dto.UserDto;
import com.sanketd.multiDbConfig.model.order.Orders;
import com.sanketd.multiDbConfig.model.user.Users;
import com.sanketd.multiDbConfig.repository.order.OrderRepository;
import com.sanketd.multiDbConfig.repository.user.UserRepository;
import com.sanketd.multiDbConfig.response.GetAllResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DataController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    OrderRepository orderRepository;

    @PostMapping("/save/user")
    public Users saveUser(@RequestBody  UserDto users){

        System.out.println("User object "+users.toString());
        Users saveUserObject= new Users();
        saveUserObject.setEmail(users.getEmail());
        saveUserObject.setFirstName(users.getFirstName());
        saveUserObject.setLastName(users.getLastName());

           Users users1= userRepository.save(saveUserObject);
           return users1;
    }

    @PostMapping("/save/order")
    public Orders saveUser(@RequestBody  Orders orders){
       Orders orders1= orderRepository.save(orders);
        return orders1;
    }


    @GetMapping("/get/all")
    public GetAllResponse getAll() {
        List<Orders> ordersList = orderRepository.findAll();
        List<Users> usersList = userRepository.findAll();
        GetAllResponse getAllResponse = new GetAllResponse(ordersList, usersList);
        return getAllResponse;
    }


}
