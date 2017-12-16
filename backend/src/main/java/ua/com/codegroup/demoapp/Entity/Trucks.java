package ua.com.codegroup.demoapp.Entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class Trucks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int rate;

    private boolean F;

    private String source;

    private Date age;

    private String available;

    private String truckType;

    private String truckO;

    private int dhO;

    private String fP;

    private String origin;

    private int trip;

    private String destination;

    private int dhD;

    private int truckD;

    private int length;

    private int weight;

    private String companyName;

    private String phoneNumber;


}