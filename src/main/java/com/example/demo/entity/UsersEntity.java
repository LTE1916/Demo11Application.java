package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serial;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("users")
public class UsersEntity implements Serializable{
  @Serial
  private static final long serialVersionUID = 1L;

  @TableId
  private Integer  id;
  private Integer  accountId;
  private Integer  reputation;
  private Integer acceptRate;
  private String userType;
  private String displayName;
}
