package id.co.myabsensi.retrofitinterface

import id.co.myabsensi.model.UserAuthLoginModel
import retrofit2.Call
import retrofit2.http.POST

interface RetroServiceLoginInterface {
    @POST("login")
    fun userLogin(): Call<UserAuthLoginModel>
}