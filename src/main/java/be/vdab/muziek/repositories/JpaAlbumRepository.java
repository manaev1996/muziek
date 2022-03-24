package be.vdab.muziek.repositories;


import be.vdab.muziek.domain.Albums;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
class JpaAlbumRepository implements AlbumRepository{
    final EntityManager manager;

    public JpaAlbumRepository(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public List<Albums> findAll(){
        return manager.createQuery("select a from Albums a order by a.naam", Albums.class).getResultList();
    }

    @Override
    public Optional<Albums> findById(long id){
        return Optional.of(manager.find(Albums.class, id));
    }




}
