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

public class Minuman_khas extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private List<Items_rv> items;

    public Minuman_khas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_minuman_khas, container, false);

        recyclerView = view.findViewById(R.id.rvMinumanKhas);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1));

        items = new ArrayList<>();
        items.add(new Items_rv("Es Dawet", "Minuman Khas\nPurbalingga", "https://images.tokopedia.net/img/cache/700/VqbcmM/2020/11/19/d0f92913-ba5e-4bbc-9db0-819e76011d47.jpg", "Es dawet, minuman tradisional Purbalingga yang menyegarkan, terdiri dari santan kental, gula merah cair, dan dawet hijau yang kenyal, disajikan dengan es serut, menciptakan perpaduan manis dan segar yang cocok dinikmati dalam cuaca panas."));
        items.add(new Items_rv("Es Kelapa Muda", "Minuman Khas\nPurbalingga", "https://i0.wp.com/newsnesia.id/wp-content/uploads/2023/02/Es-Kelapa-Muda-solusi.png?resize=480%2C480&ssl=1", "Es kelapa muda, minuman tropis yang menyegarkan, diisi dengan air kelapa muda segar dan es serut, memberikan sensasi kesegaran alami dengan setiap tegukan, cocok untuk menikmati kesegaran di bawah terik matahari."));
        items.add(new Items_rv("Es Gempol Plered", "Minuman Khas\nPurbalingga", "https://asset.kompas.com/crops/n1uxnc4SPRGIm3kf_0C-7RScrk0=/0x0:1000x667/750x500/data/photo/2020/12/14/5fd72d361e8e6.jpg", "Es Gempol Plered, makanan ringan khas Purbalingga yang lezat, terdiri dari gempol (tepung beras yang digoreng) yang diberi kuah gula merah kental dan santan, menciptakan rasa manis dan tekstur yang unik, menjadi camilan favorit untuk dinikmati di siang hari."));
        items.add(new Items_rv("Es Kacang Merah", "Minuman Khas\nPurbalingga", "https://i.ibb.co/kJcJM51/Desain-tanpa-judul-1.png", "Es kacang merah, minuman dingin yang segar, disajikan dengan kacang merah matang yang direndam dalam sirup gula, ditambah es serut dan susu kental manis, memberikan kombinasi rasa manis dan tekstur yang memuaskan, sempurna untuk menyegarkan hari-hari panas."));

        // Inisialisasi adapter dan set ke RecyclerView
        adapter = new RecyclerViewAdapter(getContext(), items);
        recyclerView.setAdapter(adapter);
        return view;
    }
}