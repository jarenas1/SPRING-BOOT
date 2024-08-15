package com.example.firstCrud.controllers;

import com.example.firstCrud.entities.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//INDICAMOS QUE ES UN CONTROLADOR, debemos usar este y no controler para poder asignar la ruta
@Controller
@ResponseBody
@RequestMapping("/users")
public class UserEntityController {

    //CREAMOS UN METODO CONTROLADOR
    @GetMapping("/{id}") //DECIMOS QUE SAQUE LA VARIABLE DE LA RUTA
    public String getUserById(@PathVariable Integer id){
        return "USUARIO "+id;
    }

    //POST SIGNIFICA QUE EN EL FRONT SE ESTA CREANDO UN USUARIO, POR LO QUE DEBEMOS NOSOTROS RECIBIR EL USUARIO
    @PostMapping("/create")
    public String postUser(@RequestBody UserEntity user){ //EL requestbody toma lo que se mando en el cuerpo y crea una instancia de la entidad user

        return user.toString(); //devuelve la instancia creada
    }

    @DeleteMapping("/delete")
    public String deleteUser(
            @RequestParam Integer id ){
        return String.format("El id eliminado fue "+ id);
    }
}
