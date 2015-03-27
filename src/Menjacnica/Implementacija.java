package Menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import Interfejs.MenjacnicaInterfejs;


public class Implementacija extends Menjacnica implements MenjacnicaInterfejs {
    Menjacnica menj = new Menjacnica();
    LinkedList<Datum> listaDatuma = menj.getDatumi();	
    Datum datum2;
    int size = listaDatuma.size();
  

	public void dodavanjeKursa(GregorianCalendar datum, String valutaIme,
			double prodajni, double srednji, double kupovni) {



		datum2.setDatum(datum);
		datum2.setIme(valutaIme);
		datum2.setkKurs(kupovni);
		datum2.setpKurs(prodajni);
		datum2.setsKurs(srednji);
		listaDatuma.add(datum2);
		
		
    }

	public void brisanjeKursa(GregorianCalendar datum, String valutaIme) {

	GregorianCalendar trenutniDatum = new GregorianCalendar();
	if(datum.after(trenutniDatum)) throw new RuntimeException("Trazeni datum ne moze biti datum posle sadasnjeg");


	for(int i = 0;i<size;i++){
		int sizeValute = listaDatuma.get(i).getValuteNaDan().size();
		if(listaDatuma.get(i).getDatum()==datum){
			for(int j=0;j<sizeValute;j++){
			if(valutaIme.equals(listaDatuma.get(i).getValuteNaDan().get(j).getIme())) {listaDatuma.get(i).getValuteNaDan().remove(j);
			return;
			}	
			}
		}
		
	}	
    throw new RuntimeException("Trazeni kurs ne postoji");

	}

	public Valuta pronadjiKurs(GregorianCalendar datum, String valutaIme) {
		GregorianCalendar trenutniDatum = new GregorianCalendar();
		if(datum.after(trenutniDatum)) throw new RuntimeException("Trazeni datum ne moze biti datum posle sadasnjeg");
	for(int i=0;i<size;i++){
		int sizeValute = listaDatuma.get(i).getValuteNaDan().size();
		if(listaDatuma.get(i).getDatum()==datum){
			for(int j=0;j<sizeValute;j++){
				if(valutaIme.equals(listaDatuma.get(i).getValuteNaDan().get(j).getIme())) {
				return(listaDatuma.get(i).getValuteNaDan().get(j));	
				}	
				
			}
			
		}
		
	}	
    throw new RuntimeException("Trazeni kurs za valutu "+valutaIme+"za dan"+datum+"ne postoji");
	}
	
		

	}


