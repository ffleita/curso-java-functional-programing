/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.functional._11_composition;

import java.util.function.Function;

/**
 *
 * @author ff
 */
public class MathOperations2 {
    
    public static void main(String[] args) {
        
        Function<Integer, Integer> multiplyBy3 = x -> {
                System.out.println("Multiplicando: " + x + " por 3");
                return x * 3;
        };
        
        /* .compose toma una función, la ejecuta y luego ejecuta la funcion sobre la cual
        fue llamado, en este caso multiplyBy3 */
        Function<Integer, Integer> add1MultiplyBy3 =
                multiplyBy3.compose(y -> {
                    System.out.println("Agregando 1 a: " + y);
                    return y + 1;
                });
        
        Function<Integer, Integer> andSquare = 
                add1MultiplyBy3.andThen(x -> {
                    System.out.println("Estoy elevando " + x + " al cuadrado");
                    return x * x;
                });
        
        System.out.println(
                add1MultiplyBy3.apply(5)
        );
        
        System.out.println("//////////////////");
        
        System.out.println( andSquare.apply(3));
    }
}
