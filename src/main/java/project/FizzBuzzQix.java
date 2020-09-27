package project;

import java.lang.management.BufferPoolMXBean;

public class FizzBuzzQix {


    String FIZZ = "Fizz";
    String BUZZ = "Buzz";
    String QIX = "Qix";
    //String FizzBuzzQix = "FizzBuzzQix";
    int nFizz = 3;
    int nBuzz = 5;
    int nQix = 7;

    public String interpret(Integer numberToInterpret) { //any number prefer 0 to infinite

        String result = "";

        if( (numberToInterpret % nFizz == 0) && (numberToInterpret % nBuzz == 0) && (numberToInterpret % nQix == 0) ){ //if FizzBuzzQix
            result = FIZZ + BUZZ + QIX;

        }else if(numberToInterpret % nFizz == 0) { //if Fizz
            result = FIZZ;
        }else if( numberToInterpret % nBuzz == 0){ //if Buzz
            result = BUZZ;
        }else if(numberToInterpret % nQix == 0) { //if Qix
            result = QIX;
        }
        else{
            result = numberToInterpret.toString();
        }

        return result;

    }

    public void printInterpreter(){
        for(int i=1; i<=115; i++){
            System.out.println( interpret(i) );
        }
    }


    }




















