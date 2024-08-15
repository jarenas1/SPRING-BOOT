package com.riwi;

import com.riwi.dependencies.ServiceEnvio;
import com.riwi.dependencies.ServicioPdf;

public class Main {
    public static void main(String[] args) {

    //PARA LLAMAR LA INSTANCIA DE IMPRESION, PARA PODER VER LO QUE TIENE DENTRO
        //USAMOS EL CONSTRUCTOR QUE RECIBE LOS 2 PARAMETROS QUE SON LOS CONSTRUCTORES DE LAS DEPENDENCIAS
        ServicioImpresion servicioImpresion = new ServicioImpresion(new ServiceEnvio(), new ServicioPdf());

        //Llamamos al metodo por medio del constructor

        servicioImpresion.imprimir();
    }
}