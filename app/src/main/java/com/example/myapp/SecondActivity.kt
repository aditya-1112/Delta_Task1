package com.example.myapp

import android.app.Dialog
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    private lateinit var sf: SharedPreferences
    private lateinit var editor : SharedPreferences.Editor
    private lateinit var dialog: Dialog
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val word = intent.getStringExtra("word")
        val wordCap = word?.uppercase()
        val len = word?.length
        val clue = intent.getStringExtra("clue")
        val guess = findViewById<TextView>(R.id.guessed_word)
        var score: Int

        sf = getSharedPreferences("my_sf",MODE_PRIVATE)
        editor = sf.edit()
        val hs = sf.getInt("sf_hs",0)

        val clueBtn = findViewById<ImageView>(R.id.clue)
        val life1 = findViewById<ImageView>(R.id.heart1)
        val life2 = findViewById<ImageView>(R.id.heart2)
        val life3 = findViewById<ImageView>(R.id.heart3)

        val reset = findViewById<Button>(R.id.btnReset)
        val check = findViewById<Button>(R.id.btnCheck)

        val tile0 = findViewById<TextView>(R.id.tile0)
        val tile1 = findViewById<TextView>(R.id.tile1)
        val tile2 = findViewById<TextView>(R.id.tile2)
        val tile3 = findViewById<TextView>(R.id.tile3)
        val tile4 = findViewById<TextView>(R.id.tile4)
        val tile5 = findViewById<TextView>(R.id.tile5)
        val tile6 = findViewById<TextView>(R.id.tile6)
        val tile7 = findViewById<TextView>(R.id.tile7)
        val tile8 = findViewById<TextView>(R.id.tile8)
        val tile9 = findViewById<TextView>(R.id.tile9)
        val tile10 = findViewById<TextView>(R.id.tile10)
        val tile11 = findViewById<TextView>(R.id.tile11)
        val tile12 = findViewById<TextView>(R.id.tile12)
        val tile13 = findViewById<TextView>(R.id.tile13)
        val tile14 = findViewById<TextView>(R.id.tile14)
        val tile15 = findViewById<TextView>(R.id.tile15)

        var jumbled = jumble(wordCap)
        var guessedText: MutableList<String> = mutableListOf()
        for (i in 1..len!!) {
            guessedText += "_"
        }


        fun gridDisplay(jumbled: String) {
            guess.text = guessedText.joinToString("")
            tile0.text = jumbled[0].toString()
            tile1.text = jumbled[1].toString()
            tile2.text = jumbled[2].toString()
            tile3.text = jumbled[3].toString()
            tile4.text = jumbled[4].toString()
            tile5.text = jumbled[5].toString()
            tile6.text = jumbled[6].toString()
            tile7.text = jumbled[7].toString()
            tile8.text = jumbled[8].toString()
            tile9.text = jumbled[9].toString()
            tile10.text = jumbled[10].toString()
            tile11.text = jumbled[11].toString()
            tile12.text = jumbled[12].toString()
            tile13.text = jumbled[13].toString()
            tile14.text = jumbled[14].toString()
            tile15.text = jumbled[15].toString()
        }
        gridDisplay(jumbled)
        var index : Int
        tile0.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[0].toString()
                guess.text = guessedText.joinToString("")
                tile0.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile0.setBackgroundResource(R.drawable.guessed_word_tile)
                tile0.isClickable = false
                tileSound()
            }
        }
        tile1.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[1].toString()
                guess.text = guessedText.joinToString("")
                tile1.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile1.setBackgroundResource(R.drawable.guessed_word_tile)
                tile1.isClickable = false
                tileSound()

            }
        }
        tile2.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[2].toString()
                guess.text = guessedText.joinToString("")
                tile2.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile2.setBackgroundResource(R.drawable.guessed_word_tile)
                tile2.isClickable = false
                tileSound()
            }
        }
        tile3.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[3].toString()
                guess.text = guessedText.joinToString("")
                tile3.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile3.setBackgroundResource(R.drawable.guessed_word_tile)
                tile3.isClickable = false
                tileSound()
            }
        }
        tile4.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[4].toString()
                guess.text = guessedText.joinToString("")
                tile4.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile4.setBackgroundResource(R.drawable.guessed_word_tile)
                tile4.isClickable = false
                tileSound()
            }
        }
        tile5.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[5].toString()
                guess.text = guessedText.joinToString("")
                tile5.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile5.setBackgroundResource(R.drawable.guessed_word_tile)
                tile5.isClickable = false
                tileSound()
            }
        }
        tile6.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[6].toString()
                guess.text = guessedText.joinToString("")
                tile6.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile6.setBackgroundResource(R.drawable.guessed_word_tile)
                tile6.isClickable = false
                tileSound()
            }
        }
        tile7.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[7].toString()
                guess.text = guessedText.joinToString("")
                tile7.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile7.setBackgroundResource(R.drawable.guessed_word_tile)
                tile7.isClickable = false
                tileSound()
            }
        }
        tile8.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[8].toString()
                guess.text = guessedText.joinToString("")
                tile8.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile8.setBackgroundResource(R.drawable.guessed_word_tile)
                tile8.isClickable = false
                tileSound()
            }
        }
        tile9.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[9].toString()
                guess.text = guessedText.joinToString("")
                tile9.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile9.setBackgroundResource(R.drawable.guessed_word_tile)
                tile9.isClickable = false
                tileSound()
            }
        }
        tile10.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[10].toString()
                guess.text = guessedText.joinToString("")
                tile10.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile10.setBackgroundResource(R.drawable.guessed_word_tile)
                tile10.isClickable = false
                tileSound()
            }
        }
        tile11.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[11].toString()
                guess.text = guessedText.joinToString("")
                tile11.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile11.setBackgroundResource(R.drawable.guessed_word_tile)
                tile11.isClickable = false
                tileSound()
            }
        }
        tile12.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[12].toString()
                guess.text = guessedText.joinToString("")
                tile12.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile12.setBackgroundResource(R.drawable.guessed_word_tile)
                tile12.isClickable = false
                tileSound()
            }
        }
        tile13.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[13].toString()
                guess.text = guessedText.joinToString("")
                tile13.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile13.setBackgroundResource(R.drawable.guessed_word_tile)
                tile13.isClickable = false
                tileSound()
            }
        }
        tile14.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[14].toString()
                guess.text = guessedText.joinToString("")
                tile14.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile14.setBackgroundResource(R.drawable.guessed_word_tile)
                tile14.isClickable = false
                tileSound()
            }
        }
        tile15.setOnClickListener {
            index = guessedText.indexOf("_")
            if(index>=0) {
                guessedText[index] = jumbled[15].toString()
                guess.text = guessedText.joinToString("")
                tile15.setTextColor(Color.parseColor("#FFFFFFFF"))
                tile15.setBackgroundResource(R.drawable.guessed_word_tile)
                tile15.isClickable = false
                tileSound()
            }
        }

        clueBtn.setOnClickListener {
            dialog = Dialog(this)
            dialog.setContentView(R.layout.clue_dialog)
            dialog.show()
            val okay = dialog.findViewById<Button>(R.id.infoOkay)
            val clueText = dialog.findViewById<TextView>(R.id.cluetext)
            clueText.text = clue
            clueSound()
            okay.setOnClickListener {
                dialog.dismiss()
            }
        }

        fun resetGrid() {
            for(i in 1..len!!) {
                guessedText[i-1] = "_"
            }
            tile0.setTextColor(Color.parseColor("#FF000000"))
            tile0.setBackgroundResource(R.drawable.letter_tile)
            tile1.setTextColor(Color.parseColor("#FF000000"))
            tile1.setBackgroundResource(R.drawable.letter_tile)
            tile2.setTextColor(Color.parseColor("#FF000000"))
            tile2.setBackgroundResource(R.drawable.letter_tile)
            tile3.setTextColor(Color.parseColor("#FF000000"))
            tile3.setBackgroundResource(R.drawable.letter_tile)
            tile4.setTextColor(Color.parseColor("#FF000000"))
            tile4.setBackgroundResource(R.drawable.letter_tile)
            tile5.setTextColor(Color.parseColor("#FF000000"))
            tile5.setBackgroundResource(R.drawable.letter_tile)
            tile6.setTextColor(Color.parseColor("#FF000000"))
            tile6.setBackgroundResource(R.drawable.letter_tile)
            tile7.setTextColor(Color.parseColor("#FF000000"))
            tile7.setBackgroundResource(R.drawable.letter_tile)
            tile8.setTextColor(Color.parseColor("#FF000000"))
            tile8.setBackgroundResource(R.drawable.letter_tile)
            tile9.setTextColor(Color.parseColor("#FF000000"))
            tile9.setBackgroundResource(R.drawable.letter_tile)
            tile10.setTextColor(Color.parseColor("#FF000000"))
            tile10.setBackgroundResource(R.drawable.letter_tile)
            tile11.setTextColor(Color.parseColor("#FF000000"))
            tile11.setBackgroundResource(R.drawable.letter_tile)
            tile12.setTextColor(Color.parseColor("#FF000000"))
            tile12.setBackgroundResource(R.drawable.letter_tile)
            tile13.setTextColor(Color.parseColor("#FF000000"))
            tile13.setBackgroundResource(R.drawable.letter_tile)
            tile14.setTextColor(Color.parseColor("#FF000000"))
            tile14.setBackgroundResource(R.drawable.letter_tile)
            tile15.setTextColor(Color.parseColor("#FF000000"))
            tile15.setBackgroundResource(R.drawable.letter_tile)
            tile0.isClickable = true
            tile1.isClickable = true
            tile2.isClickable = true
            tile3.isClickable = true
            tile4.isClickable = true
            tile5.isClickable = true
            tile6.isClickable = true
            tile7.isClickable = true
            tile8.isClickable = true
            tile9.isClickable = true
            tile10.isClickable = true
            tile11.isClickable = true
            tile12.isClickable = true
            tile13.isClickable = true
            tile14.isClickable = true
            tile15.isClickable = true
            jumbled = jumble(wordCap)
            gridDisplay(jumbled)
            resetSound()
        }



        fun gameOverDisplay(score: Int) {
            dialog = Dialog(this)
            dialog.setContentView(R.layout.game_over)
            dialog.show()
            val scoreDisplay = dialog.findViewById<TextView>(R.id.high_Score)
            val home = dialog.findViewById<Button>(R.id.homebtn)
            scoreDisplay.text = if(score > hs) {
                getString(R.string.new_high_score,score)
            }
            else {
                getString(R.string.your_score,score)
            }
            home.setOnClickListener {
                val intent1 = Intent(this,MainActivity::class.java)
                startActivity(intent1)
            }
        }

        reset.setOnClickListener {
            resetGrid()
            Toast.makeText(this,"Grid and selections reset",Toast.LENGTH_SHORT).show()
        }


        var lives = 3
        check.setOnClickListener {
            if(guessedText.indexOf("_")>(-1)) {
                Toast.makeText(this,"Please enter all the letters!",Toast.LENGTH_SHORT).show()
            }
            else {
                var equal = true
                for(i in 1..len!!) {  //comparison of entered word with original word
                    if(guessedText[i-1]!= (wordCap?.get(i-1)).toString()) {
                        equal = false
                        break
                    }
                }

                if(!equal) {
                    lives--
                    when (lives) {
                        2 -> life1.visibility = INVISIBLE
                        1 -> life2.visibility = INVISIBLE
                        0 -> life3.visibility = INVISIBLE
                    }
                    if(lives>0) {
                        Toast.makeText(this,"Incorrect guess!",Toast.LENGTH_SHORT).show()
                        resetGrid()
                        incorrectSound()
                    }
                    else {
                        score = 0
                        Toast.makeText(this,"Better luck next time!",Toast.LENGTH_SHORT).show()
                        gameOverDisplay(score)
                        loseSound()
                    }
                }
                else {

                    score = lives*100*len!!
                    if(score > hs) {
                        editor.apply{
                            putInt("sf_hs",score)
                            commit()
                        }
                    }
                    Toast.makeText(this,"You won!!",Toast.LENGTH_SHORT).show()
                    gameOverDisplay(score)
                    winSound()

                }
            }

        }



    }
    fun loseSound() {
        mediaPlayer = MediaPlayer.create(this,R.raw.losing_sound)
        mediaPlayer.start()
    }
    fun tileSound() {
        mediaPlayer = MediaPlayer.create(this,R.raw.tile_click)
        mediaPlayer.start()
    }
    fun winSound() {
        mediaPlayer = MediaPlayer.create(this,R.raw.win_sound)
        mediaPlayer.start()
    }
    fun incorrectSound() {
        mediaPlayer = MediaPlayer.create(this,R.raw.incorrect)
        mediaPlayer.start()
    }
    fun clueSound() {
        mediaPlayer = MediaPlayer.create(this,R.raw.clue)
        mediaPlayer.start()
    }
    fun resetSound() {
        mediaPlayer = MediaPlayer.create(this,R.raw.reset)
        mediaPlayer.start()
    }


    private fun jumble(word: String?) :String {
        var ls = word?.toMutableList()
        while(ls?.size!=16) {
            val rand = ('A'..'Z').random()
            if(ls?.indexOf(rand)==-1) {
                ls?.add(rand)
            }
        }
        ls?.shuffle()
        return(ls.joinToString(""))
    }
}

