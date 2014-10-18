class Adam { //penamaan class 
	String Bio; //inisialisasi "Bio"
	String Panggilan; //inisialisasi "panggilan"
	String AlamatPalsu; //inisialisasi "AlamatPalsu"
	String NomerHape; //inisialisasi "NomerHape"
	
	//atribut
	public String getBio(){ //mendeklarasikan getter "Bio"
		return Bio; //mengembalikan nilai "Bio"
	}
	public void setBio(String A){ //mendeklarasikan setter "Bio"
		this.Bio = A; //menyatakan "Bio"
	}
	
	public String getPanggilan(){ //mendeklarasikan getter "Panggilan"
		return Panggilan; //mengembalikan nilai "Panggilan"
	}
	public void setPanggilan(String B){ //mendeklarasikan setter "Panggilan"
		this.Panggilan = B; //menyatakan "Panggilan"
	}
	
	public String getAlamatPalsu(){ //mendeklarasikan getter "AlamatPalsu"
		return AlamatPalsu; //mengembalikan nilai "AlamatPalsu"
	}
	public void setAlamatPalsu(String C){ //mendeklarasikan setter "AlamatPalsu"
		this.AlamatPalsu = C; //menyatakan "AlamatPalsu"
	}
	
	public String getNomerHape(){ //Mendeklarasikan getter "NomerHape"
		return NomerHape; //mengembalikan nilai "NomerHape"
	}
	public void setNomerHape(String D){ //mendeklarasikan setter "NomerHape"
		this.NomerHape = D; //menyatakan "NomerHape"
	}
	
	public static void main (String [] args){ //main 
		Adam NamaGue = new Adam(); //membuat objek baru bernama "NamaGue"
		Adam NamaPanggilan = new Adam(); //membuat objek baru bernama "NamaPanggilan"
		Adam AlamatGue = new Adam(); //membuat objek baru bernama "AlamatGue"
		Adam NomerHapeGue = new Adam(); //membuat objek baru bernama "NomerHapeGue"
		
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