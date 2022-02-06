package it.mollik.yawapi.rs.model.orm;

import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Artist {
    
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

}
