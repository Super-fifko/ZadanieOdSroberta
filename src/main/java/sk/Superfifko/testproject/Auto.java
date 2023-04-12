package sk.Superfifko.testproject;

/*import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;*/
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Auto {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String znacka;
    private int pocetDveri;
    private int pocetKoni;
    private String typAuta;

    public Auto(){
    }
}
