package Menjacnica;

public class Valuta {
private String ime;
private String sIme;
private double pKurs;
private double sKurs;
private double kKurs;
public String getIme() {
	return ime;
}
public void setIme(String ime) {
	if(ime.length()<3 || ime.length()==0) throw new RuntimeException("Morate uneti naziv valute!");
	this.ime = ime;
}
public String getsIme() {
	return sIme;
}
public void setsIme(String sIme) {
	if(sIme.length()>3 || sIme.length()==0) throw new RuntimeException("Skraceni naziv valute mora imati 3 karaktera!");
	this.sIme = sIme;
}
public double getpKurs() {
	return pKurs;
}
public void setpKurs(double pKurs) {
	if(pKurs<0) throw new RuntimeException ("Morate uneti prodajni kurs!");
	this.pKurs = pKurs;
}
public double getsKurs() {
	return sKurs;
}
public void setsKurs(double sKurs) {
	if(sKurs<0) throw new RuntimeException ("Morate uneti srednji kurs!");
	this.sKurs = sKurs;
}
public double getkKurs() {
	return kKurs;
}
public void setkKurs(double kKurs) {
	if(kKurs<0) throw new RuntimeException ("Morate uneti kupovni kurs!");
	this.kKurs = kKurs;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((ime == null) ? 0 : ime.hashCode());
	long temp;
	temp = Double.doubleToLongBits(kKurs);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(pKurs);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((sIme == null) ? 0 : sIme.hashCode());
	temp = Double.doubleToLongBits(sKurs);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	Valuta v = (Valuta) (obj);
	if(sIme.equals(v.getsIme())) return true;
	return false;
}
@Override
public String toString() {
	return "Valuta ["+ime + "(" + sIme +")"+" prodajni kurs=" + pKurs
			+ ",srednji kurs=" + sKurs + ", kupovni kurs=" + kKurs + "]";
}

}
