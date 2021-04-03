package com.asmir.learnbosnian;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId){
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        //Get the {@link Word} object located at he position in the list
            Word currentWord = getItem(position);

        //Find the TextViews in the list_item.xml layout with the ID miwok_text_view,
            TextView bosnianTextView = listItemView.findViewById(R.id.bosnian_text_view);
            bosnianTextView.setText(currentWord.getBosnianTranslation());


            TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
            defaultTextView.setText(currentWord.getDefaultTranslation());



        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
            if(currentWord.hasImage()) {
                imageView.setImageResource(currentWord.getImageResourceId());
            } else {
                imageView.setVisibility(View.GONE);
            }

            View textContainer = listItemView.findViewById(R.id.text_container);
            int color = ContextCompat.getColor(getContext(), mColorResourceId);
            textContainer.setBackgroundColor(color);

            return listItemView;

    }
}
