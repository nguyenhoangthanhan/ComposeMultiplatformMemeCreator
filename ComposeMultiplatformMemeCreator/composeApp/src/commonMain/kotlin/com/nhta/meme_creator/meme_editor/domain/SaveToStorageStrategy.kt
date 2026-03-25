package com.nhta.meme_creator.meme_editor.domain

interface SaveToStorageStrategy {
    fun getFilePath(fileName: String): String
}