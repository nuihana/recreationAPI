package com.jdu.recreation.model.dao;

import com.jdu.recreation.model.vo.MusicVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MusicDAO {
    List<MusicVo> selectMusic(MusicVo vo);
}
