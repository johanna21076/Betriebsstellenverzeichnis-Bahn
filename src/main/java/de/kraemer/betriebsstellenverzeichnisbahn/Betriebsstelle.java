package de.kraemer.betriebsstellenverzeichnisbahn;

import com.opencsv.bean.CsvBindByName;

/**
 * Die Klasse Betriebsstelle enthält alle nötigen Informationen,
 * die in einer Zeile der csv-Datei vorhanden sind.
 */
public class Betriebsstelle {

    //Variablen (vorgegeben in der csv-Datei)
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
    private String uic;

    @CsvBindByName(column = "RB")
    private String rb;

    @CsvBindByName(column = "gültig von")
    private String gueltig_von;

    @CsvBindByName(column = "gültig bis")
    private String gueltig_bis;

    @CsvBindByName(column = "Netz-Key")
    private String netzkey;

    @CsvBindByName(column = "Fpl-rel")
    private String fpl_rel;

    @CsvBindByName(column = "Fpl-Gr")
    private String fpl_gr;

    public Betriebsstelle() {

    }

    /**
     * Konstruktor
     * erstellt ein Objekt Betriebsstelle mit allen vorhandenen Daten
     *
     * @param abk Abkürzung
     * @param name Name
     * @param kurzname Kurzname
     * @param typ Zur Abk. gehörende Bahnstellenarten
     * @param betr_zust Betriebszustand
     * @param primary_location Eindeutige Nr. innerhalb Europa
     * @param uic  UIC RICS code
     * @param rb Zuständiger Regionalbereich Netz, nur für Örtlichkeiten der DB Netz AG
     * @param gueltig_von im Format YYYYMMDD
     * @param gueltig_bis im Format YYYYMMDD. Bleibt frei, wenn keine Begrenzung vorliegt.
     * @param fpl_rel Fahrplanrelevanz – dies ist eine im Fahrplan bestellbare Örtlichkeit – im Ausland nur ausnahmsweise gekennzeichnet
     * @param fpl_gr Fahrplanbearbeitungsgrenze – im Ausland nur ausnahmsweise gekennzeichnet
     */

    public Betriebsstelle(String abk, String name, String kurzname, String typ, String betr_zust, String primary_location,
                          String uic, String rb, String gueltig_von, String gueltig_bis, String netz_key, String fpl_rel, String fpl_gr) {
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

    /**
     * Getter und Setter der Variablen
     */

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

    public String getUic() {
        return uic;
    }

    public void setUic(String uic) {
        this.uic = uic;
    }

    public String getRb() {
        return rb;
    }

    public void setRb(String rb) {
        this.rb = rb;
    }

    public String getGueltig_von() {
        return gueltig_von;
    }

    public void setGueltig_von(String gueltig_von) {
        this.gueltig_von = gueltig_von;
    }

    public String getGueltig_bis() {
        return gueltig_bis;
    }

    public void setGueltig_bis(String gueltig_bis) {
        this.gueltig_bis = gueltig_bis;
    }


    public String getNetzkey() {
        return netzkey;
    }

    public void setNetzkey(String netzkey) {
        this.netzkey = netzkey;
    }

    public void setFpl_gr(String fpl_gr) {
        this.fpl_gr = fpl_gr;
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
