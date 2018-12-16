package com.example.android.roomwordsample.repositories

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread
import com.example.android.roomwordsample.db.interfaces.WordDao
import com.example.android.roomwordsample.entities.Word

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}