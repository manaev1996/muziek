package be.vdab.muziek.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "labels")
public class Labels {
    @Id
    long id;
    String naam;

    public Labels(long id, String naam) {
        this.id = id;
        this.naam = naam;
    }
    protected Labels(){}

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }
}
