package initialProject;

public class MeirHello 
{
	public String hello()
	{
		return "Helloo with OpenShift listening";
	}
	public static void main (String [] args)
	{
		MeirHello myHello = new MeirHello();
		System.out.println("PRINTING **********************************");
		System.out.println(myHello.hello());
		System.out.println("END END END Plus one ");
	}

}
