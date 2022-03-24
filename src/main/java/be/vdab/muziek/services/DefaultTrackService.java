package be.vdab.muziek.services;

import be.vdab.muziek.domain.Tracks;
import be.vdab.muziek.repositories.TrackRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DefaultTrackService implements TrackService{

    final TrackRepository repository;

    public DefaultTrackService(TrackRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Tracks> findById(long albumId) {
        return repository.findById(albumId);
    }
}
