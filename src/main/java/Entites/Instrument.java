package Entites;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Instrument {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    @Column(name = "instrumentId", nullable = false)
    private int instrumentId;

    //Ex. Gibson Les Paul
    @Column (name = "instrumentName", length = 25, nullable = false)
    private String instrumentName;

//Ex. Elgitarr, akustisk gitarr eller bas
    @Column(name = "instrument_type")
    private String type;

//Ex. Stränginstrument eller slaginstrument
    @Column(name = "instrument_category")
    private String category;

    @OneToMany(mappedBy = "instrument")
    List <Rental> rentals;


    public Instrument(){

    }

    public Instrument(String instrumentName, String type, String category){
        this.instrumentName = instrumentName;
        this.type = type;
        this.category = category;
    }

    public int getInstrumentId(){
        return instrumentId;
    }
    public void setInstrumentId(int id){
        this.instrumentId = id;
    }

    public String getInstrumentName(){
        return instrumentName;
    }
    public void setInstrumentName(String name){
        this.instrumentName = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }


}
