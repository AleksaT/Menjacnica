package Menjacnica;

import java.util.GregorianCalendar;

public class Datum extends Valuta {
private GregorianCalendar datum = new GregorianCalendar();

public GregorianCalendar getDatum() {
	return datum;
}

public void setDatum(GregorianCalendar datum) {
	if(datum.before(this.datum.getTime())) throw new RuntimeException ("Datum ne moze biti pre danasnjeg");
	this.datum = datum;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((datum == null) ? 0 : datum.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Datum other = (Datum) obj;
	if (datum == null) {
		if (other.datum != null)
			return false;
	} else if (!datum.equals(other.datum))
		return false;
	return true;
}

@Override
public String toString() {
	return "Datum [datum=" + datum + ", toString()=" + super.toString() + "]";
}

}
