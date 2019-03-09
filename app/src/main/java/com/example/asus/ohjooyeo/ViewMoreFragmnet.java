package com.example.asus.ohjooyeo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ViewMoreFragmnet extends Fragment {
    View view;
    private RecyclerView myRecyclerView;
    private List<Recyclerview2> isRecyclerView;

    public ViewMoreFragmnet() {
    }

    private static ViewMoreFragmnet viewMore;


    public static ViewMoreFragmnet getInstance() {
        if (viewMore == null) {
            synchronized (ViewMoreFragmnet.class) {
                if (viewMore == null) {
                    viewMore = new ViewMoreFragmnet();
                }
            }
        }
        return viewMore;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_viewmoer, container, false);

        myRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerview2);

        RecyclerViewAdapter1 recyclerViewAdapter = new RecyclerViewAdapter1(getContext(), isRecyclerView);

        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerViewAdapter);
        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isRecyclerView = new ArrayList<>();

        isRecyclerView.add(new Recyclerview2("공지사항",R.drawable.ic_looks_one_black_24dp));
        isRecyclerView.add(new Recyclerview2("교회소개",R.drawable.ic_looks_one_black_24dp));
        isRecyclerView.add(new Recyclerview2("교회 약도",R.drawable.ic_looks_one_black_24dp));
        isRecyclerView.add(new Recyclerview2("청년부 소개",R.drawable.ic_looks_one_black_24dp));
        isRecyclerView.add(new Recyclerview2("청년부 소개",R.drawable.ic_looks_one_black_24dp));
        isRecyclerView.add(new Recyclerview2("청년부 소개",R.drawable.ic_looks_one_black_24dp));
        isRecyclerView.add(new Recyclerview2("청년부 소개",R.drawable.ic_looks_one_black_24dp));
        isRecyclerView.add(new Recyclerview2("청년부 소개",R.drawable.ic_looks_one_black_24dp));



    }
}
