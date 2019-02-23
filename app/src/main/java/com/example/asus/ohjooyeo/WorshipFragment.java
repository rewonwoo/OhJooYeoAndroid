package com.example.asus.ohjooyeo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WorshipFragment extends Fragment {

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
        return inflater.inflate(R.layout.fragment_worship, container, false);
    }
}
