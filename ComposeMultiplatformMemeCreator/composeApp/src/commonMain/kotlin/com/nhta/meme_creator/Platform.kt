package com.nhta.meme_creator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform