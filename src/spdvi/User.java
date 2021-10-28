/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spdvi;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author merce
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String genre;
    private String lifeStatus;
    private int years;
    private String profile;

    public User(int id, String firstName, String lastName, LocalDate birthDate, String genre, String lifeStatus, String profile) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.genre = genre;
        this.lifeStatus = lifeStatus;
        this.profile = profile;
        
        Period period = Period.between(birthDate, LocalDate.now());
        this.years = period.getYears();
    }
public int getDay() {
        return birthDate.getDayOfMonth();
    }
    
    public void setDay(int day) {
        birthDate = LocalDate.of(birthDate.getYear(), birthDate.getMonthValue(), day);
    }
    
    public int getMonth() {
        return birthDate.getMonthValue();
    }
    
    public void setMonth(int month) {
        birthDate = LocalDate.of(birthDate.getYear(), month, birthDate.getDayOfMonth());
    }
    
    public int getYear() {
        return birthDate.getYear();
    }
    
    public void setYear(int year) {
        birthDate = LocalDate.of(year, birthDate.getMonthValue(), birthDate.getDayOfMonth());
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getLifeStatus() {
        return lifeStatus;
    }

    public void setLifeStatus(String lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getbirthDate() {
        return birthDate;
    }

    public void setbirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String isAlive() {
        return lifeStatus;
    }

    public void setAlive(String lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return String.format("%d: %s, %s - %d years old - %s - %s - User%d.jpg", id, lastName, firstName, years, genre, lifeStatus, id) + System.lineSeparator();
    }
    
    public String toFile() {
        return String.format("%d,%s,%s,%s,%s,%s,%s", id, lastName, firstName, birthDate, genre, lifeStatus, profile) + System.lineSeparator();
    }
}
