package com.example.autori;

public class Autor {

    private String firstName;
    private String lastName;
    private int numberOfPublishedBooks;
    private String bestseller;
    private int numberOfSelledBestsellerBooks;

    public Autor() {

    }

    public Autor(String firstName, String lastName, int numberOfPublishedBooks,
                 String bestseller, int numberOfSelledBestsellerBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfPublishedBooks = numberOfPublishedBooks;
        this.bestseller = bestseller;
        this.numberOfSelledBestsellerBooks = numberOfSelledBestsellerBooks;
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

    public int getNumberOfPublishedBooks() {
        return numberOfPublishedBooks;
    }

    public void setNumberOfPublishedBooks(int numberOfPublishedBooks) {
        this.numberOfPublishedBooks = numberOfPublishedBooks;
    }

    public String getBestseller() {
        return bestseller;
    }

    public void setBestseller(String bestseller) {
        this.bestseller = bestseller;
    }

    public int getNumberOfSelledBestsellerBooks() {
        return numberOfSelledBestsellerBooks;
    }

    public void setNumberOfSelledBestsellerBooks(int numberOfSelledBestsellerBooks) {
        this.numberOfSelledBestsellerBooks = numberOfSelledBestsellerBooks;
    }
// zavrsena klasa
}
