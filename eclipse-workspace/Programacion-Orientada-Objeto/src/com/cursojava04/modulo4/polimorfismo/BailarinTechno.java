package com.cursojava04.modulo4.polimorfismo;

public class BailarinTechno extends Bailarin{
    public BailarinTechno(String nombre, int edad) {
        super(nombre, edad);
    }
  
  @Override
    public void bailar(){
        System.out.println(toString() + "bailo arriba del cubo!!");
    }
}
