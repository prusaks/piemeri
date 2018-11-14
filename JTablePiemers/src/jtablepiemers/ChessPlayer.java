package jtablepiemers;

import java.io.Serializable;


public class ChessPlayer implements Serializable{
    
    private String name;
    private String surname;
    private int birthYear;
    private String country;
    private int standard;
    private int rapid;
    private int blitz;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getRapid() {
        return rapid;
    }

    public void setRapid(int rapid) {
        this.rapid = rapid;
    }

    public int getBlitz() {
        return blitz;
    }

    public void setBlitz(int blitz) {
        this.blitz = blitz;
    }    

}
