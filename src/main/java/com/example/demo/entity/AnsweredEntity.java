package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serial;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@TableName("answered")
public class AnsweredEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    private Integer accepted;

    private Date ptime;

    private Date actime;

    private Integer acupvote;

    private Integer highest;
}