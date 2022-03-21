package com.platzi.functional._05_sam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.function.Function;

public class AgeUtils {

    public static void main(String[] args) {

        Function<Integer, String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);
        
        //obtengo fecha parseando los datos
        TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate.parse(year + "-" + addCeros.apply(month) +"-" + addCeros.apply(day));
        
        TriFunction<Integer, Integer, Integer, Integer> calculateAge =
                (day, month, year) -> Period.between(
                        parseDate.apply(day, month, year), LocalDate.now())
                        .getYears();
        
        System.out.println(calculateAge.apply(24, 06, 1996));
    }
    
    //SAM single abstract method
    //@FunctionalInterface
    //interface BiConsumer {
    //    void accept();
    //}

    /* Definimos un SAM que espera 4 parámetros genéricos
    retorna R y espera T, U, V como parámetros de apply()*/
    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
