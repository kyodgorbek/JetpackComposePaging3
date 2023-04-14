package com.example.jetpackcomposepaging3.data.mappers

import com.example.jetpackcomposepaging3.data.local.BeerEntity
import com.example.jetpackcomposepaging3.data.remote.BeerDto
import com.example.jetpackcomposepaging3.domain.Beer

fun BeerDto.toBeerEntity():BeerEntity{
    return BeerEntity(id = id,
                     name = name,
                     tagline = tagline,
                     description = description,
                     firstBrewed =  first_brewed,
                     imageUrl = image_url)
}
fun BeerEntity.toBeer(): Beer {
    return Beer(id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed =  firstBrewed,
        imageUrl = imageUrl)
}