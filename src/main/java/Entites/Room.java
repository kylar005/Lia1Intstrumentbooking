package Entites;
import jakarta.persistence.*;

@Entity
@Table(name = "rum")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomID", nullable = false)
    private int roomId;

    @Column(name = "roomNr", nullable = false)
    private int roomNr;


    public Room() {

    }

    public Room( int roomId, int roomNr){
        this.roomId = roomId;
        this.roomNr = roomNr;
    }

    public int getroomId(){

        return roomId;
    }

    public void setroomId(int id){

        this.roomId = id;
    }

    public int getroomNr(){

        return roomNr;
    }

    public void setroomNr(int number){

        this.roomNr = number;
    }


}
