package Service;

import Entites.Rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RentalRepository;
import repository.RentalService;

import java.util.List;

@Service
public class RentalServiceImpl implements RentalService {

    @Autowired
    private RentalRepository rentalRepository;

//Create
    @Override
    public Rental createRental(Rental rental) {
        return rentalRepository.save(rental);
    }
//Read
    @Override
    public List<Rental> fetchRentalList() {
        return (List<Rental>) rentalRepository.findAll();
    }
//Update
    @Override
    public Rental updateRental(Rental rental) {
        return null;
    }
//Delete
    @Override
    public void deleteRental(Long rentalId) {

    }
}
