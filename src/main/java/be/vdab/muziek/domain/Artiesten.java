package be.vdab.muziek.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "artikels")
public class Artiesten {
    @Id
    long id;
    String naam;

    public Artiesten(long id, String naam) {
        this.id = id;
        this.naam = naam;
    }
    protected  Artiesten(){}

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }
}
