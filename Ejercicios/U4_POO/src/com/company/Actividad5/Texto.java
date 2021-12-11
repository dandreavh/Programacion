package com.company.Actividad5;

public class Texto {
    // Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:
    //-La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor.
    //-Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio disponible.
    //-Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se rebase el tamaño máximo establecido.
    //-Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.

    // ATRIBUTOS ******************************************************************************************
    private String texto;
    private int LongMax;

    // MÉTODOS ********************************************************************************************

    // ************ CONSTRUCTORES **************************************************************************

    public Texto(String texto, int longMax) {
        this.texto = texto;
        LongMax = longMax;
    }

    public Texto(String texto) {
        this.texto = texto;
    }

    public Texto(int longMax) {
        LongMax = longMax;
    }

    // ************ TOSTRING ********************************************************************************

}
