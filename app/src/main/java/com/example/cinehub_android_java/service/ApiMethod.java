package com.example.cinehub_android_java.service;

import com.example.cinehub_android_java.model.MovieDetailModel;
import com.example.cinehub_android_java.model.MovieModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiMethod {
 @GET("discover/movie?")
 Call<MovieModel> getAllMoviePopularData();

 @GET("movie/{movie_id}")
 Call<MovieDetailModel> getMovieDetailData(
         @Path("movie_id") int movieId
 );

 @GET("search/movie?")
 Call<MovieModel> getSearchMovieListData(
         @Query("query") String query
 );

}
