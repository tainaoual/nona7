package project;

public class FizzBuzzQix {
    private String StringToInterpret;
    String Fizz = "Fizz";
    String Buzz = "Buzz";
    String Qix = "Qix";
    String FizzBuzzQix = "FizzBuzzQix";



    public String interpret(int numberToInterpret) {

        if (numberToInterpret % 3 == 0) {

            return "Fizz";

        } else if (numberToInterpret % 5 == 0) {

            return "Buzz";
            //  }else{
            //     return null;
            // }
        }else if (numberToInterpret % 7 == 0 ){
            return "Qix";
        }else if (numberToInterpret == 105){
            return  "FizzBuzzQix";
        }
        return null;
    }}
//}num
//berToInterpret % 3 &&numberToInterpret % 5 == 0 && numberToInterpret % 7 == 0



//    Given This week we are changing things up, we are only giving you one test, you have to write the rest on your own. We are taking the old Fizz Buzz kata out for a ride, but we are adding a new feature to develop: Qix. The functionality you must test out for FizzBuzzQix is as follows:

      //  Given an integer, return a String representation of that integer: 1 -> "1" and 2 -> "2" for example.
      //  Given an integer that is a multiple of 3, return a String that contains the word "Fizz".
     //   Given an integer that is a multiple of 5, return a String that contains the word "Buzz".
      //  an integer that is a multiple of 7, return a String that contains the word "Qix".
      //  If multiple words are used, add them in order of Fizz, Buzz, then Qix. For example: 105 -> FizzBuzzQix















