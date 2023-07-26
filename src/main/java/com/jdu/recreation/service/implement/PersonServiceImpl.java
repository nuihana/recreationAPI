package com.jdu.recreation.service.implement;

import com.jdu.recreation.model.dao.PersonDAO;
import com.jdu.recreation.model.vo.PersonVo;
import com.jdu.recreation.service.interfaces.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonDAO personDAO;

    @Override
    public PersonVo getRandomPerson(PersonVo vo) {
        List<PersonVo> personList = personDAO.selectPerson(vo);
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        if (personList.size() == 0) return null;
        else return personList.get(random.nextInt(personList.size()));
    }
}
