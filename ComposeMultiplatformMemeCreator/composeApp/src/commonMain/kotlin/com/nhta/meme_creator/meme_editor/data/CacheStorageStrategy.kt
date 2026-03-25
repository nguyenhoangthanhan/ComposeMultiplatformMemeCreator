package com.nhta.meme_creator.meme_editor.data

import com.nhta.meme_creator.meme_editor.domain.SaveToStorageStrategy


expect class CacheStorageStrategy: SaveToStorageStrategy {
    override fun getFilePath(fileName: String): String
}