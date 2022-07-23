package com.asbt;

public class Triangle {
    int height;
    int base;
    int l1;
    int l2;

    public Triangle(int height, int base , int l1, int l2) {
        this.height = height;
        this.base = base;
        this.l1 = l2;
        this.l1 = l2;

    }
    //Perimeter i triangle
    public int perimeter(){
        return (l1 + l2 + base) ;
    }
    //Area
    public int area(){
        return (base * height) / 2;
    }
}
