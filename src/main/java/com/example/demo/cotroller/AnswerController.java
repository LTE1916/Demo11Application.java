package com.example.demo.cotroller;

import com.example.demo.entity.AnswerEntity;
import com.example.demo.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("answer")
public class AnswerController {
    @Autowired
    private AnswerService AnswerService;

    @RequestMapping("/list")
    public List<AnswerEntity> list(){
        return AnswerService.list();
    }

}
