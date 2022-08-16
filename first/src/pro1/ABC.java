package pro1;



public class ABC
{
int a,b,c,d;
    public ABC()
    {
        this(12,13,14);
        System.out.println("Default ");
        
    }
    public ABC(int a)
    {
        this();
        System.out.println("one const ");
        
    }
    public ABC(int a ,int b)
    {
        this(12);
        System.out.println("two const");
        
    }
    public ABC(int a , int b , int c)
    {
        System.out.println("three const ");
        
    }
    public ABC(int a,int b,int c,int d)
    {
        this (12,13);
        System.out.println("four const ");
        
    }
    public static void main(String[] args)
    {
    	ABC ob=new ABC(12,13,14,15);
    }
    
}