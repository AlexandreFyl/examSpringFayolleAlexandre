package com.humanbooster.examSpringFayolleAlexandre3.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    @NotNull(message = "Le titre ne peut pas etre vide")
    @NotBlank(message = "Le titre ne peut pas etre vide")
    private String title;

    @Column(name = "content")
    @NotNull(message = "Le contenu ne peut pas etre vide")
    @NotBlank(message = "Le contenu ne peut pas etre vide")
    private String content;

    @Column(name = "image")
    @NotNull(message = "L'url de l'image ne peut pas etre vide")
    @NotBlank(message = "L'url de l'image ne peut pas etre vide")
    private String image;

    @Column(name = "publishing_date")
    @NotNull(message = "La date ne peut pas etre vide")
    @NotBlank(message = "La date ne peut pas etre vide")
    private Date publishing_date;

    public News() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getPublishing_date() {
        return publishing_date;
    }

    public void setPublishing_date(Date publishing_date) {
        this.publishing_date = publishing_date;
    }
}
