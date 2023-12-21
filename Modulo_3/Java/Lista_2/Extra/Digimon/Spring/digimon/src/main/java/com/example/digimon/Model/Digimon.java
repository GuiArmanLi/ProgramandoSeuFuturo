package com.example.digimon.Model;

public class Digimon {
    private String name;
    private String img;
    private String level;

    public Digimon() {
    }

    public Digimon(String name, String img, String level) {
        this.name = name;
        this.img = img;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Digimon [name=" + name + ", img=" + img + ", level=" + level + "]";
    }
}
