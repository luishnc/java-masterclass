package com.luis;

public class SimpleCalculator {
    private double firstNumber = 0;
    private double secondNumber = 0;

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult(){
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult(){
        return getFirstNumber() * getSecondNumber();
    }


    public double getDivisionResult(){

        return getSecondNumber() == 0 ? 0 : getFirstNumber() / getSecondNumber();//getFirstNumber() / getSecondNumber()
    }


}
