package crud;


import Entites.Customer;
import Entites.Room;
import org.springframework.stereotype.Service;
import repository.RoomRepository;

import java.util.List;

@Service
public class RoomCRUD {
    private final RoomRepository roomRepository;

    public RoomCRUD(RoomRepository rumRepository) {
        this.roomRepository = rumRepository;
    }

    // Use the repository methods for CRUD operations
    public Room createRoom(Room room) {

        return (Room) roomRepository.save(room);
    }

    public Room getRoom(int id) {
        return (Room) roomRepository.findById(id).orElse(null);
    }

    public Room updateRoom(Room room) {
        return roomRepository.save(room);
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

}
