package com.jdu.recreation.model.vo;

import lombok.Data;

import java.util.List;

@Data
public class MusicVo {
    private int seq;
    private String title;
    private String singer;
    private String release_year;
    private String genre_code;
    private String is_ost;
    private String ost_desc;
    private String url;

    private List<Integer> usedList;
}
