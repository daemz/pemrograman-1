import java.util.Scanner;
import java.util.*;

class perulangan1 {
	public static void main(String[]args) {
		int i=0;
		int a=0;
		Scanner in = new Scanner(System.in);
		System.out.print("masukkan banyak mahasiswa : ");
		int jumlahMhs = in.nextInt();
		in.nextLine();
		// membuat array list untuk nama
		List<String> nama = new ArrayList<String>();
		// penginputan nama berdasarkan jumlah mahasiswa
		do {
			System.out.print("masukkan nama ke-"+(i+1)+" : ");
			String inputNama = in.nextLine();
			nama.add(inputNama);
			i++;
		}while(i<jumlahMhs);
		// manampilkan  nama berdasarkan jumlha mhasiswa
		System.out.println("dafar-daftar nama mahasiswa");
		do {
			System.out.println((a+1)+" - "+nama.get(a));
			a++;
		}while(a<jumlahMhs);
	}
}