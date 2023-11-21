package com.example.youtube.data.remote.model

import android.provider.MediaStore


data class Playlist(
    val kind: String,
    val items: List<Item>,
    val etag: String,
    val nextPageToken: String,
    val pageInfo: PageInfo,
    val snippet: Snippet
)

data class PageInfo(
    val totalResults: Int,
    val resultsPerPage: Int
)

data class Item(
    val kind: String,
    val etag: String,
    val id: String,
    val contentDetails: ContentDetails,
    val snippet: Snippet
)

data class ContentDetails(
    val itemCount: Int
)

data class Snippet(
    val publishedAt: String,
    val channelId: String,
    val title: String,
    val description: String,
    val thumbnails: MediaStore.Images.Thumbnails,
    val channelTitle: String,

    )