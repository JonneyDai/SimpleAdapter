package com.sakurawood.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;


import com.sakurawood.library.SimpleAdapter;
import com.sakurawood.library.SimpleViewHolder;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Bean> list;
    RecyclerView recyclerView;

    SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.list);


        init();

        simpleAdapter=new SimpleAdapter<Bean>(getApplicationContext(),R.layout.item,list) {
            @Override
            protected void convert(SimpleViewHolder holder, Bean item) {
                holder.setText(R.id.name,item.getName());
                holder.setText(R.id.value,item.getValue());
                holder.setImageResource(R.id.img,item.getPic());
            }

        };
        simpleAdapter.setOnRecyclerViewItemClickListener(new SimpleAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                Toast.makeText(MainActivity.this, "haha"+"   "+position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public boolean onLongClick(View view, int position) {
                return false;
            }
        });
        recyclerView.setAdapter(simpleAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void init(){
        list=new ArrayList<>();
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
        list.add(new Bean("sakura","wood",R.drawable.sakura));
    }
}
