package repository;

import Entites.Rental;

import java.util.List;

public interface RentalService {

    //Create
    Rental createRental(Rental rental);

    //Read
    List<Rental> fetchRentalList();

    //Update
    Rental updateRental(Rental rental);

    //Delete
    void deleteRental(Long rentalId);
}
