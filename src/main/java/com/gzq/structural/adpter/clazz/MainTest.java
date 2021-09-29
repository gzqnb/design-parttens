package com.gzq.structural.adpter.clazz;

import com.gzq.structural.adpter.MoviePlayer;

public class MainTest {
    public static void main(String[] args) {
        MoviePlayer player = new MoviePlayer();
        JPMoviePlayerAdapter adapter = new JPMoviePlayerAdapter(player);
        adapter.play();
        player.play();
    }
}
