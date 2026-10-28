package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++){
			if (innleggtabell[i].erLik(innlegg)){
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for(int i = 0; i < innleggtabell.length; i++){
            if(innleggtabell[i].erLik(innlegg)){
                return true;
            }
        }
        return false;
	}

	public boolean ledigPlass() {
		for (int i = 0; i < innleggtabell.length; i++){
            if (innleggtabell[i] != null){
                i++;
            }else{
                return true;
            }
        }
        return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
        for (int i = 0; i < innleggtabell.length; i++){
            if (innleggtabell[i] != null){
                if (innleggtabell[i].erLik(innlegg)) {
                    return false;
                }
            }
            else if(innleggtabell[i] == null){
                innleggtabell[i] = innlegg;
                return true;
            }
        }
        return false;
	}
	
	public String toString() {
        //2\nTEKST\n1\nOle Olsen\n23-10\n0\nen tekst\nBILDE\n2\nOline Olsen\n24-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n
        Innlegg inntab[] = innleggtabell;
        String s = "";
        for (int i = 0; i < inntab.length; i++){
             s = String.format("%s%n%s%n%s%n%s%n%s%n",
                    nesteledig, inntab[i].getClass(), inntab[i].getBruker(),
                    inntab[i].getDato(), inntab[i].getLikes());
        }
        return s;
    }

	// valgfrie oppgaver nedenfor
	
	/*public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}*/


}