package com.demo.implementation;

public class App {

  public static void main(String[] args) {
    Shape rectangle = new Rectangle(12, 10);
    rectangle.draw();
    rectangle.fill();
    System.out.println(rectangle.calculateArea());
    rectangle.infoShape("Rectangle");
  }
}
