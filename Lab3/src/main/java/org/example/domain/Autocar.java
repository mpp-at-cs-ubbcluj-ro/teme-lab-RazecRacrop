package org.example.domain;

public class Autocar extends Entity<Long>{

    private String nrInmatriculare;
    private int nrLocuri;

    public Autocar(String nrInmatriculare, int nrLocuri) {
        this.nrInmatriculare = nrInmatriculare;
        this.nrLocuri = nrLocuri;
    }

    private String getNrInmatriculare() {
        return nrInmatriculare;
    }
    private void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }
    private int getNrLocuri() {
        return nrLocuri;
    }
    private void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autocar{" +
                "nrInmatriculare='" + nrInmatriculare + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
