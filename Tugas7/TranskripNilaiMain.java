package Tugas7;

public class TranskripNilaiMain {
	public static void main(String[] args) {
		//create objek matakuliah
		MataKuliah mk1 = new MataKuliah("001","Algoritma Pemrograman 1","A",3,4);
		MataKuliah mk2 = new MataKuliah("002","Algoritma Pemrograman 2","BC",3,2.5);
		MataKuliah mk3 = new MataKuliah("003","Pemrograman Berorientasi Objek","B",3,3);
		
		//create objek KHS
		KartuHasilStudi khs = new KartuHasilStudi("20222");
		khs.addMatakuliah(mk1);
		khs.addMatakuliah(mk2);
		khs.addMatakuliah(mk3);
		
		//create objek mahasiswa
		Mahasiswa mhs = new Mahasiswa("303040001","Jhon");
		
		//create objek TranskripNilai
		TranskripNilai transkrip = new TranskripNilai(mhs);
		transkrip.addKHS(khs);
		transkrip.hitungIPK();
		transkrip.display();
	}
}
