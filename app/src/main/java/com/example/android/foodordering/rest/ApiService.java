package com.example.android.foodordering.rest;

import com.example.android.foodordering.models.RestaurantsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Princess on 1/20/2018.
 */

public interface ApiService {

    @GET("/publicapi/v1/restaurant/search")
    Call<RestaurantsResponse> getRestaurants();

}
