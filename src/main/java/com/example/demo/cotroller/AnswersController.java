package com.example.demo.cotroller;


import com.example.demo.entity.AnswersEntity;

import com.example.demo.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("answers")
public class AnswersController {
  @Autowired
  private AnswersService AnswersService;

  @RequestMapping("/list")
  public List<AnswersEntity> list(){
    return AnswersService.list();
  }

}