package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.AnswerDao;
import com.example.demo.entity.AnswerEntity;
import com.example.demo.service.AnswerService;
import org.springframework.stereotype.Service;

@Service("AnswerService")
public class AnswerSeviceImpl extends ServiceImpl<AnswerDao, AnswerEntity> implements AnswerService {
}
