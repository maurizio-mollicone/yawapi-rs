package it.mollik.yawapi.rs.model.orm;

import java.io.Serializable;
import java.util.Locale;
import java.util.StringJoiner;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import org.apache.commons.lang3.StringUtils;

@MappedSuperclass
@JsonIdentityInfo(generator =  ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Artist implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 500, nullable = false)
    private String name;

    @Column(name = "bio", length = 1000)
    private String bio;


    @Column(name = "country", nullable = false)
    private Locale country;

    public Artist() {
        this(StringUtils.EMPTY, Locale.ITALY);
    }

    public Artist(String name, Locale country) {
        this.name = name;
        this.country = country;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Locale getCountry() {
        return country;
    }

    public void setCountry(Locale country) {
        this.country = country;
    }
    @Override
    public String toString() {
        String artistId = getId() != null ? this.getId().toString() : StringUtils.EMPTY;
        return new StringJoiner(StringUtils.EMPTY).add("Artist: [").add("artistId: ").add(artistId).add(", name: ").add(this.getName()).add("]").toString();
    }



}
