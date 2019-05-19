package com.company;

public abstract class Component {


    protected String title;

    public Component(String name){

        this.title =name;
    }
    public abstract void print();
}
