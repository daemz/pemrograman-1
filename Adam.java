class Adam {
	String Sugoi; //
	
	public String getSugoi(){ //
		return Sugoi; //
	}
	
	public void setSugoi(String A){ //
		this.Sugoi = A; //
	}
	
	public static void main (String [] args){ //main 
		Adam NamaGue = new Adam(); //membuat objek baru bernama "NamaGue"
		Adam NamaPanggilan = new Adam(); //membuat objek baru bernama "NamaPanggilan"
		
		NamaGue.setSugoi("Adam Nugroho"); //contain/isi string dari objek "NamaGue"
		System.out.print("Nama saya adalah\t   : ");
		System.out.println(NamaGue.getSugoi()); //output pemanggilan pada objek "NamaGue"
		
		NamaPanggilan.setSugoi("Adam"); //contain/isi dari objek "NamaPanggilan"
		System.out.print("Nama panggilan saya adalah : ");
		System.out.println(NamaPanggilan.getSugoi()); // output pemanggilan untuk objek "NamaPanggilan"
	}
}