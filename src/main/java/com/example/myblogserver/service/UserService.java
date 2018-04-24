package com.example.myblogserver.service;

import com.example.myblogserver.model.TUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {
    int addUser(TUser user);

    List<TUser> findAllUser(int pageNum, int pageSize);
}
