package com.bprats;


public class mascota {


    private String name;
    private String votos;
    private int image;

    public mascota(int image, String name, String votos) {
        this.image = image;
        this.name = name;
        this.votos = votos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVotos() {
        return votos;
    }

    public void setVotos(String votos) {
        this.votos = votos;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

