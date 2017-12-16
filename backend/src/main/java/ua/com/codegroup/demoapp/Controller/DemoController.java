package ua.com.codegroup.demoapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ua.com.codegroup.demoapp.Entity.Trucks;
import ua.com.codegroup.demoapp.Service.TruckEntityService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class DemoController {

    @Autowired
    TruckEntityService truckEntityService;

    @GetMapping("/getData")
    public List<Trucks> getTruckRoutes() {

        if (truckEntityService.findAll() != null) {
            truckEntityService.deleteAll();
            System.out.println("all data deleted");
        }

        Trucks truckOne = new Trucks();
        truckOne.setRate(3150);
        truckOne.setF(true);
        truckOne.setSource("DAT");
        truckOne.setAge(new Date());
        truckOne.setAvailable("11/24");
        truckOne.setTruckType("V");
        truckOne.setTruckO("Belwood, IL");
        truckOne.setDhO(371);
        truckOne.setFP("F");
        truckOne.setOrigin("Erie, PA");
        truckOne.setTrip(422);
        truckOne.setDestination("Sealy, TX");
        truckOne.setDhD(0);
        truckOne.setTruckD(12);
        truckOne.setLength(53);
        truckOne.setWeight(43);
        truckOne.setCompanyName("Coyote Logistics");
        truckOne.setPhoneNumber("(773) 799 2118");


        Trucks truckTwo = new Trucks();
        truckTwo.setRate(3151);
        truckTwo.setF(false);
        truckTwo.setSource("DAT");
        truckTwo.setAge(new Date());
        truckTwo.setAvailable("11/25");
        truckTwo.setTruckType("VR");
        truckTwo.setTruckO("Belwood, IL");
        truckTwo.setDhO(372);
        truckTwo.setFP("F");
        truckTwo.setOrigin("St Clair, MI");
        truckTwo.setTrip(423);
        truckTwo.setDestination("Orlando, FL");
        truckTwo.setDhD(0);
        truckTwo.setTruckD(13);
        truckTwo.setLength(43);
        truckTwo.setWeight(17);
        truckTwo.setCompanyName("R & R Express");
        truckTwo.setPhoneNumber("(412) 444 24 72");

        truckEntityService.save(truckOne);
        truckEntityService.save(truckTwo);
        System.out.println();

        List<Trucks> trucks = truckEntityService.findAll();
        return trucks;
    }

}
