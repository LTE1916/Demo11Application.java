package com.example.demo.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.demo.dao.QuestionsDao;

import com.example.demo.entity.QuestionsEntity;
import com.example.demo.service.QuestionsService;
import org.springframework.stereotype.Service;

@Service("QuestionsService")
public class QuestionsSeviceImpl extends ServiceImpl<QuestionsDao, QuestionsEntity> implements QuestionsService{

}
