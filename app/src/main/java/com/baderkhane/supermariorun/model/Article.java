package com.baderkhane.supermariorun.model;

import java.io.Serializable;

/**
 * Created by baderkhaneoussama@gmail.com on 01/01/2017.
 */

public class Article implements Serializable {
    private static final long serialVersionUID = -2163051469151804394L;
    public static final String TAG_MY_CLASS = "Article_CLASS";

    public String txt;
    public int imgSrc;
    public Article(String txt, int imgSrc){
        this.txt = txt;
        this.imgSrc = imgSrc;
    }
}
