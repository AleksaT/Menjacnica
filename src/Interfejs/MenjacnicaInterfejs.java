package Interfejs;

import java.util.GregorianCalendar;

import Menjacnica.Valuta;

public interface MenjacnicaInterfejs {
public void dodavanjeKursa(GregorianCalendar datum ,String valutaIme,double prodajni,double srednji,double kupovni);
public void brisanjeKursa (GregorianCalendar datum, String valutaIme);
public Valuta pronadjiKurs (GregorianCalendar datum, String valutaIme);
}
