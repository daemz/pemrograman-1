class Adam { //penamaan class 
	String Bio; //inisialisasi "Bio"
	String Panggilan; //inisialisasi "panggilan"
	String AlamatPalsu; //inisialisasi "AlamatPalsu"
	String NomerHape; //inisialisasi "NomerHape"
	
	//atribut
	public String getBio(){ //
		return Bio; //
	}
	public void setBio(String A){ //
		this.Bio = A; //
	}
	
	public String getPanggilan(){ //
		return Panggilan; //
	}
	public void setPanggilan(String B){ //
		this.Panggilan = B; //
	}
	
	public String getAlamatPalsu(){ //
		return AlamatPalsu; //
	}
	public void setAlamatPalsu(String C){ //
		this.AlamatPalsu = C; //
	}
	
	public String getNomerHape(){ //
		return NomerHape; //
	}
	public void setNomerHape(String D){ //
		this.NomerHape = D; //
	}
	
	public static void main (String [] args){ //main 
		Adam NamaGue = new Adam(); //membuat objek baru bernama "NamaGue"
		Adam NamaPanggilan = new Adam(); //membuat objek baru bernama "NamaPanggilan"
		Adam AlamatGue = new Adam();
		Adam NomerHapeGue = new Adam();
		
		NamaGue.setBio("Adam Nugroho"); //contain/isi string dari objek "NamaGue"
		System.out.print("Nama saya adalah\t   : ");
		System.out.println(NamaGue.getBio()); //output pemanggilan pada objek "NamaGue"
		
		NamaPanggilan.setPanggilan("Adam"); //contain/isi dari objek "NamaPanggilan"
		System.out.print("Nama panggilan saya adalah : ");
		System.out.println(NamaPanggilan.getPanggilan()); // output pemanggilan untuk objek "NamaPanggilan"
		
		AlamatGue.setAlamatPalsu("Depok"); //contain/isi string dari objek "AlamatGue"
		System.out.print("Alamat saya adalah\t   : ");
		System.out.println(AlamatGue.getAlamatPalsu()); //output pemanggilan pada objek "AlamatGue"
		
		NomerHapeGue.setNomerHape("0808080808080"); //contain/isi string dari objek "NomerHapeGue"
		System.out.print("Nomor hape saya adalah\t   : ");
		System.out.println(NomerHapeGue.getNomerHape()); //output pemanggilan pada objek "NomerHapeGue"
	}
}