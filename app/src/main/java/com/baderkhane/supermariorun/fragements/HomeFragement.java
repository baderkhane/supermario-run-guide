package com.baderkhane.supermariorun.fragements;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.baderkhane.supermariorun.R;
import com.baderkhane.supermariorun.adapter.HomeAdapter;
import com.baderkhane.supermariorun.model.Article;

import java.util.ArrayList;

/**
 * Created by baderkhaneoussama@gmail.com on 19/12/2016.
 */

public class HomeFragement extends Fragment {
    public static final String TAG = "HomeFragement";
    private ArrayList<Article> articleCollection;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View mView = inflater.inflate(R.layout.levels_layout, container, false);
        ListView mListView = (ListView) mView.findViewById(R.id.itemListView);

        mListView.setAdapter(new HomeAdapter(getContext(), initStaticData()));
        return mView;
    }
    public ArrayList<Article> initStaticData(){
        articleCollection = new ArrayList<>();
        articleCollection.add(new Article(getString(R.string.kingdom_builder), R.drawable.kingdom));
        articleCollection.add(new Article(getString(R.string.levels), R.drawable.levels));
        articleCollection.add(new Article(getString(R.string.shop), R.drawable.shoppin));
        return articleCollection;
    }
}
