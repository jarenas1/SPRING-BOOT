package com.riwi;

import com.riwi.dependencies.ServiceEnvio;
import com.riwi.dependencies.ServicioPdf;

public class ServicioImpresion {

//    public void imprimir(){  ESTA ES LA FORMA CLASICA DE HACERLO, PERO VAMOS A HACERLO CON LA INYECCION DE DEPENDENCIAS,
    // DONDE VAMOS A CREAR UNA DEPENDENCIA PARA CADA UNO DE LOS SOUTS PARA INYECTARLOS A ESTE METODO (SEPARACION DE RESPONSABILIDADES)
//        System.out.println("Enviando documento a imprimir");
//        System.out.println("Imprimiento en pdf");
//    }

    //SE CREARON 2 CLASES EN EL PACKAGE DEPENDENCIES, ESTAS CONTIENEN METODOS QUE VAN A COMPLETAR ESTE METODO, ES DECIR QUE ESTE METODO DEPENDE DE 2 CLASES

    //inyectamos las dependencias por medio de un constructor(una dependencia es una instancia que nos permite acceder a los metodos de la clase)
    //TENER EN CUENTA QUE EN SPRINGBOOT SE HACE CON UNA ANOTACION Y NO CON UN CONSTRUCTOR
    //INSTANCIAMOS LAS DEPENDENCIAS
   ServiceEnvio serviceEnvio;
   ServicioPdf servicioPdf;

    //CREAMOS EL CONSTRUCTOR CON LAS DEPENDENCIAS:


    public ServicioImpresion(ServiceEnvio serviceEnvio, ServicioPdf servicioPdf) {
        this.serviceEnvio = new ServiceEnvio(); //= serviceEnvio; cambiamos esto ya que queremos que se llame al constructor UNA SOLA VEZ
        this.servicioPdf = new ServicioPdf();
    }

    //AHORA ACCEDEMOS A LOS METODOS DE LAS DEPENDENCIAS
    public void imprimir(){
        servicioPdf.pdf();
        serviceEnvio.enviando();
    }
}
