package com.pam.recyclerview_2523;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] movie = {"Iron Man","The Incredible Hulk","Thor"
            ,"Captain America","Iron Man 2","Avengers","Iron Man 3","The Winter Soldiers",
            "The Dark World","Age Of Ultron","Civil War","Homecoming","Black Panther","Thor: Ragnarok",
            "Captain Marvel","Infinity War","Endgame","Far From Home"};

    private String[] movieYear = {"2008","2008","2011","2011","2012","2012","2013",
            "2014","2014","2015","2016","2017","2017","2017","2018","2018","2019","2019"};

    private ArrayList<Movie> movieList;
    private RecyclerView rvMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieList = new ArrayList<>();

        for (int i = 0; i < (movie.length); i++){
            Movie mov = new Movie(movie[i], movieYear[i]);
            movieList.add(mov);
        }

        rvMovie = findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        rvMovie.setLayoutManager(new LinearLayoutManager(this));

        MovieAdapter movieAdapter = new MovieAdapter(movieList);
        rvMovie.setAdapter(movieAdapter);
    }
}