package com.example.android.newsapp_p6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ArticleAdapter extends ArrayAdapter<Article> {

    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    /* Return list of articles */

    @Override
    public View getView(int position, View convertView, ViewGroup Parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, Parent, false);
        }

        // Find the article
        Article currentArticle = getItem(position);

        // Find the title textview
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Display title of the article for given position
        titleView.setText(currentArticle.getTitle());

        // Find the section textview
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        // Display section of the article for given position
        sectionView.setText(currentArticle.getSection());

        // Find the author textview
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        // Display author of the article for given position
        authorView.setText(currentArticle.getAuthor());

        // Modify date to display just YYYY-MM-DD
        String date = currentArticle.getPublicationDate();
        String[] parts = date.split("T");
        String part1 = parts[0];
        // Find the date textview
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Display section of the article for given position
        dateView.setText(part1);


        return listItemView;
    }

}


