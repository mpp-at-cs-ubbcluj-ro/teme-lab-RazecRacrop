package org.example.domain;

public class Oficce extends Entity<Long> {
    private String numeOficiu;
    private String adresaOficiu;
    private String detaliiContact;

    public Oficce(String numeOficiu, String adresaOficiu, String detaliiContact) {
        this.numeOficiu = numeOficiu;
        this.adresaOficiu = adresaOficiu;
        this.detaliiContact = detaliiContact;
    }

    public String getNumeOficiu() {
        return numeOficiu;
    }
    public void setNumeOficiu(String numeOficiu) {
        this.numeOficiu = numeOficiu;
    }
    public String getAdresaOficiu() {
        return adresaOficiu;
    }
    public void setAdresaOficiu(String adresaOficiu) {
        this.adresaOficiu = adresaOficiu;
    }
    public String getDetaliiContact() {
        return detaliiContact;
    }
    public void setDetaliiContact(String detaliiContact) {
        this.detaliiContact = detaliiContact;
    }

    @Override
    public String toString() {
        return "Oficce{" +
                "numeOficiu='" + numeOficiu + '\'' +
                ", adresaOficiu='" + adresaOficiu + '\'' +
                ", detaliiContact='" + detaliiContact + '\'' +
                '}';
    }

}
