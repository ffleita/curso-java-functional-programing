/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.functional._14_optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ff
 */
public class OptionalsPropio {
    
    public static void main(String[] args) {
        
        List<String> names = getNames();
        if (names != null) {
          //Operamos con nombres  
        }
        
        Optional<List<String>> optionalNames = getOptionalNames();
        if (optionalNames.isPresent()) {
            //Operar con optionalNames
        }
        
        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));
        
        Optional<String> valuablePlayer = optionalValuablePlayer();
        
        String valuablePlayerName = valuablePlayer.orElseGet(() -> "No player");
    }
    
    static List<String> getNames() {
        List<String> list = new LinkedList<>();
        
        return Collections.emptyList();
    }
    
    static String mostValuablePlayer() {
        return null;
    }
    
    static int mostExpensiveItem() {
        return -1;
    }
    
    static Optional<List<String>> getOptionalNames() {
        List<String> namesList = new LinkedList<>();
        //Obtencion de nombres
        return Optional.of(namesList);
    }
    
    static Optional<String> optionalValuablePlayer() {
        //
        //return Optional.ofNullable()
        try {
            //accesos
            return Optional.of("Facu");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return Optional.empty();
    }
}
