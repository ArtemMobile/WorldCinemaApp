package ru.avsematkin.srezapp2.service

import retrofit2.Call
import retrofit2.http.GET
import ru.avsematkin.srezapp2.model.Cover
import ru.avsematkin.srezapp2.model.Films

interface Service {
    @GET("cover")
    fun getCover(): Call<Cover>

    @GET("trend")
    fun getTrends(): Call<Films>

    @GET("new")
    fun getNews(): Call<Films>

    @GET("personal")
    fun getPersonal(): Call<Films>
}