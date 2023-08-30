package com.example.ecommerce.model;

public class Cosmetico {
    private int id;
    private String nome;
    private double preco;
    private String image;

    public Cosmetico() {
    }

    public Cosmetico(int id, String nome, double preco, String image) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
