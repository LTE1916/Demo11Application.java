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
@TableName("stackoverflow_questions")
public class QuestionEntity implements Serializable{
  @Serial
  private static final long serialVersionUID = 1L;

  @TableId
  private Integer  questionId;
  private String title;
  private String tags;
  private String ownerProfileImage;
  private Integer ownerAccountId;
  private String ownerUserType;
  private Integer ownerUserId;
  private String ownerLink;
  private Integer ownerReputation;
private  String ownerDisplayName;
private String  contentLicense;
private String  link;
private Long lastActivityDate;
private Long  creationDate;
private Integer answerCount;
private Integer score;
private Integer acceptedAnswerId;
private Boolean  isAnswered ;
private Integer  viewCount;
private Long  lastEditDate ;
private Boolean  hasMore;
private Integer  quotaMax;
private Integer  quotaRemaining ;
private Long  protectedDate ;//because of format problem,use Long to store timestamp
}
