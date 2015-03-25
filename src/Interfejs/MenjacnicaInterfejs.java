package Interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
public void dodavanjeKursa(GregorianCalendar datum ,String valutaIme,double prodajni,double srednji,double kupovni);
public void brisanjeKursa (GregorianCalendar datum, String valutaIme);
public void pronadjiKurs (GregorianCalendar datum, String valutaIme);
}
