package mk.ukim.finki.wp.lab.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Song {
    private String trackId;
    private String title;
    private String genre;
    private int releaseYear;
    private List<Artist> performers;
    private List<Integer> ratings;

    public Song(String trackId, String title, String genre, int releaseYear) {
        this.trackId = trackId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.performers = new ArrayList<>();
        this.ratings=new ArrayList<>();
    }
    public float getRating(){
        if(ratings.isEmpty()) return 0;
        return ratings.stream().reduce(Integer::sum).get() /(float)ratings.size();
    }
}
