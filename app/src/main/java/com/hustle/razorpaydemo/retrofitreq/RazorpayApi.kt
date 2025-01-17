package com.hustle.razorpaydemo.retrofitreq

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

data class OrderRequest(val amount: Int)
data class OrderResponse(val id: String, val amount: Int, val currency: String)

interface RazorpayApi {
    @POST("/create_order")
    fun createOrder(@Body request: OrderRequest): Call<OrderResponse>
}
