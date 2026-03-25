@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package com.nhta.meme_creator.meme_editor.data

import androidx.compose.ui.unit.IntSize
import com.nhta.meme_creator.meme_editor.domain.MemeExporter
import com.nhta.meme_creator.meme_editor.domain.MemeText
import com.nhta.meme_creator.meme_editor.domain.SaveToStorageStrategy

expect class PlatformMemeExporter: MemeExporter {
    override suspend fun exportMeme(
        backgroundImageBytes: ByteArray,
        memeTexts: List<MemeText>,
        templateSize: IntSize,
        saveToStorageStrategy: SaveToStorageStrategy,
        fileName: String
    ): Result<String>
}