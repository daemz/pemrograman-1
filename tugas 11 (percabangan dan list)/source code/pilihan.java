import java.util.Scanner;
class pilihan {
	public static void main(String args[]){
		//mempersiapkan variabel inputan
		Scanner in = new Scanner(System.in);
		// menampilkan opsi menu
		System.out.println("1. nasi ayam kremes");
		System.out.println("2. nasi ayam balado");
		System.out.println("3. milkshake strawberry");
		System.out.println("4. milkshake oreo");
		//menampilkan keterangan untuk menginput
		System.out.print("Masukan menu pilihan = ");
		//memasukkan nilai yang diinput ke variabel nilai
		int pilih = in.nextInt();
		switch(pilih) {
			case 1 :
				System.out.print("harganya nasi ayam kremes adalah Rp.15.000,-");
			break;
			case 2 :
				System.out.print("harganya nasi ayam balado adalah Rp.14.000,-");
			break;
			case 3 :
				System.out.print("harganya milkshake strawberry adalah Rp.6.000,-");
			break;
			case 4 : 
				System.out.print("harganya milkshake oreo adalah Rp.8.000,-");
			break;
		default : System.out.print("pilihan tidak tersedia");
		}
	}
}