package com.example.refaldiday06;

public class Hero {
    private final String nama;
    private final String lane;
    private final String role;
    private final String foto;

    public Hero(String nama, String lane, String role, String foto) {
        this.nama = nama;
        this.lane = lane;
        this.role = role;
        this.foto = foto;
    }

    public String getLane() { return lane; }

    public String getNama() {
        return nama;
    }

    public String getRole() {
        return role;
    }

    public String getFoto() {
        return foto;
    }

}
