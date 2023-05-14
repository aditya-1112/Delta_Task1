package com.example.myapp

import android.app.Dialog
import android.content.Intent
import android.content.SharedPreferences
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var sf:SharedPreferences
    private lateinit var dialog1: Dialog
    private lateinit var mediaPlayer1: MediaPlayer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val word = findViewById<EditText>(R.id.Word)
        val clue = findViewById<EditText>(R.id.Clue)
        val startButton = findViewById<Button>(R.id.Start)
        val highScoreButton = findViewById<Button>(R.id.highscore)

        sf=getSharedPreferences("my_sf", MODE_PRIVATE)
        var highscore = sf.getInt("sf_hs",0)




        var enteredWord = ""
        var enteredClue = ""
        startButton.setOnClickListener {
            enteredWord = word.text.toString()
            enteredClue = clue.text.toString()
            if(enteredWord == "" || enteredClue == "")  {
                Toast.makeText(
                    this@MainActivity,
                    "Please enter the word and clue!",
                    Toast.LENGTH_SHORT
                ).show()

            }
            else {
                if(enteredWord.length<17) {
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("word", enteredWord)
                    intent.putExtra("clue", enteredClue)
                    startActivity(intent)
                    startSound()
                }
                else{
                    Toast.makeText(
                        this@MainActivity,
                        "Word should not exceed 16 characters!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

        }
        highScoreButton.setOnClickListener {
            dialog1 = Dialog(this)
            dialog1.setContentView(R.layout.high_score)
            dialog1.show()
            val highScoreDisplay = dialog1.findViewById<TextView>(R.id.high_Score)
            highScoreDisplay.text = highscore.toString()
        }

    }
    fun startSound() {
        mediaPlayer1 = MediaPlayer.create(this,R.raw.start_sound)
        mediaPlayer1.start()
    }



}