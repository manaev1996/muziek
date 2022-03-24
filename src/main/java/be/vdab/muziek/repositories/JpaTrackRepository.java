package be.vdab.muziek.repositories;

import be.vdab.muziek.domain.Tracks;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
class JpaTrackRepository implements TrackRepository{
    final EntityManager manager;

    public JpaTrackRepository(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public List<Tracks> findById(long albumId){
        return manager.createQuery("select t from Tracks t where t.albumId = :albumId", Tracks.class)
                .setParameter("albumId", albumId)
                .getResultList();
    }
}

