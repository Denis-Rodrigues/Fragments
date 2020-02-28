package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConversasFragment extends Fragment {

  TextView textConversas;

  public ConversasFragment () {
    // Required empty public constructor
  }


  @Override
  public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view =  inflater.inflate(R.layout.fragment_conversas, container, false);
    textConversas = view.findViewById(R.id.textConversas);
    textConversas.setText("Conversas");
    return view;
  }
}
