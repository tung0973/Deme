package com.exemple.demo10;

public class Rectangle extends GeometricObject {
    private double width ;
    private double height ;

    public Rectangle(){

    }


    public double getArea() {
        return width * height;
    }


    public double getPerimeter() {
        return 2*(width + height);
    }

    public Rectangle(double width , double height){
        this.width = width ;
        this.height= height ;
    }

    public double getHeight(){
        return this.height;
    }
    public void setHeight(double value){
        this.height=value;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double value){
        this.width=value;
    }
}
