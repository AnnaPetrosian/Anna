package vierdeweek;



public class Verzinopdracht {

	public static void main(String[] args) {
		Winkel winkel = new Winkel();
		Persoon persoon = new Persoon();
		persoon.naam= "Pietje";
		winkel.boodschappenmaken(persoon);
		Geld geld = new Geld();
		
}

}
class Winkel{
	void boodschappenmaken(Persoon mPersoon) {
		if(mPersoon.geld.geengeld) {
			System.out.println("Geen geld!!! Geen boodschappen");
		}else
			System.out.println("Welkom: Wat wilt u hebben!!!");
		
	}

}
		
class Persoon{
	String naam;
	Geld geld = new Geld();
	
}
class Geld{
	
	boolean geengeld = false;
}
	
