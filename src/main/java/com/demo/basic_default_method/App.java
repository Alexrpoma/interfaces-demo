package com.demo.basic_default_method;

public class App {

  public static void main(String[] args) {
    Drawable drawable = new Draw();
    drawable.draw();
    drawable.print();

    System.out.println();
    Drawable drawable1 = new Draw2();
    drawable1.draw();
    drawable1.print();
  }
}
