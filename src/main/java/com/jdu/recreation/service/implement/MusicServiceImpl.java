package com.jdu.recreation.service.implement;

import com.jdu.recreation.model.dao.MusicDAO;
import com.jdu.recreation.model.vo.MusicVo;
import com.jdu.recreation.service.interfaces.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MusicServiceImpl implements MusicService {

    private final MusicDAO musicDAO;

    @Override
    public List<MusicVo> getMusicList() {
        return musicDAO.selectMusic();
    }
}
