package com.rastreioescolar.front.controller;

import com.Rastreamento_escolar_back_end.back.model.Usuario;
import com.Rastreamento_escolar_back_end.back.repository.EstudanteRepository;
import com.Rastreamento_escolar_back_end.back.service.EstudanteService;
import com.Rastreamento_escolar_back_end.back.service.TokenService;
import com.rastreioescolar.front.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/estudantes")
public class Estudante {

    @Autowired
    private EstudanteRepository repo;

    @Autowired
    private ApiService service;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/registrar")
    public String cadastrarEstudante(@RequestHeader("Authorization") String auth,@RequestBody com.Rastreamento_escolar_back_end.back.model.Estudante estudante){
        Usuario usuarioLogado = tokenService.extrairClaim(auth.replace("Bearer ", ""));
        service.novoEstudante();//estudante
        return "Estudante cadastrado com sucesso!";
    }


    @GetMapping("/estatisticas")
    public Map<String, Long> estatisticas(){
        Map<String, Long> map = new HashMap<>();
        for(Object[] row : repo.contarPorStatus()){
            map.put(row[0].toString(), ((Number)row[1]).longValue());
        }
        return map;
    }


    @PostMapping("/listar")
    public List<Estudante listarEstudantes(@RequestHeader("Authorization") String auth,@RequestBody Estudante estudante){
        Usuario usuarioLogado = tokenService.extrairClaim(auth.replace("Bearer ", ""));
        service.novoEstudante();

        return service.listarEstudantes;
    }

}
