package com.sipemandu.utspemrogramanbergerak.Model;

public class Restoran {
    private String namaResto;
    private String alamatResto;
    private String jenisMakanan;
    private String perkiraanHarga;
    private String rating;
    private String jamBuka;
    private String urlImg;

    public Restoran(String namaResto, String alamatResto, String jenisMakanan, String perkiraanHarga, String rating, String jamBuka, String urlImg) {
        this.namaResto = namaResto;
        this.alamatResto = alamatResto;
        this.jenisMakanan = jenisMakanan;
        this.perkiraanHarga = perkiraanHarga;
        this.rating = rating;
        this.jamBuka = jamBuka;
        this.urlImg = urlImg;
    }

    public String getNamaResto() {
        return namaResto;
    }

    public void setNamaResto(String namaResto) {
        this.namaResto = namaResto;
    }

    public String getAlamatResto() {
        return alamatResto;
    }

    public void setAlamatResto(String alamatResto) {
        this.alamatResto = alamatResto;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public String getPerkiraanHarga() {
        return perkiraanHarga;
    }

    public void setPerkiraanHarga(String perkiraanHarga) {
        this.perkiraanHarga = perkiraanHarga;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getJamBuka() {
        return jamBuka;
    }

    public void setJamBuka(String jamBuka) {
        this.jamBuka = jamBuka;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
