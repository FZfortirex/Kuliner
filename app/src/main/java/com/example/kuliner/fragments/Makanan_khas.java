package com.example.kuliner.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kuliner.Items_rv;
import com.example.kuliner.R;
import com.example.kuliner.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class Makanan_khas extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private List<Items_rv> items;

    public Makanan_khas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_makanan_khas, container, false);
        recyclerView = view.findViewById(R.id.rvMakananKhas);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1));

        items = new ArrayList<>();
        items.add(new Items_rv("Mendoan", "Makanan Khas\nPurbalingga", "https://static.promediateknologi.id/crop/0x0:0x0/0x0/webp/photo/akuratco/images/akurat_20200821025145_5Bsoo7.jpg", "Mendoan, camilan yang terbuat dari tempe tipis, menjadi hidangan yang sangat populer di Purbalingga.\n" +
                "\n" +
                "Keistimewaan Mendoan Purbalingga terletak pada penggunaan tempe khas, memberikan rasa yang unik dan lezat.\n" +
                "\n" +
                "Cocok dinikmati sebagai camilan malam yang ringan, menambah kenikmatan saat menikmati suasana malam di kota."));
        items.add(new Items_rv("Sroto Purbalingga", "Makanan Khas\nPurbalingga", "https://assets-a1.kompasiana.com/items/album/2020/03/04/soto-sokaraja-5e5eb083d541df300e21e632.jpg", "Sroto Purbalingga adalah bentuk unik dari soto lokal, yang dikenal dengan sebutan \"sroto\". Dengan krupuk karag merah putih dan sambal kacang \n" +
                "khas, Sroto Purbalingga menyajikan pengalaman rasa yang kaya dan gurih. Sroto So Bojong, Sroto Bancar, Sroto Jatisaba, Sroto Tirtawi, dan \n" +
                "Sroto Pringgading adalah beberapa tempat terkenal yang menyajikan Sroto Purbalingga."));
        items.add(new Items_rv("Ondol atau Condol", "Makanan Khas\nPurbalingga", "https://cdn.yummy.co.id/content-images/images/20220819/mdydlh36NlKiMOtf9ExW7xG82LPwHWvk-31363630393030373639d41d8cd98f00b204e9800998ecf8427e.jpg?x-oss-process=image/resize,w_388,h_388,m_fixed,x-oss-process=image/format,webp", "Ondol atau condol adalah jajanan khas Purbalingga yang terbuat dari singkong parut yang dibentuk bulat dan digoreng.\n" +
                "\n" +
                "Dicampur dengan bumbu-bumbu khas, ondol menawarkan cita rasa gurih dan lezat. Selain di pasar tradisional, ondol sering menjadi pilihan favorit sebagai pendamping kopi atau teh."));
        items.add(new Items_rv("Buntil", "Makanan Khas\nPurbalingga", "https://img.kurio.network/FD8tZW4f-dwqlDbxr31Mqtoz644=/320x320/filters:quality(80)/https://kurio-img.kurioapps.com/21/07/16/60403995-fdb3-4ff2-a85f-d6548fcd90aa.jpe", "Buntil adalah hidangan tradisional Purbalingga yang menggunakan daun talas sebagai pembungkus.\n" +
                "\n" +
                "Daun talas diisi dengan campuran kelapa parut, ikan teri, dan bumbu khas, kemudian dikukus hingga matang.\n" +
                "\n" +
                "Kelezatan buntil terletak pada kombinasi rasa gurih dan legit yang membuatnya menjadi lauk yang sempurna."));


        // Inisialisasi adapter dan set ke RecyclerView
        adapter = new RecyclerViewAdapter(getContext(), items);
        recyclerView.setAdapter(adapter);
        return view;
    }
}