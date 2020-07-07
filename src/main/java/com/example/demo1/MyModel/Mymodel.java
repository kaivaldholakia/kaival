package com.example.demo1.MyModel;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mymodel {

    @Id
    private int a;
    private String b;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Mymodel() {

    }

    public Mymodel(int a, String b) {
        this.a = a;
        this.b = b;
    }
}
