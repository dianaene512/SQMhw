public class Caine {
    String nume;
    int varsta;
    String nr_telefon_proprietar;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNr_telefon_proprietar() {
        return nr_telefon_proprietar;
    }

    public void setNr_telefon_proprietar(String nr_telefon_proprietar) {
        this.nr_telefon_proprietar = nr_telefon_proprietar;
    }

    public Caine(String nume, int varsta, String nr_telefon_proprietar) {
        this.nume = nume;
        this.varsta = varsta;
        this.nr_telefon_proprietar = nr_telefon_proprietar;

        System.out.println("HAM-HAM!");
    }
}
