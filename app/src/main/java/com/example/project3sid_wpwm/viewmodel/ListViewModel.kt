package com.example.project3sid_wpwm.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.project3sid_wpwm.api.PhotosService
import com.example.project3sid_wpwm.model.Photo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers


class ListViewModel : ViewModel() {
    private val photosService = PhotosService()
    private val disposable = CompositeDisposable()
    val photos = MutableLiveData<List<Photo>>()

    fun fetchData() {
        disposable.add(
            photosService.getPhotos()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object :
                    DisposableSingleObserver<List<Photo>>() {
                    override fun onSuccess(value: List<Photo>?) {
                        photos.value = value
                    }

                    override fun onError(e: Throwable?) {
                        Log.e("ERRORFETCHDATA", "error$e")
                    }
                })
        )
    }
    override fun onCleared(){
        super.onCleared()
        disposable.clear()
    }
}
