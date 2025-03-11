namespace Lab3_c_sharp.domain;

public class Cursa : Entity
{
    private string destinatie;
    private DateTime dataPlecare;
    private TimeSpan oraPlecare;
    private int numarLocuriDisponibile;
    private Autocar autocar;

    public Cursa(int id, string destinatie, DateTime dataPlecare, TimeSpan oraPlecare, int numarLocuriDisponibile, Autocar autocar) : base(id)
    {
        this.destinatie = destinatie;
        this.dataPlecare = dataPlecare;
        this.oraPlecare = oraPlecare;
        this.numarLocuriDisponibile = numarLocuriDisponibile;
        this.autocar = autocar;
    }
    
    public string Destinatie
    {
        get => destinatie;
        set => destinatie = value;
    }
    public DateTime DataPlecare
    {
        get => dataPlecare;
        set => dataPlecare = value;
    }
    public TimeSpan OraPlecare
    {
        get => oraPlecare;
        set => oraPlecare = value;
    }
    public int NumarLocuriDisponibile
    {
        get => numarLocuriDisponibile;
        set => numarLocuriDisponibile = value;
    }
    public Autocar Autocar
    {
        get => autocar;
        set => autocar = value;
    }
        

   
}