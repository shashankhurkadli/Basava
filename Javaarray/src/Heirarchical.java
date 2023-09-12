
 class Hir
{
void laptop()
{
    int ram=64;
    String shop="xyz";
    System.out.println("Ram of the system is "+ram+" Shop name is "+shop);
}

}
class Dell extends Hir 
{
    void dll()
    {
        String brand ="Thinkpad";
        int price=88000;
    }
}
class Lenova extends Hir{
    void leno()
    {
        String brand="HP";
        int price=72000;
        
        System.out.println("brand is "+brand+"And price is  "+price);
    }
}
class Heirarchical
{
    public static void main(String[] args) {
        Dell d1=new Dell();
        Lenova l1=new Lenova();
       d1.dll();
        l1.leno();
        
    }
}
 
