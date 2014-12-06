public class terusBelajar{
		public static void main(String[]args){
			Belajar m,t;
			pelajaran p;
			
			m=new Belajar();
			t=new Belajar();
			p=new pelajaran();
			
			System.out.println("Hasil penambahan 'method'		= " +t.tambah());
			System.out.println("Hasil penambahan 'method overloading'	= "+t.tambah(20,8));
			System.out.println("Nama Matkul 'method'			= "+m.matkul());
			System.out.println("Nama Matkul 'method overriding'		= "+p.matkul());
		} 
	}