package com.daffa.geteat

object FoodData {
    private val foodNames = arrayOf(
        "Gado-Gado Cemar",
        "Soto padang Mangkuto",
        "Bubur Kwang Tuang",
        "Pondok Djaja",
        "Tahu Pong Semarang",
        "Ketan Susu Kemayoran",
        "Ragusa Es Italia",
        "Sate Tulang Eldorado",
        "Soto Betawi Haji\n Amir 21",
        "Sarang Oci"
    )

    private val foodDetails = arrayOf(
        "Gado-gado adalah makanan khas Jakarta berisi sayur-sayuran yang direbus, irisan telur dan tahu, serta ditaburi bawang goreng dan kerupuk. Sayur-sayuran ditambahkan dengan bumbu kacang atau saus dari kacang tanah yang telah dihaluskan yang kemudian diaduk merata.\n" +
                "\n" +
                "Gado-gado dapat dimakan langsung seperti selada dengan bumbu/saus kacang, atau dapat juga dimakan beserta nasi putih atau kadang-kadang juga disajikan dengan lontong.[2]\n" +
                "\n" +
                "Adanya makanan gado-gado pada abad 17 (1628-1629) bermula saat kesultanan Mataram yang dipimpin Sultan Agung melakukan Penyerbuan di Batavia kehabisan pasokan bahan makanan terutama beras, selain itu lumbung-lumbung beras di sekitar Batavia dibakar oleh VOC, sehingga membuat perajurit warok dari Ponorogo yang tergabung dalam pasukan perang membuat sambal bumbu pecel dari kacang, kemudian disiramkan ke berbagai sayuran mentah yang ada di sekitar persawahan untuk bertahan hidup. Tindakan ini dalam bahasa jawa disebut Gado yang berarti makan hanya lauk saja atau makan lauk tanpa nasi, apa yang dilakukan oleh warok ini diikuti oleh prajurit lainnya untuk memakan sayur seadanya yang disiram sairan bumbu pecel. Seiring perkembangan zaman, kini gado-gado ditambahkan lontong yang diiris kecil, telur, tahu dan kerupuk yang disajikan di warung kecil hingga restoran",
        "Soto Padang adalah hidangan berkuah kaldu sapi dengan bahan irisan daging sapi yang sudah digoreng kering, bihun, ditambah perkedel kentang dan dihidangkan panas-panas. Selain di Kota Padang, Sumatra Barat, hidangan Soto Padang juga mudah ditemukan di berbagai restoran Padang di penjuru dunia. ",
        "Masakan tradisional China seperti tumisan hingga bubur disajikan di tempat yang ramai.",
        "Opsi layanan: Makan di tempat · Bawa pulang · Antar tanpa bertemu",
        "tahu has semarang yang dipindahkan ke jakarta tahpong sering di kunjungi apa lagi pas hari libur",
        " Tempat tersebut bernama Ketan Susu Kemayoran. Wisata kuliner yang terletak di Jalan Garuda Ujung RW.08, Kemayoran, Jakarta Pusat ini ...",
        "Kedai es krim yang menyajikan berbagai hidangan penutup kreatif di ruang yang nyaman dengan suasana retro.",
        " Salah satu seller di ManisdanSedap.com, Eldora mengenalkan kuotie di ... di Surabaya jarang menemukan yang jualan kuotie seperti di Jakarta.",
        "Soto Betawi merupakan soto yang khas dari daerah DKI Jakarta. Seperti halnya Soto Madura dan Soto Sulung, soto Betawi juga menggunakan jeroan. Selain jeroan, sering kali organ-organ lain juga disertakan, seperti mata, terpedo, dan juga hati. Daging sapi juga menjadi bahan campuran dalam soto Betawi.",
        "Restaurant Sarang Oci Jakarta, Kebon Jeruk; View reviews, menu, contact, location, and more for Restaurant Sarang Oci Restaurant."

    )

    private val foodImages = intArrayOf(
        R.drawable.gadogado,
        R.drawable.sotopadang,
        R.drawable.bubur,
        R.drawable.pondokdjaja,
        R.drawable.tahupongpong,
        R.drawable.ketan,
        R.drawable.esitalia,
        R.drawable.satetulang,
        R.drawable.sotobetawi,
        R.drawable.sarangoci
    )

    val listData : ArrayList<Food>
    get() {
        val list = arrayListOf<Food>()
        for (position in foodNames.indices){
            val food = Food()
            food.name = foodNames[position]
            food.detail = foodDetails[position]
            food.photo = foodImages[position]
            list.add(food)
        }
        return  list
    }
}

