package at.htl.cinemamanagement.model;


import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NamedQuery(name = "Cinema.findAll", query = "select c from Cinema c")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private LocalDate inventionDate;


    @OneToMany(mappedBy = "cinema")
    @JsonbTransient
    private List<Hall> halls;

    @OneToMany
    @JsonbTransient
    private List<Person> personList;

    public Cinema() {
    }

    public Cinema(String name, String address, LocalDate inventionDate) {
        this.name = name;
        this.address = address;
        this.inventionDate = inventionDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getInventionDate() {
        return inventionDate;
    }

    public void setInventionDate(LocalDate inventionDate) {
        this.inventionDate = inventionDate;
    }

    public List<Hall> getHalls() {
        return halls;
    }

    public void setHalls(List<Hall> halls) {
        this.halls = halls;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
