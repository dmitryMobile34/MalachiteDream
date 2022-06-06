package com.netmarble.mherosg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_quest_itself.*

class QuestItself : AppCompatActivity() {

    var scoreCheck = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest_itself)
        tipBtn.setOnClickListener {
            statBarWiz.setText("Click on the potion!")
        }
        ption.setOnClickListener{
            scoreCheck++
            forScheck.setText(scoreCheck.toString())
            if(forScheck.text!! == "10"){
                wall.isVisible = false
                statBarWiz.setText("Oh no, My defensive wall!!")
            }
            if(forScheck.text!! == "15"){
                wall.isVisible = false
                statBarWiz.setText("Keep hitting him, hero!")
            }
            if(forScheck.text!! == "35"){
                wzrd.isVisible = false
                statBarWiz.setText("Oh no, I am defeated!")
                Intent(applicationContext, FinalAct::class.java).also { startActivity(it) }
                finish()
            }
    }

    }
}