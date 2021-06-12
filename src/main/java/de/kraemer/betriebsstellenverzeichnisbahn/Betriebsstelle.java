package de.kraemer.betriebsstellenverzeichnisbahn;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;



/**
 * die Klasse Betriebsstelle erstellt ein Objekt von sich mit allen nötigen Informationen, die in dieser Zeile vorhanden sind
 */
public class Betriebsstelle {

    //Variablen
    @CsvBindByName(column = "Abk")
    private String abk;

    @CsvBindByName(column = "Name")
    private String name;

    @CsvBindByName(column = "Kurzname")
    private String kurzname;

    @CsvBindByName(column = "Typ")
    private String typ;

    @CsvBindByName(column = "Betr-Zust")
    private String betr_zust;

    @CsvBindByName(column = "Primary location")
    private String primary_location;

    @CsvBindByName(column = "UIC")
    private int uic;

    @CsvBindByName(column = "RB")
    private int rb;

    @CsvBindByName(column = "gültig von")
    private int gueltig_von;

    @CsvBindByName(column = "gültig bis")
    private int gueltig_bis;

    @CsvBindByName(column = "Netz-Key")
    private String netzkey;

    @CsvBindByName(column = "Fpl-rel")
    private String fpl_rel;

    @CsvBindByName(column = "Fpl-Gr")
    private String fpl_gr;

    public Betriebsstelle(){

    }

    public Betriebsstelle(String abk, String name, String kurzname, String typ, String betr_zust, String primary_location,
                          int uic, int rb, int gueltig_von, int gueltig_bis, String fpl_rel, String fpl_gr) {
        this.abk = abk;
        this.name = name;
        this.kurzname = kurzname;
        this.typ = typ;
        this.betr_zust = betr_zust;
        this.primary_location = primary_location;
        this.uic = uic;
        this.rb = rb;
        this.gueltig_von = gueltig_von;
        this.gueltig_bis = gueltig_bis;
        this.fpl_rel = fpl_rel;
        this.fpl_gr = fpl_gr;
    }

    //Getter und Setter

    public String getAbk() {
        return abk;
    }

    public void setAbk(String abk) {
        this.abk = abk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKurzname() {
        return kurzname;
    }

    public void setKurzname(String kurzname) {
        this.kurzname = kurzname;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getBetr_zust() {
        return betr_zust;
    }

    public void setBetr_zust(String betr_zust) {
        this.betr_zust = betr_zust;
    }

    public String getPrimary_location() {
        return primary_location;
    }

    public void setPrimary_location(String primary_location) {
        this.primary_location = primary_location;
    }

    public int getUic() {
        return uic;
    }

    public void setUic(int uic) {
        this.uic = uic;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

    public int getGueltig_von() {
        return gueltig_von;
    }

    public void setGueltig_von(int gueltig_von) {
        this.gueltig_von = gueltig_von;
    }

    public int getGueltig_bis() {
        return gueltig_bis;
    }

    public void setGueltig_bis(int gueltig_bis) {
        this.gueltig_bis = gueltig_bis;
    }

    public String getFpl_rel() {
        return fpl_rel;
    }

    public void setFpl_rel(String fpl_rel) {
        this.fpl_rel = fpl_rel;
    }

    public String getFpl_gr() {
        return fpl_gr;
    }

    public void setFpl_gr(String fpl_gr) {
        this.fpl_gr = fpl_gr;
    }

    @Override
    public String toString() {
        return "Betriebsstelle{" +
                "abk='" + abk + '\'' +
                ", name='" + name + '\'' +
                ", kurzname='" + kurzname + '\'' +
                ", typ='" + typ + '\'' +
                ", betr_zust='" + betr_zust + '\'' +
                ", primary_location='" + primary_location + '\'' +
                ", uic=" + uic +
                ", rb=" + rb +
                ", gueltig_von=" + gueltig_von +
                ", gueltig_bis=" + gueltig_bis +
                ", fpl_rel='" + fpl_rel + '\'' +
                ", fpl_gr='" + fpl_gr + '\'' +
                '}';
    }
}
