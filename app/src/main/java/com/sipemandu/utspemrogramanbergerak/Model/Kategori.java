package com.sipemandu.utspemrogramanbergerak.Model;

public class Kategori {
    private String judul;
    private String outlet;
    private String keterangan;
    private String url;

    public Kategori(String judul, String outlet, String keterangan, String url) {
        this.judul = judul;
        this.outlet = outlet;
        this.keterangan = keterangan;
        this.url = url;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getOutlet() {
        return outlet;
    }

    public void setOutlet(String outlet) {
        this.outlet = outlet;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
