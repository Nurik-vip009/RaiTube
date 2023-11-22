package com.example.youtube.data.remote

import com.example.youtube.core.network.BaseDataSource
import com.example.youtube.data.ApiService
import com.example.youtube.utils.Constants
import org.koin.dsl.module

val remoteDataSource = module {
    factory { RemoteDataSource(get()) }
}

class RemoteDataSource(private val apiService: ApiService) : BaseDataSource() {
    suspend fun getPlaylists() = getResult {
        apiService.getPlaylists(
            BuildConfig.API_KEY,
            Constants.PART,
            Constants.CHANNEL_ID
        )
    }

    suspend fun getPlaylistItem(playlistId: String?) = getResult {
        apiService.getPlaylistItem(
            BuildConfig.API_KEY,
            Constants.PART,
            playlistId!!
        )
    }

    suspend fun getVideo(id: String?) = getResult {
        apiService.getVideo(
            BuildConfig.API_KEY,
            Constants.PART,
            id!!
        )
    }
}