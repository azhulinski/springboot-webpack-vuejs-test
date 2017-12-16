package ua.com.codegroup.demoapp.Service;

import org.springframework.stereotype.Service;
import ua.com.codegroup.demoapp.DAO.DemoDao;
import ua.com.codegroup.demoapp.Entity.Trucks;

import java.util.List;

@Service
public interface TruckEntityService {

    List<Trucks> findAll();

    void save(Trucks truck);

    void deleteAll();
}
