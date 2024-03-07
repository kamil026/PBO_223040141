package Latihan;

public class LingkaranMain2Variable {
	public static void main(String[] args) {
		Lingkaran l1 = new Lingkaran(5);
		Lingkaran l2 = l1;
		System.out.println(l1.getJari2());
		System.out.println(l2.getJari2());
		l2.setJari2(10);
		System.out.println(l1.getJari2());
		System.out.println(l2.getJari2());
	}
}
