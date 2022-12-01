package com.example.demo.model;

public class jogo {
    private String nome;
    private String categoria;
    private String ano;
    private String img;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public jogo(String nome, String categoria, String ano, String img){
        this.nome = nome;
        this.categoria = categoria;
        this.ano = ano;
        this.img = img;
    }
}
