package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serial;
import java.util.Date;
import java.util.List;
import lombok.Data;

import java.io.Serializable;

import java.io.Serializable;
@Data
@TableName("questions")
public class QuestionsEntity implements Serializable{
  @Serial
  private static final long serialVersionUID = 1L;

  @TableId
  private Integer  id;
  private String title;
  private Integer  viewCount;
  private Integer answerCount;
  private Integer score;
  private Integer isAnswered;
  private Integer acceptedAnswerId;
  private Long creationDate;
  private Long lastActivityDate;
  private String link; //because of format problem,use Long to store timestamp
}
