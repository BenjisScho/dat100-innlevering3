package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable
	protected String tekst;
	
	public Tekst() {
		super();
		this.tekst = "";
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes);

		this.tekst = tekst;
	}
	
	public String getTekst() { return tekst; }
	public void setTekst(String tekst) { this.tekst = tekst; }

	protected String harryInnlegg() {
		return super.toString();
	}

	@Override
	public String toString() {
		// TEKST\n1\nOle Olsen\n23-10\n0\nen tekst\n
		return "TEKST\n" + super.toString() + tekst + "\n";

	}
}
