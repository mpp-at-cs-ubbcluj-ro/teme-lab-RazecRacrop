namespace Lab3_c_sharp.repo;

public interface Repository
{
    public void Add(Object obj);
    public void Remove(Object obj);
    public void Update(Object obj);
    public List<Object> GetAll();
    public Object GetById(int id);
    
}