package com.example.android.movie_app;

import android.net.Uri;

/**
 * Created by user on 29-Jan-18.
 */

public class Movie {
    private static final String LOG_TAG = Movie.class.getName();
    private static final String IMAGE_BASE_URL = "http://image.tmdb.org/t/p";

    private String title;
    private String movieId;
    private String overview;
    private String releaseDate;
    private String posterPath;
    private String backDropPath;
    private Double voteAvg;

    public Movie(String title, String id, String posterPath) {
        this.title = title;
        this.movieId = movieId;
        this.posterPath =posterPath;

    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleaseDate() {

        return releaseDate;
    }

    public String getMovieId() {
        return movieId;
    }

    public Uri getPosterPath() {
        return Uri.parse(IMAGE_BASE_URL).buildUpon().appendEncodedPath(posterPath).build();
    }

    public Uri getBackDropPath() {
        return Uri.parse(IMAGE_BASE_URL).buildUpon().appendEncodedPath(backDropPath).build();
    }

    public Double getVoteAvg() {
        return voteAvg;
    }

}