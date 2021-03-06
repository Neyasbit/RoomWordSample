package com.example.roomwordsample.repository

import androidx.annotation.WorkerThread
import com.example.roomwordsample.data.WordDao
import com.example.roomwordsample.model.Word
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {

    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}