package be.vdab.muziek.services;

import be.vdab.muziek.domain.Albums;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    List<Albums> findAll();
    Optional<Albums> findById(long id);
}
