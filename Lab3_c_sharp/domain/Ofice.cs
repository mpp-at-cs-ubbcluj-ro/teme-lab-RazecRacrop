namespace Lab3_c_sharp.domain;

public class Ofice :  Entity
{
private string numeOficiu;
private string adresa;
private string detaliiContact;

public Ofice(int id, string numeOficiu, string adresa, string detaliiContact) : base(id)
{
    this.numeOficiu = numeOficiu;
    this.adresa = adresa;
    this.detaliiContact = detaliiContact;
}

    public string NumeOficiu
    {
        get => numeOficiu;
        set => numeOficiu = value;
    }
    public string Adresa
    {
        get => adresa;
        set => adresa = value;
    }
    public string DetaliiContact
    {
        get => detaliiContact;
        set => detaliiContact = value;
    }
}