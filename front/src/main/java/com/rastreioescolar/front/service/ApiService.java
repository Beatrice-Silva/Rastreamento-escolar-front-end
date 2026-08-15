package com.rastreioescolar.front.service;


import com.rastreioescolar.front.model.Estudante;
import com.rastreioescolar.front.model.UserRequestDTO;
import com.rastreioescolar.front.model.Usuario;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {



    private final RestTemplate rest = new RestTemplate();
    private final String BASE = "http://localhost:8000";

    private HttpHeaders headers(String token){
        HttpHeaders h = new HttpHeaders();
        h.setBearerAuth(token.replace("Bearer",""));
        h.setContentType(MediaType.APPLICATION_JSON);
        return h;
    }


    public String login(UserRequestDTO cred){
        ResponseEntity<String> res = rest.postForEntity(BASE + "/api/auth/logar", cred, String.class);
        return res.getBody();
    }

    public String registrar(Usuario user){
        String url = "http://localhost:8000/api/auth/registrar";
        try {
            return rest.postForEntity(url, user, String.class).getBody();
        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public void novoEstudante(Long lojaId, Estudante estudante, String token){
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        HttpEntity<Estudante> entity = new HttpEntity<> (estudante,headers);
        rest.postForObject(BASE + "/api/auth/" + estudante + "/estudante", entity, String.class);
    }


    public void registrar(com.Rastreamento_escolar_back_end.back.model.Usuario usuario) {
    }

    public List<Estudante> listarEstudantes(String token){
        HttpHeaders h = new HttpHeaders();
        h.setBearerAuth(token);
        var entity = new HttpEntity<Void>(h);
        var res = rest.exchange(BASE + "api/estudantes", HttpMethod.GET, entity, new ParameterizedTypeReference<List<Estudante>>() {
        });
        return res.getBody();



    }

}
