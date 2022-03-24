package be.vdab.muziek.repositories;

import be.vdab.muziek.domain.Tracks;

import java.util.List;

public interface TrackRepository {
    List<Tracks> findById(long albumId);
}
