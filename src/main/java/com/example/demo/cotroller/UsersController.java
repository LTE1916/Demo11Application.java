package com.example.demo.cotroller;

import com.example.demo.entity.QuestionEntity;
import com.example.demo.entity.QuestionsEntity;
import com.example.demo.entity.UsersEntity;
import com.example.demo.service.QuestionService;
import com.example.demo.service.QuestionsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UsersController {
  @Autowired
  private com.example.demo.service.UsersService UsersService;

  @RequestMapping("/list")
  public List<UsersEntity> list(){
    return UsersService.list();
  }
}
