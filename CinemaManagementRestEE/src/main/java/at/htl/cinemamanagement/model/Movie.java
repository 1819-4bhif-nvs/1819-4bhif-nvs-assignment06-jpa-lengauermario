package at.htl.cinemamanagement.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@NamedQuery(name = "Movie.findAll", query = "select m from Movie m")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Date dateOfAppearance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateOfAppearance() {
        return dateOfAppearance;
    }

    public void setDateOfAppearance(Date dateOfAppearance) {
        this.dateOfAppearance = dateOfAppearance;
    }

}
