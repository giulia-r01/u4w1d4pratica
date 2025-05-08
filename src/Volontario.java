public class Volontario implements CheckIn{
    private String name;
    private int eta;
    private String cv;

    public Volontario(String name, int eta, String cv) {
        this.name = name;
        this.eta = eta;
        this.cv = cv;
    }

    @Override
    public void checIn() {
        System.out.println("Il dipendente " + name + " ha iniziato il servizio.");
    }
}
