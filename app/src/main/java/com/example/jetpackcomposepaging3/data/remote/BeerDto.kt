package com.example.jetpackcomposepaging3.data.remote

data class BeerDto(
    val id:Int,
    val name:String,
    val tagline:String,
    val description:String,
    val first_brewed:String,
    val image_url:String?

) {
}