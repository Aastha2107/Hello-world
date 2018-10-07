class A
{
A()
{
System.out.println("a class constructor");
}
}
class B extends A
{
B()
{
System.out.println("b class constructor");
}
}
class C extends B
{
C()
{
System.out.println("c class constructor");
}
public static void main(String...s)
{
C ob=new C();
}

}
static memory from bottom to up
normal reverse