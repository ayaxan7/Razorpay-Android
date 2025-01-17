package com.hustle.razorpaydemo.retrofitreq

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "YOUR_BACKEND_URL"

    val instance: RazorpayApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RazorpayApi::class.java)
    }
}
