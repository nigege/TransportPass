package com.tsp.transportpass.controller;


import com.tsp.transportpass.entity.UsersEntity;
import com.tsp.transportpass.req.UsersReq;
import com.tsp.transportpass.resp.CommonResp;
import com.tsp.transportpass.resp.PageResp;
import com.tsp.transportpass.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController                       //标识为controller层
@RequestMapping("/users")          //定义端口名
public class UsersController {
    //引入service层,用autowired也可以
    @Resource
    private UsersService usersService;

    @GetMapping("/getlist")       //定义一个getlist的接口
    public String getlist(UsersReq usersReq){
        CommonResp<PageResp<UsersEntity>> resp = new CommonResp<>();
        usersService.getlist(resp);

        return"123";

    }

}
