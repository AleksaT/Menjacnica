package Menjacnica;

import java.util.GregorianCalendar;

import Interfejs.MenjacnicaInterfejs;

public class Implementacija implements MenjacnicaInterfejs {
	Valuta valuta1;

	public void dodavanjeKursa(GregorianCalendar datum, String valutaIme,
			double prodajni, double srednji, double kupovni) {
		

	}

	public void brisanjeKursa(GregorianCalendar datum, String valutaIme) {
		

	}

	public Valuta pronadjiKurs(GregorianCalendar datum, String valutaIme) {
		return valuta1;

	}

}
