package com.example.demo.controller;
import com.example.demo.model.jogo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/jogo")
public class jogoController {

    private static final List<jogo> jogos = new ArrayList<jogo>();

    public jogoController(){
        jogos.add(new jogo("Dark Souls 1","Souls-like","2011","img/ds1.png"));
        jogos.add(new jogo("Dark Souls 2","Souls-like","2014", "img/ds2.png"));
        jogos.add(new jogo("Dark Souls 3","Souls-like","2016", "img/ds2_2.png"));
        jogos.add(new jogo("Dark Souls 2 II Dois","Souls-like","2015", "img/ds3.png"));
    }

    @GetMapping
    public String getJogos(Model model){
        model.addAttribute("jogos", jogos);
        return "jogos";
    }
}
