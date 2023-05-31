package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.AnswersDao;
import com.example.demo.entity.AnswersEntity;
import com.example.demo.service.AnswersService;
import org.springframework.stereotype.Service;

@Service("AnswersService")
public class AnswersSeviceImpl extends ServiceImpl<AnswersDao, AnswersEntity> implements AnswersService {
}
