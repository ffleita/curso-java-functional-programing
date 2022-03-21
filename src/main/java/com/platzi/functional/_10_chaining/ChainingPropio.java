/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.functional._10_chaining;

/**
 *
 * @author ff
 */
public class ChainingPropio {

    public static void main(String[] args) {
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hola")
                .append("alumno")
                .append("flei");
        System.out.println(stringBuilder);
        
        Chainer chainer = new Chainer();
        chainer.sayHi().sayBye();
    }
    
    static class Chainer {
        
        public Chainer sayHi() {
            System.out.println("Hola");
            return this;
        }
        
        public Chainer sayBye() {
            System.out.println("Bye");
            return this;
        }
    }
}
