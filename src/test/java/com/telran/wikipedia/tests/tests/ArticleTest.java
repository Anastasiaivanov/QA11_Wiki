package com.telran.wikipedia.tests.tests;

import org.testng.annotations.Test;

public class ArticleTest extends TestBase{

    @Test
    public void addArticleToFavouriteAndRemove (){
        System.out.println("app opened");
        app.article().search();
        app.article().addToFavourite();
        app.article().createReadingList();
        app.article().close();
        app.article().removeFromFavourites();
    }
}
