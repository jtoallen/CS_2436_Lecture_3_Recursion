//Lecture 3 on Recursion
//27 January 2021

import java.util.*;

public class Main {



    public static void main(String[] args) {

//        System.out.println("your string in reverse is " + recurse(string1));

        int n = 1000;
        for (int i = 1; i <=n; i++) {
//            wasteTime();
        }
    }

//    public static void wasteTime(){
//    for (long i = 1; i <= 1000000000; i++){
////    try
//    }
//    }
//}

    public static String recurse(String name)
//            use string methods from chapter 3
    {
        String string1 = "buy gamestop stock";
//        get last character. append last character
//        use .length method for string1
//        use substring method with range to get last
//        chapter 3. string methods.
        if (string1.isEmpty()) {

        }

        return string1.substring(string1() - 1) + recurse(), string1.length())
        + recurse(string1.substring(0, string1.length() -1);
    }

}

//Big O Notation: How many times does a function loop.
