package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
//import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {
        
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";
        
        System.out.println(quote.apply("Hola Estudiante de ingenier�a!!"));
        System.out.println(addMark.apply("Hola"));
        
        //BiFunction<Integer, Integer, Integer> multiplicacion =
        //        (x, y) -> x * y;
        // BinaryOperator<Integer> multiplicacion2 =
        //        (x, y) -> x * y;
        
        BiFunction<String, Integer, String> leftPad =
                (text, number) -> String.format("%" + number + "S", text);
        
        System.out.println(leftPad.apply("Java", 10));
    }
}
