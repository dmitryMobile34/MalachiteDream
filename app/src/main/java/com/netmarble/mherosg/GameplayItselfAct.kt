package com.netmarble.mherosg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_gameplay_itself.*

class GameplayItselfAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gameplay_itself)


    }

    fun showDownPart(view: View) {
        secondTxt.isVisible = true
        takeQuestBtn.isVisible = true
    }

    fun moveToQuest(view: View) {
        Intent(applicationContext, QuestItself::class.java).also { startActivity(it) }
        finish()
    }
}