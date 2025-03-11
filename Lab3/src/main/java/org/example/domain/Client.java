package org.example.domain;

public class Client extends Entity<Long> {
    private String nume;
    private String prenume;
    private String detaliiContact;

    public Client(String nume, String prenume, String detaliiContact) {
        this.nume = nume;
        this.prenume = prenume;
        this.detaliiContact = detaliiContact;
    }

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public String getDetaliiContact() {
        return detaliiContact;
    }
    public void setDetaliiContact(String detaliiContact) {
        this.detaliiContact = detaliiContact;
    }
    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", detaliiContact='" + detaliiContact + '\'' +
                '}';
    }
}
