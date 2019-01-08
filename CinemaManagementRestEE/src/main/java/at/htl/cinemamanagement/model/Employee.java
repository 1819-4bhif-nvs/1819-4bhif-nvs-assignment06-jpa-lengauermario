package at.htl.cinemamanagement.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NamedQuery(name = "Employee.findAll", query = "select e from Employee e")
public class Employee extends Person{

    private double salary;
    private double personalNumber;
    private LocalDate employedSince;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String address, LocalDate birthday, String email, String phoneNumber, Cinema cinema, double salary, double personalNumber, LocalDate employedSince) {
        super(firstName, lastName, address, birthday, email, phoneNumber, cinema);
        this.salary = salary;
        this.personalNumber = personalNumber;
        this.employedSince = employedSince;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(double personalNumber) {
        this.personalNumber = personalNumber;
    }

    public LocalDate getEmployedSince() {
        return employedSince;
    }

    public void setEmployedSince(LocalDate employedSince) {
        this.employedSince = employedSince;
    }
}