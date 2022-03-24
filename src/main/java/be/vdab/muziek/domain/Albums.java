package be.vdab.muziek.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "albums")
public class Albums {
    @Id
    long id;
    long artiestId;
    long labelId;
    String naam;
    int jaar;
    long barcode;
    int score;

    public Albums(long id, long artiestId, long labelId, String naam, int jaar, long barcode, int score) {
        this.id = id;
        this.artiestId = artiestId;
        this.labelId = labelId;
        this.naam = naam;
        this.jaar = jaar;
        this.barcode = barcode;
        this.score = score;
    }
    protected Albums(){}

    public long getId() {
        return id;
    }

    public long getArtiestId() {
        return artiestId;
    }

    public long getLabelId() {
        return labelId;
    }

    public String getNaam() {
        return naam;
    }

    public int getJaar() {
        return jaar;
    }

    public long getBarcode() {
        return barcode;
    }

    public int getScore() {
        return score;
    }
}
