package Menjacnica;

import java.util.LinkedList;

public class Menjacnica {
private LinkedList <Datum> datumi = new LinkedList<Datum>();

public LinkedList<Datum> getDatumi() {
	return datumi;
}

public void setDatumi(LinkedList<Datum> datumi) {
	if(this.datumi.equals(datumi)) throw new RuntimeException("Vec postoji ova lista datuma");
	this.datumi = datumi;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((datumi == null) ? 0 : datumi.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Menjacnica other = (Menjacnica) obj;
	if (datumi == null) {
		if (other.datumi != null)
			return false;
	} else if (!datumi.equals(other.datumi))
		return false;
	return true;
}

@Override
public String toString() {
	return "Menjacnica [datumi=" + datumi + "]";
}

}
