package com.example.demo.cotroller;

import com.example.demo.entity.AnsweredEntity;
import com.example.demo.service.AnsweredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("answered")
public class AnsweredController {
    @Autowired
    private AnsweredService AnsweredService;

    @RequestMapping("/list")
    public List<AnsweredEntity> list(){
        return AnsweredService.list();
    }

}
