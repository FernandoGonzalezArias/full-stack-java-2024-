package com.cursojava04.modulo4.polimorfismo;

public class BailarinBallet extends Bailarin {
    public BailarinBallet(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void bailar(){
        System.out.println(toString()+" bailo con elegancia");
    }
}
