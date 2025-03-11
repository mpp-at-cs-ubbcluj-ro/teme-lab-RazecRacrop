namespace Lab3_c_sharp.domain;

public class Entity
{
    public int Id { get; set; }

    public Entity(int id)
    {
        Id = id;
    }

    public override bool Equals(object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || GetType() != obj.GetType())
            return false;
        Entity entity = (Entity) obj;
        return Id == entity.Id;
    }

    public override int GetHashCode()
    {
        return Id;
    }

    public override string ToString()
    {
        return "Entity{" + "id=" + Id + '}';
    }
    
}