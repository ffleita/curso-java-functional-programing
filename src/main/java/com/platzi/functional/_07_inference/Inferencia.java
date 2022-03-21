package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NombresUtils;
import java.util.List;
import java.util.function.Function;

public class Inferencia {

    public static void main(String[] args) {
        
        Function <Integer, String> funcionConvertidora = 
                integer -> "Al doble: " + (integer * 2);
        List<String> NombreUtil;
    
        List<String> alumnos = NombresUtils.getList("Hugo", "Paco", "Luis");
        
        /* Java en tiempo de compilación infiere el tipo de variable que es
        "name" (como se está aplicando sobre la lista "alumnos" que está
        definida como una lista de String, infirer que "name" es un tipo String.) */
        alumnos.forEach(name -> System.out.println(name));
    }
}
