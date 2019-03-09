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

public class WorshipFragment extends Fragment {


    View v;
    private RecyclerView myrecyclerview;
    private List<WorshipData> IsRecyclerview;

    public WorshipFragment() {
    }


    private static WorshipFragment worshipFragment;

    public static WorshipFragment getInstance() {
        if (worshipFragment == null) {
            synchronized (WorshipFragment.class) {
                if (worshipFragment == null) {
                    worshipFragment = new WorshipFragment();
                }
            }
        }
        return worshipFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_worship, container, false);

        myrecyclerview = (RecyclerView) v.findViewById(R.id.recyclerview);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),IsRecyclerview);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IsRecyclerview = new ArrayList<>();
        IsRecyclerview.add(new WorshipData("경배와 찬양", "123123", "회중"));
        IsRecyclerview.add(new WorshipData("기도", "123123", "이원우"));
        IsRecyclerview.add(new WorshipData("말씀", "123123", "강인호 전도사님"));
        IsRecyclerview.add(new WorshipData("봉헌", "123123", "회중"));

    }
}


