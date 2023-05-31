package com.example.demo.cotroller;

import com.example.demo.entity.QuestionEntity;
import com.example.demo.service.QuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stackoverflow_questions")
public class QuestionController {
  @Autowired
  private QuestionService QuestionService;

  @RequestMapping("/list")
  public List<QuestionEntity> list(){
    return QuestionService.list();
  }
}
