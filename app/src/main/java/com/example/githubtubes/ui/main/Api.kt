package com.example.githubtubes.ui.main


import com.example.githubtubes.ui.main.model.DetailUserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query


interface Api {

    @GET ( "search/users" )
    @Headers( "Authorization:token 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")
    fun getSeacrhUsers(
        @Query ("q") query : String
    ): Call<UserResponse>

    @GET ( "users/{username}" )
    @Headers( "Authorization:token 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")
    fun  getUserDetail (
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers( "Authorization:token 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")
    fun  getFollowers (
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers( "Authorization:token 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")
    fun  getFollowing (
        @Path("username") username: String
    ): Call<ArrayList<User>>




}