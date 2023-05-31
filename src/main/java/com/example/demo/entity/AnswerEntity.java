package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serial;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("datas")
public class AnswerEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    private Integer answers;

    private Integer views;

    private Integer votes;

    private String link;
}