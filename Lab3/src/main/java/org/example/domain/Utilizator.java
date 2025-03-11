package org.example.domain;

public class Utilizator extends Entity<Long>{

    private String numeUtil;
    private String parola;
    private Oficce oficiu;

    public Utilizator (String numeUtil, String parola, Oficce oficiu) {
        this.numeUtil = numeUtil;
        this.parola = parola;
        this.oficiu = oficiu;
    }

    public String getNumeUtil() {
        return numeUtil;
    }
    public void setNumeUtil(String numeUtil) {
        this.numeUtil = numeUtil;
    }
    public String getParola() {
        return parola;
    }
    public void setParola(String parola) {
        this.parola = parola;
    }
    public Oficce getOficiu() {
        return oficiu;
    }
    public void setOficiu(Oficce oficiu) {
        this.oficiu = oficiu;
    }

    @Override
    public String toString() {
        return "Utilizator{" +
                "numeUtil='" + numeUtil + '\'' +
                ", parola='" + parola + '\'' +
                ", oficiu=" + oficiu +
                '}';
    }





}
