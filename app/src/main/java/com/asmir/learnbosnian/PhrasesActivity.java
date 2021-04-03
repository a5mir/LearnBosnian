package com.asmir.learnbosnian;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Where are you going?", "Gdje ideš?"));
        words.add(new Word("What is your name?", "Kako se zoveš?"));
        words.add(new Word("My name is..", "Ja se zovem.."));
        words.add(new Word("How are you feeling?", "Kako se osjećaš?"));
        words.add(new Word("I'm feeling good.", "Osjećam se dobro."));
        words.add(new Word("Are you coming?", "Dolaziš li?"));
        words.add(new Word("Yes, I'm coming.", "Da, dolazim."));
        words.add(new Word("I'm coming", "Dolazim"));
        words.add(new Word("Let's go.", "Idemo."));
        words.add(new Word("Come here.", "Dođi ovamo."));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}