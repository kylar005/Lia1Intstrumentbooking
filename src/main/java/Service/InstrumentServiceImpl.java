package Service;

import Entites.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.InstrumentRepository;
import repository.InstrumentService;

import java.util.List;
import java.util.Objects;

@Service
public class InstrumentServiceImpl implements InstrumentService {

    @Autowired
    private InstrumentRepository instrumentRepository;

    @Override
    public Instrument saveInstrument(Instrument instrument) {
        return instrumentRepository.save(instrument);
    }

    @Override
    public List<Instrument> fetchInstrumentList() {
        return instrumentRepository.findAll();
    }

    @Override
    public Instrument updateInstrument(Instrument instrument, Integer instrumentId) {

        Instrument instDB = instrumentRepository.findById(instrumentId).get();

        if (Objects.nonNull(instrument.getInstrumentName())
                && !"".equalsIgnoreCase(instrument.getInstrumentName())) {
            instDB.setInstrumentName(instrument.getInstrumentName());
        }

        //komplettera


return instrumentRepository.save(instDB);
    }

@Override
    public void deleteInstrument(Integer instrumentId) {
        instrumentRepository.deleteById((instrumentId));
}

}
