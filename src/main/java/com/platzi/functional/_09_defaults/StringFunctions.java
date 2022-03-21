/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.functional._09_defaults;

/**
 *
 * @author ff
 */
public class StringFunctions {
    
    @FunctionalInterface
    interface StringOperation {
        int getAmount();
        
        default void operate(String text){
            
            int x = getAmount();
            while(x-- > 0)
                System.out.println(text);
        }
    }
    
    @FunctionalInterface
    interface DoOperation {
        void take(String text);
        
        default void execute(int x, String text) {
            while(x-- > 0)
                take(text);
        }
    }
    
    public static void main(String[] args) {
        StringOperation six = () -> 6;
        six.operate("Alumno");
        
        /* declaro la funcion operateFive y le paso la implementación con la funcion lambda*/
        DoOperation operateFive = text -> System.out.println(text);
        /* llamo al método default de la interface */
        operateFive.execute(5, "Alumnardo");
    }
}
