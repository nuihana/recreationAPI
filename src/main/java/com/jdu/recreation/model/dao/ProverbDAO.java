package com.jdu.recreation.model.dao;

import com.jdu.recreation.model.vo.ProverbVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProverbDAO {
    List<ProverbVo> selectProverb(ProverbVo vo);
}
