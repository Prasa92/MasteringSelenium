package generics;

public class GenericClass<T,T1> {

	private T t;
	private T1 t1;
    public GenericClass(T t , T1 t1)
    {
        this.t = t;
    }
    
    public void setT(T t)
    {
        this.t = t;
    }
    
    public T getT()
    {
        return t;
    } 
    
    public void setT1(T1 t1)
    {
        this.t1 = t1;
    }
    
    public T1 getT1()
    {
        return t1;
    } 
}