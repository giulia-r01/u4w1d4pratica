public class Dirigente extends Dipendente{
    private static final double STIPENDIO_DIRIGENTE = 5000.0;

    public Dirigente(String matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return STIPENDIO_DIRIGENTE;
    }

    @Override
    public void checIn() {

    }
}
