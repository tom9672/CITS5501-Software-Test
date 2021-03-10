package com.cn.zlm;


/**
  * on two numbers it holds.
  */
public class Calculator {

  // first number
  private int num1;

  // second number
  private int num2;

  public Calculator(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  /**
    * Adds the numbers held by the Calculator object, and
    * returns the result.
    *
    * @return The sum of the numbers held by the Calculator
    * object.
    */
  public int add() {
    return num1 + num2;
  }

  /**
    * Subtracts the second number held by the calculator
    * from the first, and returns the result.
    *
    * If the result is negative, an ArithmeticException
    * is thrown.
    *
    * @return The sum of the numbers held by the Calculator
    * object.
    */
  public int subtract() {
    return num1 - num2;
  }

  public int subtract_noNeg(){
    if(num1 > num2){
      throw new ArithmeticException("subtract_noNeg can not return a negative vlaue");
    }
    return num1 -num2;
  }

  public int multiply() {
    return num1 * num2;
  }
}
