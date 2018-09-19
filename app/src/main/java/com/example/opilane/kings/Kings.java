package com.example.opilane.kings;

import java.util.ArrayList;
import java.util.List;

public class Kings {
    //second part of the data resource, the class Kings makes King objects avaliable

    //creating list
    private List<King> list = new ArrayList<>();

    //our multidementional array that has our data values

    private static final String[][] data = {
            {"Henry VIII", "1509", "1547"},
            {"Edward VI", "1547", "1553"},
            {"Mary I", "1553", "1558"},
            {"Elisabeth", "1558", "1603"},
            {"James I", "1603", "1625"},
            {"Charles I", "1625", "1649"}

                };
    // adding multidemensional array values into the list
    public Kings (){
        for (String[] arr: data)
            list.add(new King(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
    }
    public List<King> getKings(){
        return list;
    }
}
