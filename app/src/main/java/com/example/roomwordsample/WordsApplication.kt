package com.example.roomwordsample

import android.app.Application
import com.example.roomwordsample.data.WordRoomDatabase
import com.example.roomwordsample.repository.WordRepository

class WordsApplication : Application() {
    val database : WordRoomDatabase by lazy { WordRoomDatabase.getDatabase(this) }
    val repository : WordRepository by lazy { WordRepository(database.wordDao()) }
}