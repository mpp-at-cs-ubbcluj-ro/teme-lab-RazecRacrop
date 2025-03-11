namespace Lab3_c_sharp.domain;

public class User : Entity
{
private string numeUtilizator;
private string parola;
private Ofice oficiu;

public User(int id, string numeUtilizator, string parola, Ofice oficiu) : base(id)
{
    this.numeUtilizator = numeUtilizator;
    this.parola = parola;
    this.oficiu = oficiu;
}
    
        public string NumeUtilizator
        {
            get => numeUtilizator;
            set => numeUtilizator = value;
        }
        public string Parola
        {
            get => parola;
            set => parola = value;
        }
        public Ofice Oficiu
        {
            get => oficiu;
            set => oficiu = value;
        }
    
}