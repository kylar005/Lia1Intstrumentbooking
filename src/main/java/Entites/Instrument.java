package Entites;
import jakarta.persistence.*;
import javax.annotation.processing.Generated;
@Entity
public class Instrument {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    @Column(name = "instruID", nullable = false)
    private int instruID;

    @Column (name = "instruName", length = 25, nullable = false)
    private String instruName;

    @Column(name = "amount", nullable = false)
    private int amount;


    public Instrument(){

    }

    public Instrument(int instruID, String instruName, int amount){
        this.instruID = instruID;
        this.instruName = instruName;
        this.amount = amount;
    }

    public int getInstruID(){
        return instruID;
    }
    public void setInstruID(int id){
        this.instruID = id;
    }

    public String getInstruName(){
        return instruName;
    }
    public void setInstruName(String name){
        this.instruName = name;
    }

    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
}
