package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serial;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@TableName("answers")
public class AnswersEntity implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  @TableId
  private Integer id;
  private Integer questionId;
  private Integer ownerId;
  private Integer isAccepted;
  private Integer upVoteCount;
  private Integer commentCount;
  private Long creationDate;
  private Integer highestVote;
}