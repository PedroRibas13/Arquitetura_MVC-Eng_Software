package com.example.demo.controller;
import com.example.demo.model.jogo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/jogos")
public class jogoApiController {

    private static final List<jogo> jogos = new ArrayList<jogo>();

    public jogoApiController(){
        jogos.add(new jogo("Dark Souls 1","Souls-like","2009","img/ds1.png"));
        jogos.add(new jogo("Dark Souls 2","Souls-like","2009", "img/ds2.png"));
        jogos.add(new jogo("Dark Souls 3","Souls-like","2009", "img/ds2_2.png"));
        jogos.add(new jogo("Dark Souls 2 II Dois","Souls-like","2009", "img/ds3.png"));
    }

    @GetMapping
    public List<jogo> getJogos(){
        return jogos;
    }
}
