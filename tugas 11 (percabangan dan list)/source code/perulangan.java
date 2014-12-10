import java.util.Scanner;
import java.util.*;

class perulangan {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("masukkan banyak mahasiswa : ");
		int jumlahMhs = in.nextInt();
		in.nextLine();
		// membuat array list untuk nama
		List<String> nama = new ArrayList<String>();
		// penginputan nama berdasarkan jumlah mahasiswa
		for(int i=0; i<jumlahMhs; i++) {
			System.out.print("masukkan nama ke-"+(i+1)+" : ");
			String inputNama = in.nextLine();
			nama.add(inputNama);
		}
		// manampilkan  nama berdasarkan jumlha mhasiswa
		System.out.println("dafar-daftar nama mahasiswa");
		for(int i=0;i<jumlahMhs;i++) {
			System.out.println((i+1)+" - "+nama.get(i));
		}
	}
}