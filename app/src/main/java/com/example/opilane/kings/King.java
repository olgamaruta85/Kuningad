package com.example.opilane.kings;

public class King {
    //simple model class that will become our data source
    private String name;
    private int from, to;

    //constructor ALT+INSERT


    public King(String names, int from, int to) {
        this.name = names;
        this.from = from;
        this.to = to;
    }
    //getter

    public String getNames() {
        return name;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
    //toString method that will return tha value for each object in the listview containers

    public String toString(){
        return name;
    }

}
