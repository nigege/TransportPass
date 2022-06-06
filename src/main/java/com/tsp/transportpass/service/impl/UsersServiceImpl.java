package com.tsp.transportpass.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsp.transportpass.entity.UsersEntity;
import com.tsp.transportpass.mapper.UsersMapper;
import com.tsp.transportpass.resp.CommonResp;
import com.tsp.transportpass.resp.PageResp;
import com.tsp.transportpass.service.UsersService;
import org.springframework.stereotype.Service;

@Service                       //声明是一个service，必须扫描这个包才可以
public class UsersServiceImpl extends ServiceImpl<UsersMapper, UsersEntity> implements UsersService {

    @Override
    public void getlist(CommonResp<PageResp<UsersEntity>> resp) {

    }
}
