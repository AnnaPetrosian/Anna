package vierdeweek.felix;

public class Winkel {

	public static void main(String[] args) {
		Persoon persoon = new Persoon();
		persoon.naam= "Stephan";
		System.out.println(persoon.naam);
		persoon.geld = 100;
	//	persoon.vorstellen();
		Supermarkt sm = new Supermarkt();
		sm.welkomHeten(persoon);
		Maandje m = new Maandje();
		persoon.maandje = m;
		persoon.vorstellen();
		
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
void welkomHeten(Persoon persoon){
		System.out.println("Welkom  " + persoon.naam);
	}
}
class Maandje{
	Boodschap boodschap = new Boodschap();
}
class Boodschap{
	int prijs = 0;
	String naamb= null;
}