package Controllers;

import Entites.Room;
import crud.RoomCRUD;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rum")
public class RoomController {


    private RoomCRUD crudroom;

   public RoomController (RoomCRUD RoomCRUD){
       this.crudroom = crudroom;
   }

    @GetMapping(name = "/rum")
    public List<Room> GetAllCustomer() {

        return crudroom.getAllRooms();
    }
}
