package com.agoncalves.coroutines.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.agoncalves.coroutines.BaseViewModel
import com.agoncalves.coroutines.Interector.ItemInterector
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel : BaseViewModel( ) {
    override fun initialize() {

    }

    val item = ItemInterector()
    // TODO: Implement the ViewModel
    fun teste () {
        launch {
            try {
                val response = item.validateUserSession()
                Log.e("Sucesso", response.toString())

            } catch (e: Exception) {
                Log.e("Erro", e.toString())
            }
        }

    }
}
