package com.example.asus.ohjooyeo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AdvertisementFragmnet extends Fragment {

    private static AdvertisementFragmnet advertisement;

    public static AdvertisementFragmnet getInstance() {
        if (advertisement == null) {
            synchronized (AdvertisementFragmnet.class) {
                if (advertisement == null) {
                    advertisement = new AdvertisementFragmnet();
                }
            }
        }
        return advertisement;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_advertisement, container,false);
    }
}
