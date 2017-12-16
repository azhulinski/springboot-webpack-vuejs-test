package ua.com.codegroup.demoapp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.codegroup.demoapp.Entity.Trucks;

public interface DemoDao extends JpaRepository<Trucks, Integer> {


}
