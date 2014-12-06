public class TugasInheritance{
	public static void main(String[]args){
		lingkaran ling1, ling2;
		segiEmpat segi4a, segi4b;
		segiTiga segi3a, segi3b;
		bola bola1, bola2;
		kubus kub1, kub2, kub3;
		tabung tab1, tab2, tab3;
		
		ling1=new lingkaran();
		ling2=new lingkaran();
		segi4a=new segiEmpat();
		segi4b=new segiEmpat();
		segi3a=new segiTiga();
		segi3b=new segiTiga();
		bola1=new bola();
		bola2=new bola();
		kub1=new kubus();
		kub2=new kubus();
		kub3=new kubus();
		tab1=new tabung();
		tab2=new tabung();
		tab3=new tabung();

			System.out.println("===TUGAS INHERITANCE - Pemrograman 1===");
			System.out.println("Nama 	: Adam Nugroho");
			System.out.println("NPM 	: 4513210002");
			System.out.println("========================================");
			System.out.println(" ");
			System.out.println("LINGKARAN");
			System.out.println("Luas Lingkaran 		  	= "+ling1.hitungLuasLing());
			System.out.println("Keliling Lingkaran    		= "+ling2.hitungKelilingLing());
			System.out.println(" ");
			System.out.println("SEGIEMPAT");
			System.out.println("Luas Segi Empat 	  	= "+segi4a.hitungLuasSegi4());
			System.out.println("Keliling Segi Empat   		= "+segi4b.hitungKelilingSegi4());
			System.out.println(" ");
			System.out.println("SEGITIGA");
			System.out.println("Luas Segi Tiga 		  	= "+segi3a.hitungLuasSegi3());
			System.out.println("Keliling Segi Tiga    		= "+segi3b.hitungKelilingSegi3());
			System.out.println(" ");
			System.out.println("BOLA");
			System.out.println("Luas Permukaan Bola	  	= "+bola1.hitungLuasBola());
			System.out.println("Keliling Volume Bola  		= "+bola2.hitungVolumeBola());
			System.out.println(" ");
			System.out.println("KUBUS");
			System.out.println("Luas Permukaan Kubus  		= "+kub1.hitungLuasKubus());
			System.out.println("Luas Keliling Kubus  		= "+kub2.hitungKelilingKubus());
			System.out.println("Keliling Volume Kubus 		= "+kub3.hitungVolumeKubus());
			System.out.println("TABUNG");
			System.out.println("Luas Luas Alas Tabung  		= "+tab1.hitungLuasAlasTabung());
			System.out.println("Luas Luas Selimut Tabung    	= "+tab2.hitungLuasSelimutTabung());
			System.out.println("Keliling Volume Tabung 		= "+tab3.hitungVolumeTabung());
	}
} 