public class DipendenteFullTime extends Dipendente{
    private double stipendioMensile;

    public DipendenteFullTime(String matricola, Dipartimento dipartimento, double stipendio) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendio;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }

    @Override
    public void checIn() {

    }
}
