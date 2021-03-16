package com.asmir.learnbosnian;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("one", "jedan"));
        words.add(new Word("two", "dva"));
        words.add(new Word("three", "tri"));
        words.add(new Word("four", "četiri"));
        words.add(new Word("five", "pet"));
        words.add(new Word("six", "šest"));
        words.add(new Word("seven", "sedam"));
        words.add(new Word("eight", "osam"));
        words.add(new Word("nine", "devet"));
        words.add(new Word("ten", "deset"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}