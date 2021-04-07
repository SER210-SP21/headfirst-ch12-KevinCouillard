package edu.quinnipiac.ser210.bitsandpizza;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/**
 * Kevin Couillard
 * SER210 Chapter 12 Demo
 * Bits and Pizzas Top Fragment
 * 4/1/21
 */
public class TopFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_top, container, false);
    }
}