package de.kraemer.betriebsstellenverzeichnisbahn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * Konstruktor: BetriebsstellenverzeichnisBahnApplication öffnet mit Konstruktur csv-Datei, Liest diese ein,
 * 				erstellt Objekte, speichert diese in betriebsstellenliste
 */

@SpringBootApplication
public class BetriebsstellenverzeichnisBahnApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetriebsstellenverzeichnisBahnApplication.class, args);
	}

}
