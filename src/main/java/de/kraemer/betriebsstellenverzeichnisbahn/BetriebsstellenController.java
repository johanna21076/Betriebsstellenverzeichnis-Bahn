package de.kraemer.betriebsstellenverzeichnisbahn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.resource.ResourceResolver;

@RestController
    public class BetriebsstellenController {

        HashMap<String, Betriebsstelle> betriebsstellenmap = new HashMap<>();

        public BetriebsstellenController() throws IOException {
            // Aufruf csv-Datei
            // Lesen csv-Datei und davon Objekte erstellen und in betriebsstellenliste speichern
            ClassPathResource res = new ClassPathResource("static/DBNetz-Betriebsstellenverzeichnis-Stand2018-04.csv");

            List<Betriebsstelle> betriebsstellenliste = new CsvToBeanBuilder(new FileReader(res.getFile()))
                    .withType(Betriebsstelle.class)
                    .withSeparator(';')
                    .build()
                    .parse();

            betriebsstellenliste.forEach(System.out::println);

            for(int i = 0; i<betriebsstellenliste.size(); i++){
                betriebsstellenmap.put(betriebsstellenliste.get(i).getAbk().toUpperCase(Locale.ROOT),betriebsstellenliste.get(i));
            }
            System.out.println(betriebsstellenmap.size());
        }

             @GetMapping("/betriebsstelle/{abk}")
        public Betriebsstelle getInfoBetriebsstelle(@PathVariable("abk") String abk) {
            abk = abk.toUpperCase(Locale.ROOT);
            if (betriebsstellenmap.containsKey(abk)){
            return betriebsstellenmap.get(abk);
        } else{
                throw new EntityNotFoundException();
                 }

    }
    }

