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
		for(int i = 0; i < nesteledig; i++){
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
				nesteledig++;
                return true;
            }
        }
        return false;
	}
	
	public String toString() {
        Innlegg[] inntab = innleggtabell;
        String s = "";
        s += inntab.length + "\n";

        for (int i = 0; i < inntab.length; i++){
            s += inntab[i].toString();

        }
        return s;
    }

}