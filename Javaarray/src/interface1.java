
interface Demo5
{
void disp();
}
interface Demo7
{
   static void msg()
    {
        System.out.println("Demo");
    }
}
interface Demo2
{
    default void msg2()
    {
        System.out.println("Demo2");
    }   
}
class interface1 implements Demo5,Demo7,Demo2 
{
public void disp()
{
    System.out.println("Interface");
}
public void msg2()
{
    System.out.println("Over rideen");
}
public static void main(String[] args) {
interface1 d5=new interface1();
d5.disp();
d5.msg2();
Demo7.msg();
}
}