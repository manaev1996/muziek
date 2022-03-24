package be.vdab.muziek.domain;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "tracks")

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
