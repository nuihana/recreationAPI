package com.jdu.recreation.service.implement;

import com.jdu.recreation.model.dao.MusicDAO;
import com.jdu.recreation.model.vo.MusicVo;
import com.jdu.recreation.service.interfaces.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class MusicServiceImpl implements MusicService {

    private final MusicDAO musicDAO;

    @Override
    public MusicVo getRandomMusic(MusicVo vo) {
        List<MusicVo> musicList = musicDAO.selectMusic(vo);
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        return musicList.get(random.nextInt(musicList.size()));
    }
}
