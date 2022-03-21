package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {

    public static void main(String[] args) {
        List<String> profesores = getList("Nicolas", "Juan", "Zulema");
        
        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);
 
        System.out.println("//////////////////");
        
        /* el método que estemos referenciando debe consumir el mismo tipo de datos y
        retornar el mismo tipo de dato que el tipo de funcion que espera lo que estemos
        codificando*/
        profesores.forEach(System.out::println);
    }
    
    public static <T> List<T> getList (T... elements) {
        return Arrays.asList(elements);
    }
}
