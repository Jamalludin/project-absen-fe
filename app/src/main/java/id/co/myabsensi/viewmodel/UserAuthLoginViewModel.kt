package id.co.myabsensi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.co.myabsensi.model.UserAuthLoginModel

class UserAuthLoginViewModel: ViewModel() {

    lateinit var dataLogin: MutableLiveData<UserAuthLoginModel>
    init {
        dataLogin = MutableLiveData()
    }

    fun getLiveDataObserver(): MutableLiveData<UserAuthLoginModel> {
        return dataLogin
    }

    fun makeApiCall() {

    }
}