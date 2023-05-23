package com.demo.basic_default_atributes;

public interface Employees {

  String name = "John";
  String email = "john@net.com";
  int id = 4598654;

  default void showAdmin() {
    System.out.printf("The principal admin is %s, with email: %s, and id: %d", name, email, id);
  }

  void showEmployeesDescription();
}
