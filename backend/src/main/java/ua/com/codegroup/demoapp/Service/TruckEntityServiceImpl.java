package ua.com.codegroup.demoapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.codegroup.demoapp.DAO.DemoDao;
import ua.com.codegroup.demoapp.Entity.Trucks;

import java.util.List;

@Service
@Transactional
public class TruckEntityServiceImpl implements TruckEntityService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public List<Trucks> findAll() {
        return demoDao.findAll();
    }

    @Override
    public void save(Trucks truck) {
        demoDao.save(truck);
    }

    @Override
    public void deleteAll() {
        demoDao.deleteAll();
    }
}
