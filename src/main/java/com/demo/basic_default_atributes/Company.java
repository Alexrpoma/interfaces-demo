package com.demo.basic_default_atributes;

public class Company implements Employees{
  @Override
  public void showEmployeesDescription() {
    System.out.printf("""
      This company is the best in the world!
      and its admin is %s
      """, name);
  }
}
