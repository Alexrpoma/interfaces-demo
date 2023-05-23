package com.demo.implementation;

public class Rectangle implements Shape{

  private final int height;
  private final int weight;

  public Rectangle(int height, int weight) {
    this.height = height;
    this.weight = weight;
  }

  @Override
  public void draw() {
    System.out.println("Drawing rectangle..");
  }

  @Override
  public int calculateArea() {
    return height * weight;
  }

}
