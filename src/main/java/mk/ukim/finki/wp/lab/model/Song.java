package mk.ukim.finki.wp.lab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Song {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String trackId;
    private String title;
    private String genre;
    private int releaseYear;

    @ManyToMany(mappedBy = "songs")
    List<Artist> performers = new ArrayList<>();

    @ManyToOne
    private Album album;

    public Song( String title,String trackId, String genre, int releaseYear,Album album) {
        this.id = (long) (Math.random() * 1000);
        this.trackId = trackId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.album=album;
    }
}
