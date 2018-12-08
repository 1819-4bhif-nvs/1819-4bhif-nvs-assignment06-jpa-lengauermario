package at.htl.cinemamanagement.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NamedQuery(name = "Customer.findAll", query = "select c from Customer c")
public class Customer extends Person {
    private double customerNumber;
    private int bonuspoints;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String address, LocalDate birthday, String email, String phoneNumber, Cinema cinema, double customerNumber, int bonuspoints) {
        super(firstName, lastName, address, birthday, email, phoneNumber, cinema);
        this.customerNumber = customerNumber;
        this.bonuspoints = bonuspoints;
    }

    public double getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(double customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getBonuspoints() {
        return bonuspoints;
    }

    public void setBonuspoints(int bonuspoints) {
        this.bonuspoints = bonuspoints;
    }
}
