package EJERCICIO31;

import javax.naming.CommunicationException;

public class EJERCICIO31 {

	

	public static void main(String[] args) {
		// Escribe una funci�n �ConcatenaArraysPro� a la que le pasas dos 
		// arrays de enteros y te devuelve un array cuyo tama�o es la suma del 
		// tama�o de ambos y que contiene todos los elementos del primero y a continuaci�n los del segundo. 
		// Esta funci�n devolver� un array de enteros (int[]) el cu�l se crear� dentro 
		// de la propia funci�n.
		
		
		int [] array1={2,4,6,8};
		int [] array2={3,5,7};
		int [] arrayzeta =concatenarArrays(array1,array2);
		int i=0;
		for (i=0;i<arrayzeta.length;i++){
			System.out.print(arrayzeta[i]+" ");	
		}	


	}
	public static int[] concatenarArrays(int[] arrayuno, int[]arraydos){
		int [] arraytres=new int [arrayuno.length+arraydos.length];
		
		System.arraycopy(arrayuno,0,arraytres,0,arrayuno.length);
		System.arraycopy(arraydos, 0, arraytres, arrayuno.length, arraydos.length);
		return arraytres;
	}
}
	



