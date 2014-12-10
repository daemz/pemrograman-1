import java.util.Scanner;
class percabangan{
	public static void main(String args[]){
		//mempersiapkan variabel inputan
		Scanner in = new Scanner(System.in);
		//menampilkan keterangan untuk menginput
		System.out.print("Masukan nilai UTS = ");
		//memasukkan nilai yang diinput ke variabel nilai
		int nilai = in.nextInt();
		//jika nilai lebih besar dari 75
		if(nilai>75){
			//manampilkan keterangan lulus
			System.out.print("Anda Lulus Ujian");
		}
		//jika nilai tidak lebih besarr dari 75
		else{
			//menampilkan keterangan tidak lulus
			System.out.print("Anda Tidak Lulus");
		}
	}
}