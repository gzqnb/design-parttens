package com.gzq.structural.adpter.object;

import com.gzq.structural.adpter.MoviePlayer;
import com.gzq.structural.adpter.clazz.JPMoviePlayerAdapter;

public class MainTest {
    public static void main(String[] args) {
        JPMoviePlayerAdapter adapter = new JPMoviePlayerAdapter(new MoviePlayer());
        adapter.play();
    }
}
