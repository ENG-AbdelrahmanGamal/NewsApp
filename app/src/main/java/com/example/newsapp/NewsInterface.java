package com.example.newsapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsInterface {
//https://newsapi.org/
    @GET("v2/everything?q=apple&from=2022-04-07&to=2022-04-07&sortBy=popularity&apiKey=5deda0267f2249a78a48ea54974074ea")
    Call <NewsResponse>getNews();
}
