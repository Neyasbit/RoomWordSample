package com.example.roomwordsample

import android.app.Application
import com.example.roomwordsample.data.WordRoomDatabase
import com.example.roomwordsample.repository.WordRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WordsApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())
    val database : WordRoomDatabase by lazy { WordRoomDatabase.getDatabase(this, applicationScope) }
    val repository : WordRepository by lazy { WordRepository(database.wordDao()) }
}