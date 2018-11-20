package vierdeweek.felix;

public class Winkel {

	public static void main(String[] args) {
		Persoon persoon = new Persoon();
		persoon.naam= "Stephan";
		System.out.println(persoon.naam);
		persoon.geld = 100;
	//	persoon.vorstellen();
		Supermarkt sm = new Supermarkt();
		Maandje m = new Maandje();
		persoon.maandje = m;
		persoon.vorstellen();
		sm.boodschap = new Boodschap(25, "Melk");
		sm.welkomHeten(persoon);
		
	}

}
class Persoon{
	String naam;
	int geld = 0;
	Maandje maandje;
	void vorstellen(){
		System.out.println("Ik ben: " + naam + " ik heb " + geld +"  euro");
		System.out.println("mijn maandje is" + maandje.boodschap.naamb);
	}
}
class Supermarkt{
	Boodschap boodschap;
void welkomHeten(Persoon persoon){
		System.out.println("Welkom  " + persoon.naam);
		System.out.println("ik heb: " + boodschap.prijs);
		
	}
}
class Maandje{
	Boodschap boodschap = new Boodschap(3,"jojo");
}
class Boodschap{
	int prijs = 0;
	String naamb= null;
	Boodschap(int prijs, String naamb){
		this.naamb = naamb;
		this.prijs = prijs;
	}
	
}