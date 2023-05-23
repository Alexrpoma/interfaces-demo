package com.demo.basic_default_method;

public interface Drawable {

  void draw();

  default void print() {
    System.out.println("Printing...");
  }
}
