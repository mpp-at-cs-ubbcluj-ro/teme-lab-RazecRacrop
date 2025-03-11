package org.example.domain;

public class Cursa extends Entity<Long>{

    private String destinatie;
    private String dataPlecare;
    private String oraPlecare;
    private int nrLocuriDisponibile;
    private Autocar autocar;

    public Cursa(String destinatie, String dataPlecare, String oraPlecare, int nrLocuriDisponibile, Autocar autocar) {
        this.destinatie = destinatie;
        this.dataPlecare = dataPlecare;
        this.oraPlecare = oraPlecare;
        this.nrLocuriDisponibile = nrLocuriDisponibile;
        this.autocar = autocar;
    }

    public String getDestinatie() {
        return destinatie;
    }
    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }
    public String getDataPlecare() {
        return dataPlecare;
    }
    public void setDataPlecare(String dataPlecare) {
        this.dataPlecare = dataPlecare;
    }
    public String getOraPlecare() {
        return oraPlecare;
    }
    public void setOraPlecare(String oraPlecare) {
        this.oraPlecare = oraPlecare;
    }
    public int getNrLocuriDisponibile() {
        return nrLocuriDisponibile;
    }
    public void setNrLocuriDisponibile(int nrLocuriDisponibile) {
        this.nrLocuriDisponibile = nrLocuriDisponibile;
    }
    public Autocar getAutocar() {
        return autocar;
    }
    public void setAutocar(Autocar autocar) {
        this.autocar = autocar;
    }

    @Override
    public String toString() {
        return "Cursa{" +
                "destinatie='" + destinatie + '\'' +
                ", dataPlecare='" + dataPlecare + '\'' +
                ", oraPlecare='" + oraPlecare + '\'' +
                ", nrLocuriDisponibile=" + nrLocuriDisponibile +
                ", autocar=" + autocar +
                '}';
    }
}
