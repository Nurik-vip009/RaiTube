package com.example.youtube.data

import com.example.youtube.data.remote.model.Playlist
import com.example.youtube.data.remote.model.PlaylistItem
import com.example.youtube.data.remote.model.Videos
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("playlists")
    suspend fun getPlaylists(
        @Query("key") key: String,
        @Query("part") part: String,
        @Query("channelId") channelId: String,
    ): Response<Playlist>

    @GET("playlistItems")
    suspend fun getPlaylistItem(
        @Query("key") key: String,
        @Query("part") part: String,
        @Query("playlistId") playlistId: String,
    ): Response<PlaylistItem>

    @GET("videos")
    suspend fun getVideo(
        @Query("key") key: String,
        @Query("part") part: String,
        @Query("id") id: String
    ): Response<Videos>
}