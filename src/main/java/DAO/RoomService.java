package DAO;

import Entites.Room;
import org.springframework.stereotype.Service;
import repository.RoomRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    //create room
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    //find room by room number
    public Optional<Room> getByRoomNumber(int roomNumber){
        return roomRepository.findByRoomNumber(roomNumber);
    }

    //retrieve all rooms
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }


    //get room by ID
    public Room getRoomById(int id) {
        return roomRepository.findById(id).orElse(null);
    }

    //update room
    public Room updateRoom(Room room) {
        return roomRepository.save(room);
    }

    //delete room
    public void deleteRoom(int id) {
        roomRepository.deleteById(id);
    }

}