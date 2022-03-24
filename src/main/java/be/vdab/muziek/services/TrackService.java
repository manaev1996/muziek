package be.vdab.muziek.services;

import be.vdab.muziek.domain.Tracks;

import java.util.List;

public interface TrackService {
    List<Tracks> findById(long albumId);
}
