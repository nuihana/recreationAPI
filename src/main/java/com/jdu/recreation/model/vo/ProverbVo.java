package com.jdu.recreation.model.vo;

import lombok.Data;

import java.util.List;

@Data
public class ProverbVo {
    private int seq;
    private String type;
    private String word;

    private List<Integer> usedList;
}
