
public class Raton {
	String nume;
	int varsta;
	float[] greutate;
	ECuloare culoare;
	
	public Raton(String nume, int varsta, float[] greutate, ECuloare culoare) throws VarstaException, 
															GreutateNegativaException, GrasException 
	
	{
		//sa fie varsta intre 5 si 10 ani
		if(varsta<5 || varsta>10) throw new VarstaException();
		
		//greutate pozitiva
		for(int i=0;i<greutate.length;i++){
			if(greutate[i]<=0) throw new GreutateNegativaException();
			if(varsta<7 && greutate[i]>10) throw new GrasException();
		}
		
		this.nume = nume;
		this.varsta = varsta;
		this.greutate = greutate;
		this.culoare = culoare;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) throws VarstaException {
		if(varsta<5 && varsta>10) throw new VarstaException();
		this.varsta = varsta;
	}
	public float[] getGreutate() {
		return greutate;
	}
	public void setGreutate(float[] greutate) throws GreutateNegativaException {
		for(int i=0;i<greutate.length;i++)
			if(greutate[i]<=0) throw new GreutateNegativaException();
		this.greutate = greutate;
	}
	public ECuloare getCuloare() {
		return culoare;
	}
	public void setCuloare(ECuloare culoare) {
		this.culoare = culoare;
	}
	
	public float greutateMaxima(){
		float max=greutate[0];
		for (int i=1;i<greutate.length;i++)
			if ( greutate[i] > max)
				max=greutate[i];
		
		return max;
		
		
	}
}
