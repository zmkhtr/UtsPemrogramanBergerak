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

    public static List<Restoran> createRestoranMingguIniList() {
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
                "https://cdn-images-1.medium.com/max/1600/1*Yz0eEkG9NEPim-knbg5w1g.jpeg"
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
                "https://cdn-images-1.medium.com/max/1600/1*Yz0eEkG9NEPim-knbg5w1g.jpeg"
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

    public static List<Restoran> createRestoranSarapanPagiList() {
        List<Restoran> restoran = new ArrayList<>();
        restoran.add(new Restoran("Bubur Ayam Enak Tau",
                "Setu, Pengasinan",
                "Bubur ayam",
                "$5 untuk dua (approx.)",
                "4.5",
                "Buka besok pada 5:00am",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Bubur_ayam_chicken_porridge.JPG/1200px-Bubur_ayam_chicken_porridge.JPG"
        ));
        restoran.add(new Restoran("Lontong Sayur Padang",
                "Beji, Depok",
                "lontong",
                "$3 untuk dua (approx.)",
                "2.9",
                "Buka besok pada 6:00am",
                "https://miro.medium.com/max/706/1*2V8omWKhSyNlq8aYgKe54Q.jpeg"
        ));
        restoran.add(new Restoran("Ketoprak Kang Usep",
                "Belakang mampang",
                "ketoprak",
                "$10 untuk dua (approx.)",
                "4.2",
                "Buka besok pada 4:30am",
                "https://www.masakapahariini.com/wp-content/uploads/2018/08/ketoprak-MAHI-2.jpg"

        ));
        restoran.add(new Restoran("Fuyunghai hai",
                "Depok, Margonda",
                "Fuyung hai",
                "$25 untuk dua (approx.)",
                "3.0",
                "Buka besok pada 6:00am",
                "https://i1.wp.com/resepkoki.id/wp-content/uploads/2016/11/Resep-Fuyunghai.jpg?fit=1776%2C1184&ssl=1"
        ));
        restoran.add(new Restoran("Bubur Ayam Enak Tau",
                "Setu, Pengasinan",
                "Bubur ayam",
                "$5 untuk dua (approx.)",
                "4.5",
                "Buka besok pada 5:00am",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Bubur_ayam_chicken_porridge.JPG/1200px-Bubur_ayam_chicken_porridge.JPG"
        ));
        restoran.add(new Restoran("Lontong Sayur Padang",
                "Beji, Depok",
                "lontong",
                "$3 untuk dua (approx.)",
                "2.9",
                "Buka besok pada 6:00am",
                "https://miro.medium.com/max/706/1*2V8omWKhSyNlq8aYgKe54Q.jpeg"
        ));
        restoran.add(new Restoran("Ketoprak Kang Usep",
                "Belakang mampang",
                "ketoprak",
                "$10 untuk dua (approx.)",
                "4.2",
                "Buka besok pada 4:30am",
                "https://www.masakapahariini.com/wp-content/uploads/2018/08/ketoprak-MAHI-2.jpg"

        ));
        restoran.add(new Restoran("Fuyunghai hai",
                "Depok, Margonda",
                "Fuyung hai",
                "$25 untuk dua (approx.)",
                "3.0",
                "Buka besok pada 6:00am",
                "https://i1.wp.com/resepkoki.id/wp-content/uploads/2016/11/Resep-Fuyunghai.jpg?fit=1776%2C1184&ssl=1"
        ));
        return restoran;
    }

    public static List<Restoran> createRestoranJajananMalamList() {
        List<Restoran> restoran = new ArrayList<>();
        restoran.add(new Restoran("Bakso Pak Jenggot",
                "Blok S",
                "Bakso",
                "$50 untuk dua (approx.)",
                "3.2",
                "Buka besok pada 7:30pm",
                "https://assets-pergikuliner.com/s7oscifHZ3Ja3CQic34mSoI3m4U=/385x290/smart/https://assets-pergikuliner.com/uploads/image/picture/1164711/picture-1543198624.JPG"
        ));
        restoran.add(new Restoran("Kerupuk's",
                "Blok M",
                "Kerupuk",
                "$1 untuk dua (approx.)",
                "5.0",
                "Buka besok pada 6:00pm",
                "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2018/08/03/3623507392.jpg"
        ));
        restoran.add(new Restoran("Soto malam",
                "Mountain View",
                "Thai",
                "$50 untuk dua (approx.)",
                "4.2",
                "Buka besok pada 6:30pm",
                "https://i0.wp.com/resepkoki.id/wp-content/uploads/2016/04/Resep-Soto-kuning-bogor.jpg?fit=1739%2C1461&ssl=1"
        ));
        restoran.add(new Restoran("Mie Dodok",
                "Depok City",
                "Mie",
                "$25 untuk dua (approx.)",
                "4.0",
                "Buka besok pada 7:00pm",
                "https://img-global.cpcdn.com/003_recipes/Recipe_2014_06_07_17_07_27_908_e54705_original_20131017_032557/751x532cq70/mie-godog-jawa-foto-resep-utama.jpg"
        ));restoran.add(new Restoran("Bakso Pak Jenggot",
                "Blok S",
                "Bakso",
                "$50 untuk dua (approx.)",
                "3.2",
                "Buka besok pada 7:30pm",
                "https://assets-pergikuliner.com/s7oscifHZ3Ja3CQic34mSoI3m4U=/385x290/smart/https://assets-pergikuliner.com/uploads/image/picture/1164711/picture-1543198624.JPG"
        ));
        restoran.add(new Restoran("Kerupuk's",
                "Blok M",
                "Kerupuk",
                "$1 untuk dua (approx.)",
                "5.0",
                "Buka besok pada 6:00pm",
                "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2018/08/03/3623507392.jpg"
        ));
        restoran.add(new Restoran("Soto malam",
                "Mountain View",
                "Thai",
                "$50 untuk dua (approx.)",
                "4.2",
                "Buka besok pada 6:30pm",
                "https://i0.wp.com/resepkoki.id/wp-content/uploads/2016/04/Resep-Soto-kuning-bogor.jpg?fit=1739%2C1461&ssl=1"
        ));
        restoran.add(new Restoran("Mie Dodok",
                "Depok City",
                "Mie",
                "$25 untuk dua (approx.)",
                "4.0",
                "Buka besok pada 7:00pm",
                "https://img-global.cpcdn.com/003_recipes/Recipe_2014_06_07_17_07_27_908_e54705_original_20131017_032557/751x532cq70/mie-godog-jawa-foto-resep-utama.jpg"
        ));
        return restoran;
    }
}
