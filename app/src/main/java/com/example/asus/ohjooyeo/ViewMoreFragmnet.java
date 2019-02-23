package com.example.asus.ohjooyeo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ViewMoreFragmnet extends Fragment {

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
        return inflater.inflate(R.layout.fragment_viewmoer, container,false);

    }
}

