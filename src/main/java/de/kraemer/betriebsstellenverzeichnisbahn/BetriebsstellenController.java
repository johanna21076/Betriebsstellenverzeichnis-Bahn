package de.kraemer.betriebsstellenverzeichnisbahn;


import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;


@RestController
public class BetriebsstellenController {

    HashMap<String, Betriebsstelle> betriebsstellenmap = new HashMap<>();

    /**
     * Aufruf csv-Datei, einlesen und Objekte erstellen
     * mithilfe von CsvToBeanBuilder Liste der Objekte erstellen und sie dann in eine HashMap einfügen
     *
     * @throws IOException, wenn Datei nicht vorhanden
     */
    public BetriebsstellenController() throws IOException {
        ClassPathResource res = new ClassPathResource("static/DBNetz-Betriebsstellenverzeichnis-Stand2018-04.csv");

        List<Betriebsstelle> betriebsstellenliste = new CsvToBeanBuilder<Betriebsstelle>(new FileReader(res.getFile()))
                .withType(Betriebsstelle.class)
                .withSeparator(';')
                .build()
                .parse();

        betriebsstellenliste.forEach(System.out::println);

        for (Betriebsstelle betriebsstelle : betriebsstellenliste) {
            betriebsstellenmap.put(betriebsstelle.getAbk().toUpperCase(Locale.ROOT), betriebsstelle);
        }
        System.out.println(betriebsstellenmap.size());
    }

    /**
     * sucht nach abk in der betriebsstellenmap
     *
     * @param abk Abkürzung (nach der gesucht wird)
     * @return Betriebsstellenobjekt, wenn abk vorhanden wirft sonst EntityNotFoundException
     */
    @GetMapping("/betriebsstelle/{abk}")
    public Betriebsstelle getInfoBetriebsstelle(@PathVariable("abk") String abk) {

        abk = abk.toUpperCase(Locale.ROOT);

        if (betriebsstellenmap.containsKey(abk)) {
            return betriebsstellenmap.get(abk);
        } else {
            throw new EntityNotFoundException();
        }

    }
}

