/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 *
 * @author ff
 */
public class Sintaxis {

    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java", "Functional");
        
        cursos.forEach(curso -> System.out.println(curso));
    
        /* interfaz funcional que define el tipo de los dos parámetros de entrada
        y el tipo de la variable de salida */
        //BiFunction<Integer, Integer, Integer> s = (x, y) -> x * y;
        
        /* interfaz funcional que espera 0 parámetros de entrada y retorna el 2 */
        usarZero(() -> 2);
        
        usarPredicado(text -> text.isEmpty());
  
        usarBiFunction((x, y) -> x * y);
        
        usarBiFunction((x, y) -> {
            System.out.println("X: " + x + ", Y: " + y);
            return x - y;
        });
        
        usarNada(() -> {
            System.out.println("Hola padre");
        });
    }
    
    /* estos métodos static actuan como funciones "high order function" que actuan 
    con las funciones que le pasas como parámetros */
    static void usarZero(ZeroArgumentos zeroArgumentos) {
        
    }
    
    static void usarPredicado(Predicate<String> predicado) {
        
    }
    
    static void usarBiFunction(BiFunction<Integer, Integer, Integer> operacion) {
        
    }
    
    static void usarNada(OperarNada operarNada) {
        
    }
    
    @FunctionalInterface
    interface ZeroArgumentos {
        int get();
    }
    
    /*no recibe nada y no retorna nada*/
    @FunctionalInterface
    interface OperarNada{
        void nada();
    }
}
