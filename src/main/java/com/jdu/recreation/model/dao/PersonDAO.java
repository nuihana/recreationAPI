package com.jdu.recreation.model.dao;

import com.jdu.recreation.model.vo.PersonVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonDAO {
    List<PersonVo> selectPerson(PersonVo vo);
}
