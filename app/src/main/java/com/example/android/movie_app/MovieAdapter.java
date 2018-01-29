package com.example.android.movie_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by user on 29-Jan-18.
 */

public class MovieAdapter extends ArrayAdapter<Movie> {

    MovieAdapter(@NonNull Context context, ArrayList<Movie> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.movie_item, parent, false);
        }
        final Movie thisMovie = getItem(position);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.movie_item);
        Picasso.with(getContext()).load(thisMovie.getPosterPath()).into(imageView);

        return listItemView;
    }
}
