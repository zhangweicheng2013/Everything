package com.ssy.everything.bean;

import java.util.ArrayList;

/**
 * Created by ssy on 2017/6/6.
 */

public class NewsResult {
    public String stat;

    public ArrayList<NewsInfo> data;


    @Override
    public String toString() {
        return "NewsResult{" +
                "stat='" + stat + '\'' +
                ", data=" + data +
                '}';
    }
}
