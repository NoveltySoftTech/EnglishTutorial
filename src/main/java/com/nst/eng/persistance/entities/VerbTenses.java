package com.nst.eng.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VerbTenses {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String present;
    private String past;
    private String pastParticiple;
    private String continues;
    //private String present3rdPerson;

    public void setPresent(String present) {
        this.present = present;
    }

    public String getPresent() {
        return present;
    }

    public void setPast(String past) {
        this.past = past;
    }

    public String getPast() {
        return past;
    }

    public void setPastParticiple(String pastParticiple) {
        this.pastParticiple = pastParticiple;
    }

    public String getPastParticiple() {
        return pastParticiple;
    }


    public void setContinues(String continues) {
        this.continues = continues;
    }

    public String getContinues() {
        return continues;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   /* public void setPresent3rdPerson(String present3rdPerson) {
        this.present3rdPerson = present3rdPerson;
    }

    public String getPresent3rdPerson() {
        return present3rdPerson;
    }
    */
}
