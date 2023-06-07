package Entites;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Rental {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "rentalId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "instrumentId", nullable = false)
    private Instrument instrument;

    @Column (name = "rental_start_date", nullable = false)
    private LocalDate startDate;

    @Column (name = "rental_end_date", nullable = false)
    private LocalDate endDate;

    //Rental price?


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
