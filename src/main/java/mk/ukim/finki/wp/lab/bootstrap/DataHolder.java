package mk.ukim.finki.wp.lab.bootstrap;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artists;
    public static List<Song> songs;

    @PostConstruct
    public void init(){
        System.out.println("dataholder init ");
        artists=new ArrayList<>(5);
        artists.add(new Artist("Amy","Winehouse","born ..."));
        artists.add(new Artist("Bjork"," ","born ..."));
        artists.add(new Artist("Camilla","Cabello","born ..."));
        artists.add(new Artist("Dua","Lipa","born ..."));

        songs=new ArrayList<>(5);
        songs.add(new Song("1","Lorem","Ipsum",2014));
        songs.add(new Song("2","dolor","sit ",2015));
        songs.add(new Song("3","amet","consectetur ",2016));
        songs.add(new Song("4","adipiscing","elit ",2017));
    }

}
