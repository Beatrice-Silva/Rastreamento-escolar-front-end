package com.rastreioescolar.front.controller;

import com.Rastreamento_escolar_back_end.back.model.Usuario;
import com.Rastreamento_escolar_back_end.back.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping("/registrar")
    public String registrar(@RequestBody Usuario user) {
        service.registrar(user);
        return "Cadastro feito com sucesso!";
    }

    @PostMapping("/logar")
    public String login(@RequestBody Map<String,String> user) {
        return service.login(user.get("email"), user.get("senha"));
    }

}
