package EJERCICIO32;

import java.util.Arrays;

public class EJERCICIO32 {

	public static void main(String[] args) {
		// Escribe una función “CopiaArrayPro” a la que le pasas un array y te devuelve un array
		// del mismo tamaño y con los mismos datos.
		
		int[] arreglito ={0,1,1,2,3,5,8};
		int[] arreglitocopiado=CopiaArray(arreglito);
		
		for (int i=0; i<arreglitocopiado.length;i++){
			System.out.print(arreglitocopiado[i]+" ");
		}
		

	}
	public static int[] CopiaArray(int[] arreglito){
		int[] array=Arrays.copyOf(arreglito, arreglito.length);
		return array;
	}

}
