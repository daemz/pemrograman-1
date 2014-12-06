class tabung extends bangun{
	double hitungLuasAlasTabung(){
	double luasAlas;
		luasAlas=phi*r*r;
		return luasAlas;
	}
		double hitungLuasSelimutTabung(){
	double luasselimut;
		luasselimut=2*phi*r*t;
		return luasselimut;
	}
	double hitungVolumeTabung(){
	double volume;
		volume=phi*r*r*t;
		return volume;
	}
}