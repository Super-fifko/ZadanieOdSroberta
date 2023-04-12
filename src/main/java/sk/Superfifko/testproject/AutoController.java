package sk.Superfifko.testproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class AutoController {
    List<Auto> auta=new ArrayList<>();
    @GetMapping("/auto")
    public List<Auto> getAuto(){
        return this.auta;
    }
    @PostMapping("/vytvorauto")
    public Auto postAuto(@RequestBody Auto autoRequest){
        Auto auto=new Auto();
        auto.setId(autoRequest.getId());
        auto.setZnacka(autoRequest.getZnacka());
        auto.setPocetDveri(autoRequest.getPocetDveri());
        auto.setTypAuta(autoRequest.getTypAuta());
        auto.setPocetKoni(autoRequest.getPocetKoni());
        this.auta.add(auto);
        return auto;
    }


}
