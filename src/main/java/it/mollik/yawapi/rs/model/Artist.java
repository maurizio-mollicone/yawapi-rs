package it.mollik.yawapi.rs.model;

import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Artist {
    
    @Id
    @Column(name = "artist_id")
    private Integer artistId;

    @Column(name = "artist_name", length = 500, nullable = false)
    private String artistName;

    @Column(name = "artist_bio", length = 1000)
    private String artistBio;

    @Column(name = "artist_country", nullable = false)
    private Locale.IsoCountryCode artistCountry;

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

    public Locale.IsoCountryCode getArtistCountry() {
        return artistCountry;
    }

    public void setArtistCountry(Locale.IsoCountryCode artistCountry) {
        this.artistCountry = artistCountry;
    }

}
