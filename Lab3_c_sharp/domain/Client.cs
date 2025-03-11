namespace Lab3_c_sharp.domain;

public class Client : Entity
{
    private string nume;
    private string prenume;
    private string detaliiContact;

    public Client(int id, string nume, string prenume, string detaliiContact) : base(id)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.detaliiContact = detaliiContact;
    }

    public string Nume
    {
        get => nume;
        set => nume = value;
    }
    public string Prenume
    {
        get => prenume;
        set => prenume = value;
    }
    public string DetaliiContact
    {
        get => detaliiContact;
        set => detaliiContact = value;
    }
    
}