package mk.ukim.finki.wp.lab.bootstrap;

import mk.ukim.finki.wp.lab.model.Album;
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
    public static List<Album> albums;

    @PostConstruct
    public void init(){
        System.out.println("dataholder init ");
        artists=new ArrayList<>(5);
        artists.add(new Artist("Amy","Winehouse","born ..."));
        artists.add(new Artist("Bjork"," ","born ..."));
        artists.add(new Artist("Camilla","Cabello","born ..."));
        artists.add(new Artist("Dua","Lipa","born ..."));

        albums=new ArrayList<>(5);
        albums.add(new Album("alb1","gen1","2014"));
        albums.add(new Album("alb2","gen2","2024"));
        albums.add(new Album("alb3","gen3","2035"));
        albums.add(new Album("alb4","gen4","2046"));
        albums.add(new Album("alb5","gen5","2011"));

        songs=new ArrayList<>(5);
        songs.add(new Song("1","Lorem","Ipsum",2014,albums.get(0)));
        songs.add(new Song("2","dolor","sit ",2015,albums.get(1)));
        songs.add(new Song("3","amet","consectetur ",2016,albums.get(2)));
        songs.add(new Song("4","adipiscing","elit ",2017,albums.get(3)));


    }

}
