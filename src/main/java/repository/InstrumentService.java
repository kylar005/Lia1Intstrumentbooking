package repository;

import Entites.Instrument;

import java.util.List;

public interface InstrumentService {

    //Create operation
    Instrument saveInstrument(Instrument instrument);

    //Read operation
    List<Instrument> fetchInstrumentList();

    //Update operation
    Instrument updateInstrument(Instrument instrument, Integer instrumentId);

    //Delete operation
    void deleteInstrument(Integer instrumentId);
}
