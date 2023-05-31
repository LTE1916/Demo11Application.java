package com.example.demo.cotroller;

import com.example.demo.entity.QuestionEntity;
import com.example.demo.entity.QuestionsEntity;
import com.example.demo.service.QuestionService;
import com.example.demo.service.QuestionsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("questions")
public class QuestionsController {
  @Autowired
  private com.example.demo.service.QuestionsService QuestionsService;

  @RequestMapping("/list")
  public List<QuestionsEntity> list(){
    return QuestionsService.list();
  }
}
