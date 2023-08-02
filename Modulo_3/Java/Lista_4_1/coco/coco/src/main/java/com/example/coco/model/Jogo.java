package com.example.coco.model;

public class Jogo {
    int _id;
    String name;
    int price;

    public Jogo(){}
    public Jogo(int _id, String name, int price) {
        this._id = _id;
        this.name = name;
        this.price = price;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
