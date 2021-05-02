package com.example.fragment_tugastpm;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rcv = (RecyclerView) getView().findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new myadapter(dataqueue(), getActivity());
        rcv.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("Almond");
        ob1.setDesc("Harga Rp 88.000");
        ob1.setImgname(R.drawable.almond);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("1Q48");
        ob2.setDesc("Harga Rp 128.000");
        ob2.setImgname(R.drawable.iq);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("Into the Magic Shop");
        ob3.setDesc("Harga Rp 78.000");
        ob3.setImgname(R.drawable.magicshop);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("Men Are From Mars, Women Are From Venus");
        ob4.setDesc("Rp 179.000");
        ob4.setImgname(R.drawable.mars);
        holder.add(ob4);

        return holder;
    }

}