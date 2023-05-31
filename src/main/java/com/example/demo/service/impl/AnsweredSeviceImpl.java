package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.AnsweredDao;
import com.example.demo.entity.AnsweredEntity;
import com.example.demo.service.AnsweredService;
import org.springframework.stereotype.Service;

@Service("AnsweredService")
public class AnsweredSeviceImpl extends ServiceImpl<AnsweredDao, AnsweredEntity> implements AnsweredService {
}
