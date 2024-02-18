package com.lox;

public class Variable {
  final Token name;
  boolean defined;
  boolean used;

  public Variable(Token name) {
    this.name = name;
    this.defined = false;
    this.used = false;
  }
}
