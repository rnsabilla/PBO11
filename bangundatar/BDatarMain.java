package bangundatar;

public class BDatarMain
{
	public static void main(String[] args)
	{
		System.out.println("\nPersegi");
		Persegi a = new Persegi();
		a.setSisi(40);
		showLuasKeliling(a);

		System.out.println("\nsegitiga siku");
		SegitigaSiku b = new SegitigaSiku();
		b.setAlas(10);
		b.setTinggi(30);
		showLuasKeliling(b);

		System.out.println("\nsegitiga sama kaki");
		SegitigaSamaKaki d = new SegitigaSamaKaki();
		d.setAlas(7);
		d.setTinggi(9);
		showLuasKeliling(d);

		System.out.println("\nsegitiga sama sisi");
		SegitigaSamaSisi e = new SegitigaSamaSisi();
		e.setAlas(6);
		e.setTinggi(4);
		showLuasKeliling(e);
	}

	static void showLuasKeliling(BangunDatar a)
	{
		System.out.print("Luas = ");
		a.luas();
		System.out.print("Keliling = ");
		a.keliling();
	}
}