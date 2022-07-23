package com.asbt;

import java.util.Scanner;

public class Square {
    int length;
    public Square (int length){
        this.length = length;
    }
    //Perimeter
    public int perimeter(){
        return 4 * length;
    }
    //Area
    public int area(){
        return length * length;
    }

}
