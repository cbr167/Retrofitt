package com.example.bhagy.retrofit.model;

/**
 * Created by bhagy on 5/6/2018.
 */

public class Response {

    private String cod;
    private int cnt;
    private java.util.List<com.example.bhagy.retrofit.model.List> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public java.util.List<com.example.bhagy.retrofit.model.List> getList() {
        return list;
    }

    public void setList(java.util.List<com.example.bhagy.retrofit.model.List> list) {
        this.list = list;
    }
}
