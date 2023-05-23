package com.demo.implementation;

public interface Shape {

  void draw();

  default void fill() {
    System.out.println("The draw is filling...");
  }

  int calculateArea();

  private void showDetails(String shape) {
    System.out.printf("Shape %s detail.\n", shape);
  }

  private String getColor() {
    return "red";
  }

  static void showShapeInfo(String shape) {
    System.out.println("This is an interface for represent forms.");
  }

  default void infoShape(String shape){
    showDetails(shape);
    System.out.println("The color is " + getColor());
    showShapeInfo(shape);
  }
}
