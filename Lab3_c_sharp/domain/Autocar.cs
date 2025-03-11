namespace Lab3_c_sharp.domain;


public class Autocar : Entity
{
    private string numarInmatriculare;
    private int numarTotalLocuri;

    public Autocar(int id, string numarInmatriculare, int numarTotalLocuri) : base(id)
    {
        this.numarInmatriculare = numarInmatriculare;
        this.numarTotalLocuri = numarTotalLocuri;
    }
    
    public string NumarInmatriculare
    {
        get => numarInmatriculare;
        set => numarInmatriculare = value;
    }
    public int NumarTotalLocuri
    {
        get => numarTotalLocuri;
        set => numarTotalLocuri = value;
    }

}