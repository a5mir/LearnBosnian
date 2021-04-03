package com.asmir.learnbosnian;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);


        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("red", "crvena", R.drawable.color_red));
        words.add(new Word("yellow", "žuta", R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow", "prljavo žuta", R.drawable.color_dusty_yellow));
        words.add(new Word("green", "zelena", R.drawable.color_green));
        words.add(new Word("brown", "smeđa", R.drawable.color_brown));
        words.add(new Word("gray", "siva", R.drawable.color_gray));
        words.add(new Word("black", "crna", R.drawable.color_black));
        words.add(new Word("white", "bijela", R.drawable.color_white));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}