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

        words.add(new Word("one", "jedan", R.drawable.number_one));
        words.add(new Word("two", "dva", R.drawable.number_two));
        words.add(new Word("three", "tri", R.drawable.number_three));
        words.add(new Word("four", "četiri", R.drawable.number_four));
        words.add(new Word("five", "pet", R.drawable.number_five));
        words.add(new Word("six", "šest", R.drawable.number_six));
        words.add(new Word("seven", "sedam", R.drawable.number_seven));
        words.add(new Word("eight", "osam", R.drawable.number_eight));
        words.add(new Word("nine", "devet", R.drawable.number_nine));
        words.add(new Word("ten", "deset", R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}