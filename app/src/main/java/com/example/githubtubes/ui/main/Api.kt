package com.example.githubtubes.ui.main


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface Api {

    @GET ( "search user" )
    @Headers(  "Authorization : token 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")
    fun getSeacrhUsers(
        @Query ("q") query : String
    ):Call<UserResponse>


}