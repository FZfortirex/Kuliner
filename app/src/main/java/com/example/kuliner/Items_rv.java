package com.example.kuliner;

public class Items_rv {
    String name;
    String tipe;
    String image;
    String deskripsi;

    public Items_rv(String name, String tipe, String image, String deskripsi) {
        this.name = name;
        this.tipe = tipe;
        this.image = image;
        this.deskripsi = deskripsi;
    }

    public String getName() {
        return name;
    }

    public String getTipe() {
        return tipe;
    }

    public String getImage() {
        return image;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
