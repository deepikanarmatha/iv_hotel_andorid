package com.example.iv_hotel;

import android.annotation.SuppressLint;
import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class HotelListFragment extends Fragment {

        private RecyclerView hotelRecyclerView;
        private HotelAdapter hotelAdapter;
        private List<Hotel> hotelList = new ArrayList<>();
        private EditText searchField;
        private  TextView booknow;

        @SuppressLint("WrongViewCast")
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_hotel_list, container, false);

            searchField = view.findViewById(R.id.searchField);
            booknow =view.findViewById(R.id.bookButton4);



            booknow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getActivity(), HotelDetails_Screen.class);  // Use getActivity() for fragment context
                    startActivity(intent);
                }
            });

            searchField.addTextChangedListener(new android.text.TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {}

                @Override
                public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                    hotelAdapter.getFilter().filter(charSequence);
                }

                @Override
                public void afterTextChanged(android.text.Editable editable) {}
            });


            return view;
        }
    }
