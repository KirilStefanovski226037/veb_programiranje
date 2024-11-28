package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Repository;
import mk.ukim.finki.wp.lab.model.Artist;
import java.util.List;
import java.util.Optional;

@Repository
@DependsOn("dataHolder")
public class SongRepository {
    public List<Song> findAll(){
        return DataHolder.songs;
    }
    public Optional<Song> findByTrackId(String trackId){
        return DataHolder.songs.stream().filter(song->song.getTrackId().equals(trackId)).findFirst();
    }
    public Artist addArtistToSong(Artist artist, Song song){
        song.getPerformers().removeIf(a->a.getId().equals(artist.getId()));
        song.getPerformers().add(artist);
        return artist;
    }
    public float getRating(Song song){
        return song.getRating();
    }
    public Song addRating(Song song,int rating){
        song.getRatings().add(rating);
        return song;
    }

}
