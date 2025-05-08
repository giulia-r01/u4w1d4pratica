package esercizio;

public abstract class Dipendente implements CheckIn {
    private String matricola;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }


    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();
}
