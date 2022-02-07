package it.mollik.yawapi.rs.model.orm;

import java.io.Serializable;
import java.util.Locale;
import java.util.StringJoiner;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.StringUtils;

@MappedSuperclass
public class Artist implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "artist_id")
    private Integer artistId;

    @Column(name = "artist_name", length = 500, nullable = false)
    private String artistName;

    @Column(name = "artist_bio", length = 1000)
    private String artistBio;

    @Column(name = "artist_country", nullable = false)
    private Locale artistCountry;

    public Artist() {
        this(StringUtils.EMPTY, Locale.ITALY);
    }

    public Artist(String name, Locale country) {
        this.artistName = name;
        this.artistCountry = country;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Locale getArtistCountry() {
        return artistCountry;
    }

    public void setArtistCountry(Locale artistCountry) {
        this.artistCountry = artistCountry;
    }

    @Override
    public String toString() {
        String id = this.getArtistId() != null ? this.getArtistId().toString() : StringUtils.EMPTY;
        return new StringJoiner(StringUtils.EMPTY).add("Artist: [").add("artistId: ").add(id).add(", name: ").add(this.getArtistName()).add("]").toString();
    }
}
