package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.repository.AlbumRepository;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;


public interface AlbumService {
    public List<Album> findAll();
    public Album findById(Long id);

}
