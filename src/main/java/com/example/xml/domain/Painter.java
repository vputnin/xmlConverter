package com.example.xml.domain;

import com.example.xml.adapter.TranspositionEncryptAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class Painter {
    private String name;
    private String brushName;
    private int averageSpeed;

    public Painter(){

    }

    public Painter(String name, String brushName, int averageSpeed) {
        this.name = name;
        this.brushName = brushName;
        this.averageSpeed = averageSpeed;
    }

    @XmlJavaTypeAdapter(TranspositionEncryptAdapter.class)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlJavaTypeAdapter(TranspositionEncryptAdapter.class)
    public String getBrushName() {
        return brushName;
    }

    public void setBrushName(String brushName) {
        this.brushName = brushName;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
}
