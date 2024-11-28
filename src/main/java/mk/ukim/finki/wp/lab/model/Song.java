package mk.ukim.finki.wp.lab.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Song {
    private Long id;
    private String trackId;
    private String title;
    private String genre;
    private int releaseYear;
    private List<Artist> performers;
    private List<Integer> ratings;
    private Album album;

    public Song(String trackId, String title, String genre, int releaseYear,Album album) {
        this.id = (long) (Math.random() * 1000);
        this.trackId = trackId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.performers = new ArrayList<>();
        this.ratings=new ArrayList<>();
        this.album=album;
    }
    public float getRating(){
        if(ratings.isEmpty()) return 0;
        return ratings.stream().reduce(Integer::sum).get() /(float)ratings.size();
    }
}
