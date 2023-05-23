package com.demo.basic_default_method;

public class Draw2 implements Drawable{
  @Override
  public void draw() {
    System.out.println("This is not default method.");
  }

  @Override
  public void print() {
    System.out.println("Default print method overwrite");
  }
}
