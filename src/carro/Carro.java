package carro;

import maquinaria.IMaquinaria;

public abstract class Carro implements IMaquinaria {
	
	//immutable
   public final void print() {
	   System.out.println(tipo());
   }
   
}
