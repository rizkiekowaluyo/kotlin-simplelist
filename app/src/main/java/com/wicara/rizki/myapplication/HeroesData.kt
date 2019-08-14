package com.wicara.rizki.myapplication

object HeroesData {
    private var data = arrayOf(
            arrayOf(
                    "Iron Man",
                    "Tony Stark adalah seorang industrialis, petualang, filantropis, penemu dan ilmuwan. Dia adalah seorang pendiri Maria Stark Foundation, CEO Stark Enterprises, CEO Stark Solutions, CEO Circuits Maximus, CEO Stark International, dan Presiden Kehormatan Stark Resilient. Tony Stark juga pernah menjabat sebagai Direktur Eksekutif S.H.I.E.L.D. dan Menteri Pertahanan Amerika Serikat (Secretary of Defense)",
                    "https://d3avoj45mekucs.cloudfront.net/rojakdaily/media/1nichoras/iron%20man%20model%20prime/iron-man.jpg?ext=.jpg"
            ),
            arrayOf(
                    "Captain America",
                    "Steve Rogers, seorang pemuda lemah yang ditingkatkan ke puncak kesempurnaan manusia oleh serum eksperimental untuk membantu upaya pemerintah Amerika Serikat dalam Perang Dunia II. Menjelang akhir perang, ia terjebak dalam es dan selamat dalam animasi ditangguhkan sampai dia dihidupkan kembali pada hari ini.",
                    "https://cdn.britannica.com/s:500x350/30/182830-004-61C7794A.jpg"
            ),
            arrayOf(
                    "Hulk",
                    "Hulk diciptakan sebagai orang yang memiliki alter ego hasrat dan emosional yang bisa mengubah fisik seorang Dr. Bruce Banner. Hulk muncul setelah Banner secara tidak sengaja terkena test ledakan dari bom gamma yang ia temukan. ",
                    "https://www.hindustantimes.com/rf/image_size_960x540/HT/p2/2019/01/25/Pictures/_1e3fee26-2078-11e9-abd9-895ad40f6f04.jpg"
            ),
            arrayOf(
                    "Thor",
                    "Thor adalah pejuang tangan-ke-tangan yang luar biasa, dan terampil dalam pertempuran bersenjata, yang mahir dalam penggunaan palu perang, pedang, kapak dan gada. Thor memiliki dua item yang membantu dia dalam pertempuran: Belt terpesona Kekuatan, dan senjata yang dibuatnya sendiri, palu Mjolnir yang mistis.",
                    "https://d13ezvd6yrslxm.cloudfront.net/wp/wp-content/images/evolution-of-thor-5.png"
            ),
            arrayOf(
                    "Captain Marvel",
                    "Pada tahun 1995, Carol Danvers (Brie Larson), mantan pilot Angkatan Udara Amerika Serikat, berubah menjadi salah satu pahlawan terkuat galaksi dan bergabung dengan Starforce, sebuah tim elit militer Kree, sebelum kembali ke rumahnya di Bumi dengan pertanyaan baru tentang masa lalu dan identitasnya ketika Bumi terjebak di pusat konflik galaksi antara dua dunia asing",
                    "https://cdn.vox-cdn.com/thumbor/ro7k8Qh9Wat977n0EZ9z1HVgDRw=/0x0:1400x1400/1200x800/filters:focal(602x377:826x601)/cdn.vox-cdn.com/uploads/chorus_image/image/63147262/captainmarvelbrielarson.0.jpg"
            ),
            arrayOf(
                    "Black Widow",
                    "Scarlett Johansson portrays the character in the Marvel Cinematic Universe films Iron Man 2 (2010), The Avengers (2012), Captain America: The Winter Soldier (2014), Avengers: Age of Ultron (2015), Captain America: Civil War (2016), Avengers: Infinity War (2018), Captain Marvel and Avengers: Endgame (both 2019). Johansson will reprise the role in her solo and prequel film Black Widow (2020).",
                    "https://cdn.idntimes.com/content-images/post/20190731/goat-com-f43c0581b068b13f9b2769534b1bff8a_600x400.jpg"
            ),
            arrayOf(
                    "Spiderman",
                    "Peter Parker, siswa SMA di balik identitas rahasia Spider-Man dan dengan \"obsesi diri dengan penolakan, ketidakmampuan, dan kesepian\" sehingga pembaca muda bisa berhubungan.[1] ",
                    "https://cdn.medcom.id/images/content/2019/04/19/1012615/pL4USID5Kf.jpg"
            ),
            arrayOf(
                    "Black Panther",
                    "Black Panther adalah gelar seremonial yang diberikan kepada kepala Suku Panther dari negara maju di Afrika, Wakanda. Selain memerintah negara, dia juga kepala berbagai sukunya (secara kolektif disebut sebagai Wakandas). Kebiasaan Panther adalah simbol jabatan (kepala negara) dan digunakan bahkan selama misi diplomatik. Panther adalah gelar turun-temurun, tapi orang masih harus mendapatkannya.",
                    "https://cdn.vox-cdn.com/thumbor/MKylVCkWKne60jVVRChMa0EcGw0=/0x0:2040x1360/1200x800/filters:focal(868x309:1194x635)/cdn.vox-cdn.com/uploads/chorus_image/image/58591729/BlackPanther596d2f04d1540_2040.0.jpg"
            ),
            arrayOf(
                    "Hawkeye",
                    "Clint Barton lahir di Waverly, Iowa. Di usia muda ia kehilangan kedua orang tuanya dalam sebuah kecelakaan mobil. Setelah enam tahun berada di panti asuhan, Clint dan saudaranya Barney melarikan diri untuk bergabung dengan Carson Carnival of Travelling Wonders.",
                    "https://cdnx.kincir.com/production/media/2018/juni/marvel-bakal-bikin-film-solo-hawkeye/feature-marvel-bakal-bikin-film-solo-hawkeye-1300x500.jpg"
            ),
            arrayOf(
                    "Doctor Strange",
                    "Hidup Stephen Strange (Benedict Cumberbatch), seorang dokter bedah pintar yang sombong, mendadak berubah drastis. Sebuah kecelakaan membuat kemampuan tangannya menjadi sangat terbatas. Bertekad untuk menyembuhkan kondisinya, ia pun berpetualang mencari obat untuk memulihkan lengannya.",
                    "https://terrigen-cdn-dev.marvel.com/content/prod/1x/009drs_ons_crd_02.jpg"
            )
    )
    val listData: ArrayList<Hero>
        get() {
            val list = ArrayList<Hero>()
            for (aData in data) {
                val hero = Hero()
                hero.name = aData[0]
                hero.from = aData[1]
                hero.photo = aData[2]
                list.add(hero)
            }
            return list
        }
}