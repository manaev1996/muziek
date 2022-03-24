package be.vdab.muziek.repositories;

import be.vdab.muziek.domain.Albums;

import java.util.List;
import java.util.Optional;

public interface AlbumRepository {
    List<Albums> findAll();
    Optional<Albums> findById(long id);
}
