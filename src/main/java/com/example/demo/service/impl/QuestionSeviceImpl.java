package com.example.demo.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.QuestionDao;
import com.example.demo.entity.QuestionEntity;
import com.example.demo.service.QuestionService;
import org.springframework.stereotype.Service;

@Service("QuestionService")
public class QuestionSeviceImpl extends ServiceImpl<QuestionDao,QuestionEntity> implements QuestionService{

}
