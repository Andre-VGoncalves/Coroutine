package com.agoncalves.coroutines.retrofit

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface API {


    @GET("/users")
    suspend fun userId() : Any
}