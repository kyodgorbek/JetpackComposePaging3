package com.example.jetpackcomposepaging3.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface BeerApi {
    @GET("beers")
    suspend fun getBears(
        @Query("page") page: Int,
        @Query("page_count") pageCount: Int
    ):List<BeerDto>

    companion object{
        const val BASE_URL = "https://api.punkapi.com/v2/"
    }
}