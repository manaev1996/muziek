package be.vdab.muziek.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalTime;

@Entity
@Table(name = "labels")
public class Tracks {
    @Id
    long albumId;
    String naam;
    LocalTime tijd;

    public Tracks(long albumId, String naam, LocalTime tijd) {
        this.albumId = albumId;
        this.naam = naam;
        this.tijd = tijd;
    }
    protected Tracks(){}

    public long getAlbumId() {
        return albumId;
    }

    public String getNaam() {
        return naam;
    }

    public LocalTime getTijd() {
        return tijd;
    }
}
