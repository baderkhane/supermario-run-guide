package com.baderkhane.supermariorun;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baderkhane.supermariorun.fragements.DetailFragement;
import com.baderkhane.supermariorun.fragements.HomeFragement;
import com.baderkhane.supermariorun.model.Article;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startHome();
    }

    public void startHome(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        HomeFragement fragment= (HomeFragement)fragmentManager.findFragmentByTag(HomeFragement.TAG);

        if(fragment==null)
            fragment = new HomeFragement();

        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment,fragment.TAG);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    public void startDetail(Article article){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DetailFragement fragment= (DetailFragement)fragmentManager.findFragmentByTag(DetailFragement.TAG);

        if(fragment==null)
            fragment = new DetailFragement();
        Bundle args = new Bundle();
        args.putSerializable(article.TAG_MY_CLASS, article);
        fragment.setArguments(args);

        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment,fragment.TAG);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
