package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Pet {
    Date birthDate;
    String petType;
    Owner owner;
}
