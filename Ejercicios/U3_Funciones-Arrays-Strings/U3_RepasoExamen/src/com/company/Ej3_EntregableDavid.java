package com.company;

import java.util.Arrays;

public class Ej3_EntregableDavid {
    public static void main(String[] args) {
        int [] listado = {12,8,182,58,83,45,10};

        System.out.println("Solo con número que tienen 8: " + Arrays.toString(filtraCon8(listado)));
    }
    public static int[] filtraCon8(int x[]){
        int [] resultado = new int[0];
        int num;
        for (int i = 0; i < x.length; i++) {
            num = x[i];
            if (tiene8(num)){
                resultado = Arrays.copyOf(resultado, resultado.length+1);
                resultado[resultado.length-1] = num;
            }
        }
        return resultado;
    }
    public  static boolean tiene8(int num){
        int cifra;

        while (num>0){
            cifra = num%10;
            if(cifra==8){
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
