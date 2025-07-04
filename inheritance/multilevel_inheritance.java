package inheritance;
class a
{
void demo()

{
System.out.println("first");

}
}
class b extends a
{
void demo()
{
super.demo();
System.out.println("second");
}
}
class c extends b
{
void demo()
{
super.demo();
System.out.println("third");
}
}
public class multilevel_inheritance {
public static void main(String[] args) {
			c obj = new c();

			obj.demo();

}
}