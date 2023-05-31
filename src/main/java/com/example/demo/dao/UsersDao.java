package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.QuestionsEntity;
import com.example.demo.entity.UsersEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersDao extends BaseMapper<UsersEntity> {

}
