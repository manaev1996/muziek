package be.vdab.muziek.services;


import be.vdab.muziek.domain.Albums;
import be.vdab.muziek.repositories.AlbumRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DefaultAlbumService implements AlbumService{
    final AlbumRepository repository;

    public DefaultAlbumService(AlbumRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Albums> findAll(){
        return repository.findAll();
    }

    @Override
    public Optional<Albums> findById(long id) {
        return repository.findById(id);
    }
}
