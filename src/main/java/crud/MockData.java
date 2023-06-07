package crud;

import Entites.Instrument;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Service.InstrumentServiceImpl;

@Service
public class MockData {
    @Autowired
    private InstrumentServiceImpl instrumentService;
@PostConstruct
public void setMockdata() {
    Instrument instrument1 = new Instrument("Gibson Les Paul", "Electric Guitar", "String Instrument");
    Instrument instrument2 = new Instrument("Yamaha FG800", "Acoustic Guitar", "String Instrument");
    Instrument instrument3 = new Instrument("Fender Precision Bass", "Bass Guitar", "String Instrument");
    Instrument instrument4 = new Instrument("Roland TD-1DMK", "Electronic Drum Kit", "Percussion Instrument");
    Instrument instrument5 = new Instrument("Yamaha YDP-144", "Digital Piano", "Keyboard Instrument");

instrumentService.saveInstrument(instrument1);
instrumentService.saveInstrument(instrument2);
instrumentService.saveInstrument(instrument3);
instrumentService.saveInstrument(instrument4);
instrumentService.saveInstrument(instrument5);
}

}
