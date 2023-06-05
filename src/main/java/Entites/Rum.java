package Entites;
import jakarta.persistence.*;
import javax.annotation.processing.Generated;

@Entity
public class Rum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rumId", nullable = false)
    private int rumId;

    @Column(name = "rumNr", nullable = false)
    private int rumNr;


    public Rum() {

    }

    public Rum( int rumId, int rumNr){
        this.rumId = rumId;
        this.rumNr = rumNr;
    }

    public int getRumId(){

        return rumId;
    }

    public void setRumId(int id){

        this.rumId = id;
    }

    public int getRumNr(){

        return rumNr;
    }

    public void setRumNr(int number){

        this.rumNr = number;
    }


}
