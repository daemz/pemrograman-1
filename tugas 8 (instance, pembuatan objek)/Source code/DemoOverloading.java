import java.util.*;

public class DemoOverloading
{
	public static void main(String[] Xx)
	{
		Dosen d = new Dosen();
		d.info();
		
		d.nama = "Adam";
		d.email = "adamnugroho01@gmail.com";
		d.info();
	}
}