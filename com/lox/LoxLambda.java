package com.lox;

import java.util.List;

public class LoxLambda implements LoxCallable {

  private final List<Token> params;
  private final List<Stmt> body;
  private final Environment clojure;

  LoxLambda(Stmt.Lambda declaration, Environment clojure) {
    this.params = declaration.params;
    this.body = declaration.body;
    this.clojure = clojure;
  }

  LoxLambda(Expr.Lambda declaration, Environment clojure) {
    this.params = declaration.params;
    this.body = declaration.body;
    this.clojure = clojure;
  }

  @Override
  public int arity() {
    return params.size();
  }

  @Override
  public String toString() {
    return "<anonymous fn >";
  }

  @Override
  public Object call(Interpreter interpreter, List<Object> arguments) {
    Environment environment = new Environment(clojure);
    for (int i = 0; i < params.size(); i++) {
      environment.define(params.get(i).lexeme, arguments.get(i));
    }

    try {
      interpreter.executeBlock(body, environment);
    } catch (Return returnValue) {
      return returnValue.value;
    }
    return null;
  }
}
