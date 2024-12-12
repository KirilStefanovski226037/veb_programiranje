package mk.ukim.finki.wp.lab.repository.jpa;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mk.ukim.finki.wp.lab.model.Artist;
import java.util.List;
import java.util.Optional;

@Repository
@DependsOn("dataHolder")
public interface SongRepository extends JpaRepository<Song, Long> {

    Song findByTrackId(String trackId);
}
