package com.example.xml.domain;

import com.example.xml.adapter.TranspositionEncryptAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class Figure {
    private String name;
    private int space;
    private int fillIndex;

    public Figure() {}

    public Figure(String name, int space, int fillIndex) {
        this.name = name;
        this.space = space;
        this.fillIndex = fillIndex;
    }

    @XmlJavaTypeAdapter(TranspositionEncryptAdapter.class)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public int getFillIndex() {
        return fillIndex;
    }

    public void setFillIndex(int fillIndex) {
        this.fillIndex = fillIndex;
    }
}
