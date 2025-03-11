namespace Lab3_c_sharp.domain;

public class RezervareCursa : Entity
{
    private Client client;
    private Cursa cursa;
    private int numarLocuriRezervate;

    public RezervareCursa(int id, Client client, Cursa cursa, int numarLocuriRezervate) : base(id)
    {
        this.client = client;
        this.cursa = cursa;
        this.numarLocuriRezervate = numarLocuriRezervate;
    }
    
    public Client Client
    {
        get => client;
        set => client = value;
    }
    public Cursa Cursa
    {
        get => cursa;
        set => cursa = value;
    }
    public int NumarLocuriRezervate
    {
        get => numarLocuriRezervate;
        set => numarLocuriRezervate = value;
    }
}