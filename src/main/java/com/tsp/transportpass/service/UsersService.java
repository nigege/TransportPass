package com.tsp.transportpass.service;

import com.tsp.transportpass.entity.UsersEntity;
import com.tsp.transportpass.resp.CommonResp;
import com.tsp.transportpass.resp.PageResp;

public interface UsersService {
    void getlist(CommonResp<PageResp<UsersEntity>> resp);
}
