package com.example.tugaday6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NegaraAdapter negaraAdapter;
    private ArrayList<NegaraModel> negaraModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();


        recyclerView = findViewById(R.id.recycleview);
        negaraAdapter = new NegaraAdapter(negaraModel);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(negaraAdapter);
        negaraAdapter.setOnItemClickListener(new NegaraAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(NegaraModel model) {
                Intent intent = new Intent(MainActivity.this, DetailActivity2.class);
                intent.putExtra("nama_negara", model.getNamaNegara());
                intent.putExtra("logo_bendera", model.getLogoBendera());
                intent.putExtra("desc_negara", model.getDeskripsiNegara());
                startActivity(intent);

            }
        });
    }

    private void getData() {
        negaraModel = new ArrayList<>();
        negaraModel.add(new NegaraModel("Indonesia", R.drawable.indonesia, "Indonesia adalah negara kepulauan terbesar di dunia yang terletak di Asia Tenggara. Negara ini memiliki keanekaragaman budaya, etnis, dan agama yang kaya, dengan lebih dari 17.000 pulau dan ratusan suku bangsa. Ibu kota negara ini adalah Jakarta.\n" +
                "\n" +
                "Negara Indonesia memiliki populasi yang besar, menjadikannya negara keempat terpadat di dunia. Bahasa resmi yang digunakan adalah Bahasa Indonesia, sementara banyak bahasa daerah juga digunakan di seluruh kepulauan. Agama mayoritas di Indonesia adalah Islam, namun ada juga keberagaman agama lainnya seperti Kristen, Hindu, Buddha, dan kepercayaan tradisional."));
        negaraModel.add(new NegaraModel("Belanda", R.drawable.belanda, " Belanda adalah negara yang terletak di Eropa Barat Laut. Negara ini terkenal karena warisan sejarahnya yang kaya, keindahan arsitektur klasiknya, serta sistem kanal yang unik di kota-kota seperti Amsterdam dan Utrecht.\n" +
                "\n" +
                "Negara Belanda memiliki populasi yang relatif kecil namun sangat beragam, dengan masyarakat yang terdiri dari berbagai latar belakang budaya dan etnis. Bahasa resmi yang digunakan adalah Bahasa Belanda, tetapi sebagian besar penduduk juga fasih berbahasa Inggris."));
        negaraModel.add(new NegaraModel("Brunei", R.drawable.brunei, " Negara Brunei Darussalam adalah negara kecil yang terletak di pesisir utara pulau Kalimantan, di Asia Tenggara. Meskipun memiliki luas wilayah yang relatif kecil, Brunei dikenal karena kekayaan minyak dan gas alamnya yang melimpah.\n" +
                "\n" +
                "Negara Brunei Darussalam memiliki sistem monarki absolut, dengan Sultan sebagai kepala negara dan kepala pemerintahan. Brunei adalah salah satu dari beberapa negara yang masih mempertahankan monarki absolut di dunia modern. Kehidupan politik dan sosial di Brunei sangat dipengaruhi oleh nilai-nilai Islam, dengan Islam sebagai agama resmi negara dan hukum Islam berperan dalam sistem peradilan."));
        negaraModel.add(new NegaraModel("Cina", R.drawable.cina, "Republik Rakyat Tiongkok, yang lebih dikenal sebagai Tiongkok atau China, adalah negara terbesar di Asia Timur dan negara terpadat di dunia. Dengan sejarah yang kaya, budaya yang beragam, dan peran penting dalam ekonomi global, China memiliki dampak yang signifikan di banyak aspek kehidupan dunia saat ini.\n" +
                "\n" +
                "Tiongkok adalah negara yang luas dengan beragam lanskap, termasuk pegunungan, dataran rendah, dan wilayah pesisir. Ini adalah rumah bagi berbagai kelompok etnis yang berbeda, dengan mayoritas Han dan sejumlah besar minoritas etnis lainnya seperti Uighur, Tibet, dan Mongol."));
        negaraModel.add(new NegaraModel("Filipina", R.drawable.filipina, "Filipina adalah sebuah negara kepulauan yang terletak di Asia Tenggara di Samudra Pasifik barat. Negara ini terdiri dari lebih dari 7.000 pulau, dengan pulau-pulau utama termasuk Luzon, Visayas, dan Mindanao. Filipina memiliki kekayaan alam yang melimpah, keindahan alam yang menakjubkan, serta warisan budaya yang kaya.\n" +
                "\n" +
                "Secara politik, Filipina adalah republik demokratis dengan sistem pemerintahan yang terdiri dari tiga cabang: eksekutif, legislatif, dan yudikatif. Manila adalah ibu kota dan pusat politik, ekonomi, serta budaya negara ini. Bahasa resmi adalah bahasa Filipina, sementara bahasa Inggris juga banyak digunakan dalam bisnis, pendidikan, dan pemerintahan."));
        negaraModel.add(new NegaraModel("Inggris", R.drawable.inggris, "Inggris, secara resmi dikenal sebagai Kerajaan Bersatu Inggris dan Irlandia Utara, adalah negara yang terletak di kepulauan Britania di lepas pantai barat laut daratan Eropa. Negara ini terdiri dari empat negara konstituen: Inggris, Skotlandia, Wales, dan Irlandia Utara. Ibukota Inggris adalah London, yang juga menjadi pusat politik, budaya, dan ekonomi negara ini.\n" +
                "\n" +
                "Inggris memiliki sejarah yang panjang dan berpengaruh di dunia. Selama berabad-abad, Inggris telah menjadi pusat kekuasaan politik, ekonomi, dan budaya, terutama selama masa Kekaisaran Britania Raya pada abad ke-19. Kekaisaran ini memperluas pengaruh Inggris ke seluruh dunia dan meninggalkan warisan budaya yang kuat."));
        negaraModel.add(new NegaraModel("Jepang", R.drawable.jepang, "Jepang, secara resmi dikenal sebagai Nippon atau Nihon, adalah sebuah negara kepulauan yang terletak di Asia Timur. Negara ini terdiri dari empat pulau utama: Honshu, Hokkaido, Kyushu, dan Shikoku, serta ribuan pulau kecil lainnya. Jepang adalah salah satu negara yang paling maju dan berpengaruh di dunia, dengan budaya yang kaya, teknologi yang canggih, dan ekonomi yang kuat.\n" +
                "\n" +
                "Budaya Jepang memiliki akar yang kuat dalam tradisi dan nilai-nilai yang kuno, namun juga terbuka terhadap inovasi dan modernitas. Jepang terkenal dengan seni, sastra, arsitektur, dan tata cara yang unik, seperti seni lukis ukiyo-e, puisi haiku, arsitektur kuil dan istana, serta tata cara minum teh dan seni bunga ikebana."));
        negaraModel.add(new NegaraModel("Kamboja", R.drawable.kamboja, "Kamboja adalah sebuah negara yang terletak di Asia Tenggara, berbatasan dengan Thailand di sebelah barat laut, Laos di sebelah utara, Vietnam di sebelah timur, dan Teluk Thailand di sebelah barat daya. Negara ini memiliki sejarah yang kaya, budaya yang beragam, dan warisan arsitektur yang megah.\n" +
                "\n" +
                "Ibu kota Kamboja adalah Phnom Penh, sebuah kota yang kaya akan sejarah dan budaya, dengan tempat-tempat seperti Istana Kerajaan, Kuil Wat Phnom, dan Museum Nasional Kamboja yang menampilkan koleksi seniifakta arkeologi. Kamboja juga terkenal dengan situs arkeologi Angkor Wat, kuil Hindu yang megah dan salah satu situs bersejarah terbesar di dunia."));
        negaraModel.add(new NegaraModel("Laos", R.drawable.laos, "Laos, secara resmi dikenal sebagai Republik Demokratik Rakyat Laos, adalah sebuah negara di Asia Tenggara yang berbatasan dengan Myanmar dan Cina di sebelah utara, Vietnam di sebelah timur, Kamboja di sebelah selatan, Thailand di sebelah barat, dan sebagian kecil dengan wilayah negara Vietnam di sebelah timur laut. Laos adalah negara yang relatif kecil namun memiliki kekayaan budaya, alam yang menakjubkan, dan sejarah yang kaya.\n" +
                "\n" +
                "Ibu kota Laos adalah Vientiane, sebuah kota yang menyimpan warisan kolonial Prancis serta kuil-kuil Buddha yang indah, seperti Wat Sisaket dan That Luang. Laos memiliki populasi yang beragam etnis dan suku bangsa, dengan Bahasa Lao sebagai bahasa resmi negara dan Bahasa Inggris umumnya dipahami di kalangan pendidikan dan bisnis."));
        negaraModel.add(new NegaraModel("Malaysia", R.drawable.malaysia, "Malaysia adalah sebuah negara yang terletak di Asia Tenggara, berbatasan dengan Thailand di sebelah utara, Singapura di sebelah selatan, Indonesia di sebelah barat, dan Brunei serta Filipina di sebelah timur. Negara ini terdiri dari dua bagian utama: Semenanjung Malaysia di bagian barat dan Malaysia Timur di bagian utara Pulau Kalimantan.\n" +
                "\n" +
                "Ibu kota Malaysia adalah Kuala Lumpur, sebuah pusat keuangan dan bisnis yang modern dengan ikonnya seperti Menara Kembar Petronas dan Jalan Alor yang terkenal dengan makanan jalanan. Malaysia memiliki populasi yang beragam etnis, budaya, dan agama, dengan masyarakat yang terdiri dari Melayu, Cina, India, dan berbagai suku bangsa lainnya."));
        negaraModel.add(new NegaraModel("Palestina", R.drawable.palestina, "Palestina adalah sebuah wilayah yang terletak di Timur Tengah, di antara Laut Tengah di barat dan Sungai Yordan di timur. Wilayah ini memiliki sejarah yang kaya dan kompleks, serta menjadi pusat perhatian internasional karena konflik politik yang berlarut-larut dengan Israel.\n" +
                "\n" +
                "Wilayah Palestina terbagi menjadi beberapa bagian, termasuk Jalur Gaza di sebelah barat dan Tepi Barat di sebelah timur, yang terdiri dari beberapa wilayah otonom dan pemukiman Israel. Ibukota Palestina yang diakui secara internasional adalah Kota Ramallah, yang juga menjadi pusat administrasi otonom Palestina."));
        negaraModel.add(new NegaraModel("SIngapura", R.drawable.singapura, "Singapura adalah sebuah negara pulau yang terletak di ujung selatan Semenanjung Malaya di Asia Tenggara. Dikenal sebagai salah satu negara dengan ekonomi yang paling maju di dunia, Singapura memiliki sejarah yang unik dan beragam, serta menjadi pusat keuangan, perdagangan, dan pariwisata di kawasan Asia.\n" +
                "\n" +
                "Ibu kota Singapura adalah Kota Singapura, sebuah pusat perkotaan yang modern dengan arsitektur futuristik, taman-taman yang hijau, dan ikon-ikon seperti Marina Bay Sands dan Taman Rakyat. Negara ini memiliki populasi yang beragam etnis, budaya, dan agama, dengan masyarakat yang terdiri dari etnis Melayu, Cina, India, dan sejumlah etnis minoritas lainnya."));
        negaraModel.add(new NegaraModel("Thailand", R.drawable.thailand, "Singapura adalah sebuah negara pulau yang terletak di ujung selatan Semenanjung Malaya di Asia Tenggara. Dikenal sebagai salah satu negara dengan ekonomi yang paling maju di dunia, Singapura memiliki sejarah yang unik dan beragam, serta menjadi pusat keuangan, perdagangan, dan pariwisata di kawasan Asia.\n" +
                "\n" +
                "Ibu kota Singapura adalah Kota Singapura, sebuah pusat perkotaan yang modern dengan arsitektur futuristik, taman-taman yang hijau, dan ikon-ikon seperti Marina Bay Sands dan Taman Rakyat. Negara ini memiliki populasi yang beragam etnis, budaya, dan agama, dengan masyarakat yang terdiri dari etnis Melayu, Cina, India, dan sejumlah etnis minoritas lainnya."));
        negaraModel.add(new NegaraModel("Timor Leste", R.drawable.timorleste, "Timor Leste, secara resmi dikenal sebagai Republik Demokratik Timor Leste, adalah sebuah negara yang terletak di bagian tenggara Asia, di ujung timur Pulau Timor. Negara ini berbatasan dengan Indonesia di barat dan Australia di selatan, serta memiliki pantai yang menghadap Laut Sawu di utara.\n" +
                "\n" +
                "Ibu kota Timor Leste adalah Dili, sebuah kota yang terletak di pantai utara Pulau Timor. Kota ini merupakan pusat administrasi, politik, dan ekonomi negara ini. Bahasa resmi Timor Leste adalah Bahasa Tetun dan Portugis, sementara Bahasa Inggris dan Bahasa Indonesia juga dipahami oleh sebagian besar penduduk."));
        negaraModel.add(new NegaraModel("Vietnam", R.drawable.vietnam, "Vietnam adalah sebuah negara yang terletak di Asia Tenggara, berbatasan dengan Laos dan Kamboja di barat, serta memiliki garis pantai yang panjang di Laut Cina Selatan. Negara ini memiliki sejarah yang kaya, budaya yang beragam, dan alam yang indah, menjadikannya destinasi wisata yang menarik dan bersejarah.\n" +
                "\n" +
                "Ibu kota Vietnam adalah Hanoi, sebuah kota yang kaya akan warisan sejarah dan budaya, dengan kuil-kuil kuno, bangunan kolonial Prancis, dan jalan-jalan yang ramai dengan pedagang dan pengunjung. Kota lainnya yang terkenal di Vietnam adalah Ho Chi Minh City (dahulu dikenal sebagai Saigon), sebuah pusat bisnis dan budaya yang modern di bagian selatan negara ini."));
    }
}