package com.riwi.thymeleaf1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //INDICAMOS QUE ESTA CLASE ES UN CONTROLADOR(RECIBE PETICIONES DE LA VISTA Y DEVUELVE ALGO)
public class HiController {

    //METODO QUE NO TIENE PARAMETROS DE HTML DINAMICOS
    //@GetMapping("/hi") //indicamos que es una peticion de get con la ruta tal
    //public String hola(){
        //return "hi" ; //este es un metodo que va a interactuar con hi.html ubicado en templates, y DEBE devolver
                      //el nombre del html al que hace referencia, en este caso "hi"
   // }

    @GetMapping("/hi")
    public String hi(@RequestParam(name = "name", required = false, defaultValue = "Juanchito") //DECIMOS QUE SE VA A RECIBIR UN PARAMETRO LLAMADO NAME
                     String name, Model model){ //DECIMOS QUE EL METODO RECIBE UN NOMBRE Y UN MODELO
        model.addAttribute("name", name); //LE ASIGNAMOS AL MODELO EL NAME
        return "hi";

    }
}
