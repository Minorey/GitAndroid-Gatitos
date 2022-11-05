package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("esto es un ejemplo")
        print("esto es un ejemplo")
        print("esto es un ejemplo")
        print("esto es un ejemplo")
        print("esto es un ejemplo")
        print("esto es un ejemplo")
        print("esto es un ejemplo")
        print("esto es un ejemplo")

        val recycler = findViewById<RecyclerView>(R.id.recycler)

        val layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
            //LinearLayoutManager(this,
            //LinearLayoutManager.VERTICAL, true )
        recycler.layoutManager = layoutManager

        recycler.adapter = MoviesAdapter(listOf(
            Movie("Movie 1", "https://loremflickr.com/320/240?lock=1"),
            Movie("Movie 2", "https://loremflickr.com/320/240?lock=2"),
            Movie("Movie 3", "https://loremflickr.com/320/240?lock=3"),
            Movie("Movie 4", "https://loremflickr.com/320/240?lock=4"),
            Movie("Movie 5", "https://loremflickr.com/320/240?lock=5"),
            Movie("Movie 6", "https://loremflickr.com/320/240?lock=6"),
            Movie("Movie 7", "https://loremflickr.com/320/240?lock=7"),
            Movie("Movie 8", "https://loremflickr.com/320/240?lock=8"),
            Movie("Movie 9", "https://loremflickr.com/320/240?lock=9"),
            Movie("Movie 10", "https://loremflickr.com/320/240?lock=10"),
            Movie("Movie 11", "https://loremflickr.com/320/240?lock=11"),
            Movie("Movie 12", "https://loremflickr.com/320/240?lock=12"),
            Movie("Movie 13", "https://loremflickr.com/320/240?lock=13"),
            Movie("Movie 14", "https://loremflickr.com/320/240?lock=14"),
            Movie("Movie 15", "https://loremflickr.com/320/240?lock=15"),
            ))
        //val movie = findViewById<MoviView>(R.id.movie)
        //movie.setMovie(Movie("Batman", "https://loremflickr.com/320/240"))
        //con el codigo del minuto 1:56:20
        //var cover = findViewById<AspectRatioImageView>(R.id.cover)
        //cover.ratio= 1.5f
        }
    }


