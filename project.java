class A
{
void show1()
{
System.out.println("empoly1");
}
}
class B extends A
{
void show2()
{
System.out.println("empoly2");
A a =new A();
a.show1();
}
}
class C extends B
{
void show3()
{
System.out.println("empoly3");
B b =new B();
b.show2();
}
}
class project extends C
{
	 static public void task()
{
System.out.println("task");
}
static public void managable()
{
System.out.println("taskmanagable");
}
public static void main(String args[])
{
C c= new C();
c.show3();
task();
managable();
}
}
interface demo
{
void task();
void managable();
}


	