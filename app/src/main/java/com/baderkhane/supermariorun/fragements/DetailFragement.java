package com.baderkhane.supermariorun.fragements;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.baderkhane.supermariorun.R;
import com.baderkhane.supermariorun.adapter.HomeAdapter;
import com.baderkhane.supermariorun.model.Article;
import com.ecloud.pulltozoomview.PullToZoomScrollViewEx;

/**
 * Created by baderkhaneoussama@gmail.com on 01/01/2017.
 */

public class DetailFragement extends Fragment {
    public static final String TAG = "DetailFragement";
    private ImageView detailImageView;
    private TextView detailTextView;
    private PullToZoomScrollViewEx scrollView;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View mView = inflater.inflate(R.layout.detail_layout, container, false);
        /*detailImageView = (ImageView) mView.findViewById(R.id.detailImageView);
        detailTextView = (TextView) mView.findViewById(R.id.detailTextView);

        Bundle args = getArguments();
        Article mArticle = (Article) args
                .getSerializable(Article.TAG_MY_CLASS);

        Log.v(TAG,mArticle.imgSrc+"");
        detailImageView.setImageResource(mArticle.imgSrc);
        detailTextView.setText(mArticle.txt)*/
        //getActivity().getActionBar().setDisplayHomeAsUpEnabled(true);
        loadViewForCode(mView);

        scrollView = (PullToZoomScrollViewEx) mView.findViewById(R.id.scroll_view);
        scrollView.getPullRootView().findViewById(R.id.detailTextView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("zhuwenwu", "onClick -->");
            }
        });


        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
        int mScreenHeight = localDisplayMetrics.heightPixels;
        int mScreenWidth = localDisplayMetrics.widthPixels;
        LinearLayout.LayoutParams localObject = new LinearLayout.LayoutParams(mScreenWidth, (int) (9.0F * (mScreenWidth / 16.0F)));
        scrollView.setHeaderLayoutParams(localObject);

        return mView;
    }
    private void loadViewForCode(View mView) {
        PullToZoomScrollViewEx scrollView = (PullToZoomScrollViewEx) mView.findViewById(R.id.scroll_view);
        View headView = LayoutInflater.from(getContext()).inflate(R.layout.detail_header_view, null, false);
        View zoomView = LayoutInflater.from(getContext()).inflate(R.layout.detail_zoom_layout, null, false);
        View contentView = LayoutInflater.from(getContext()).inflate(R.layout.detail_content_layout, null, false);
        scrollView.setHeaderView(headView);
        scrollView.setZoomView(zoomView);
        scrollView.setScrollContentView(contentView);
    }
}
