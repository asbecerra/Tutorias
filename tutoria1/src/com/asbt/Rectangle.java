package com.asbt;

public class Rectangle {
    int length;
    int width;
    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }
    //Perimeter
    public int perimeter(){
        return 2 * (length + width);
    }
    //Area
    public int area(){
        return width * length;
    }
}
