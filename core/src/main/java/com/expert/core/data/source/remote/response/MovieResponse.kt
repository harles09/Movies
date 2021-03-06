package com.expert.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

class MovieResponse (
    @field:SerializedName("id")
    val id: String,

    @field:SerializedName("original_title")
    val originalTitle: String,

    @field:SerializedName("overview")
    val overview: String,

    @field:SerializedName("poster_path")
    val posterNow: String,

    @field:SerializedName("release_date")
    val releaseNow: String?,

    @field:SerializedName("vote_average")
    val voteAverage: String
)