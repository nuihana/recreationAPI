package com.jdu.recreation.model.vo;

import lombok.Data;

import java.util.List;

@Data
public class PersonVo {
    private int seq;
    private String name;
    private String url;

    private List<Integer> usedList;
}
