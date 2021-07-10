package com.box;

public class Box {

    float length;
    float width;
    float height;

    public Box(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public boolean validate(float length, float width,float height){
        if(length < this.length && width < this.width && height < this.height ){
            return true;
        }
        return false;
    }
}
