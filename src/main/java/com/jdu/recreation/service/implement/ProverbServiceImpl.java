package com.jdu.recreation.service.implement;

import com.jdu.recreation.model.dao.ProverbDAO;
import com.jdu.recreation.model.vo.ProverbVo;
import com.jdu.recreation.service.interfaces.ProverbService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class ProverbServiceImpl implements ProverbService {

    private final ProverbDAO proverbDAO;

    @Override
    public ProverbVo getRandomProverb(ProverbVo vo) {
        List<ProverbVo> proverbList = proverbDAO.selectProverb(vo);
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        if (proverbList.isEmpty()) return null;
        return proverbList.get(random.nextInt(proverbList.size()));
    }
}
