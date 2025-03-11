package org.example.domain;

public class RezaervareCursa extends Entity<Long>{

    private Client client;
    private Cursa cursa;
    private int LocuriRezervate;
    private int nrLocuri;

    public RezaervareCursa(Client client, Cursa cursa, int LocuriRezervate, int nrLocuri) {
        this.client = client;
        this.cursa = cursa;
        this.LocuriRezervate = LocuriRezervate;
        this.nrLocuri = nrLocuri;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Cursa getCursa() {
        return cursa;
    }
    public void setCursa(Cursa cursa) {
        this.cursa = cursa;
    }
    public int getLocuriRezervate() {
        return LocuriRezervate;
    }
    public void setLocuriRezervate(int LocuriRezervate) {
        this.LocuriRezervate = LocuriRezervate;
    }
    public int getNrLocuri() {
        return nrLocuri;
    }
    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "RezaervareCursa{" +
                "client=" + client +
                ", cursa=" + cursa +
                ", LocuriRezervate=" + LocuriRezervate +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
