package com.sipemandu.utspemrogramanbergerak;

import com.sipemandu.utspemrogramanbergerak.Model.Kategori;
import com.sipemandu.utspemrogramanbergerak.Model.Restoran;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Kategori> createKategoriList() {
        List<Kategori> kategori = new ArrayList<>();
        kategori.add(new Kategori(
                "Terpopuler Minggu Ini","8 Outlet, Disimpan 15118 kali","Restoran terpopuler di kotamu minggu ini",
                "https://cdn.moneysmart.id/wp-content/uploads/2018/12/08181221/Makanan-ini-paling-pas-disantap-saat-musim-hujan-turun-700x497.jpg"
        ));
        kategori.add(new Kategori(
                "Sarapan Pagi","6 Outlet, Disimpan 3556 kali","Sajian sarapan nikamt untuk memulai harimu dengan semangat",
                "https://cdn.idntimes.com/content-images/post/20171218/openrice-62a2451c4c897b7f53367007651525c2_600x400.jpg"
        ));
        kategori.add(new Kategori(
                "Jajanan Malam","8 Outlet, Disimpan 5118 kali","Karena lapar bisa datang kapan saja",
                "https://s.republika.co.id/uploads/images/inpicture_slide/makanan-italia-piza-merupakan-makanan-italia-yang-ada-di-_190313085617-433.jpg"
        ));
        kategori.add(new Kategori(
                "Terpopuler Minggu Ini","8 Outlet, Disimpan 15118 kali","Restoran terpopuler di kotamu minggu ini",
                "https://cdn.moneysmart.id/wp-content/uploads/2018/12/08181221/Makanan-ini-paling-pas-disantap-saat-musim-hujan-turun-700x497.jpg"
        ));
        kategori.add(new Kategori(
                "Sarapan Pagi","6 Outlet, Disimpan 3556 kali","Sajian sarapan nikamt untuk memulai harimu dengan semangat",
                "https://cdn.idntimes.com/content-images/post/20171218/openrice-62a2451c4c897b7f53367007651525c2_600x400.jpg"
        ));
        kategori.add(new Kategori(
                "Jajanan Malam","8 Outlet, Disimpan 5118 kali","Karena lapar bisa datang kapan saja",
                "https://s.republika.co.id/uploads/images/inpicture_slide/makanan-italia-piza-merupakan-makanan-italia-yang-ada-di-_190313085617-433.jpg"
        ));
        return kategori;
    }

    public static List<Restoran> createRestoranList() {
        List<Restoran> restoran = new ArrayList<>();
        restoran.add(new Restoran("Sushi Tomi",
                "Mountain View",
                "Sushi,Jepang",
                "$30 untuk dua (approx.)",
                "3.2",
                "Buka besok pada 5:30am",
                "https://www.julieslifestyle.com/src/Frontend/Files/blog/images/968x560/mushroom-avocado-sushi-rolls-vegan-gluten-free-inspiration-anett-velsberg-en-662.jpg"
        ));
        restoran.add(new Restoran("Specialty's",
                "Mountain View",
                "Kafe, kue & Roti",
                "$25 untuk dua (approx.)",
                "3.9",
                "Buka besok pada 6:00am",
                "http://www.savorcalifornia.com/images/home_food_04.jpg"
        ));
        restoran.add(new Restoran("Shana Thai",
                "Mountain View",
                "Thai",
                "$50 untuk dua (approx.)",
                "2.2",
                "Buka besok pada 5:30am",
                "https://cdn.vox-cdn.com/thumbor/C_d6_k2nBdHdrhh1UrFwAXKKP2c=/0x0:2000x1335/1200x900/filters:focal(963x482:1283x802)/cdn.vox-cdn.com/uploads/chorus_image/image/56240539/2018_05_07_NoreeThai_025.1502992730.jpg"

        ));
        restoran.add(new Restoran("Pizza's",
                "Depok, Margonda",
                "Pizza",
                "$25 untuk dua (approx.)",
                "3.0",
                "Buka besok pada 6:00am",
                "https://media-cdn.tripadvisor.com/media/photo-s/15/c5/a4/14/pepperoni-lovers.jpg"
        ));
        restoran.add(new Restoran("Sushi Tomi",
                "Mountain View",
                "Sushi,Jepang",
                "$30 untuk dua (approx.)",
                "3.2",
                "Buka besok pada 5:30am",
                "https://www.julieslifestyle.com/src/Frontend/Files/blog/images/968x560/mushroom-avocado-sushi-rolls-vegan-gluten-free-inspiration-anett-velsberg-en-662.jpg"
        ));
        restoran.add(new Restoran("Specialty's",
                "Mountain View",
                "Kafe, kue & Roti",
                "$25 untuk dua (approx.)",
                "3.9",
                "Buka besok pada 6:00am",
                "http://www.savorcalifornia.com/images/home_food_04.jpg"
        ));
        restoran.add(new Restoran("Shana Thai",
                "Mountain View",
                "Thai",
                "$50 untuk dua (approx.)",
                "2.2",
                "Buka besok pada 5:30am",
                "https://cdn.vox-cdn.com/thumbor/C_d6_k2nBdHdrhh1UrFwAXKKP2c=/0x0:2000x1335/1200x900/filters:focal(963x482:1283x802)/cdn.vox-cdn.com/uploads/chorus_image/image/56240539/2018_05_07_NoreeThai_025.1502992730.jpg"

        ));
        restoran.add(new Restoran("Pizza's",
                "Depok, Margonda",
                "Pizza",
                "$25 untuk dua (approx.)",
                "3.0",
                "Buka besok pada 6:00am",
                "https://media-cdn.tripadvisor.com/media/photo-s/15/c5/a4/14/pepperoni-lovers.jpg"
        ));
        return restoran;
    }
}
