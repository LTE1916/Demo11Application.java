package com.example.demo.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.demo.dao.QuestionsDao;

import com.example.demo.dao.UsersDao;
import com.example.demo.entity.QuestionsEntity;
import com.example.demo.entity.UsersEntity;
import com.example.demo.service.QuestionsService;
import com.example.demo.service.UsersService;
import org.springframework.stereotype.Service;

@Service("UsersService")
public class UsersSeviceImpl extends ServiceImpl<UsersDao, UsersEntity> implements UsersService {

}
