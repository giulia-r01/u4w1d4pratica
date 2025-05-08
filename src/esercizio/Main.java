package esercizio;

public class Main {
    public static void main(String[] args) {


        Dipendente[] dipendenti = new Dipendente[4];

        dipendenti[0] = new DipendenteFullTime("1234", Dipartimento.PRODUZIONE, 2100.00 );
        dipendenti[1] = new DipendentePartTime("4567", Dipartimento.VENDITE, 80, 15.50 );
        dipendenti[2] = new Dirigente("9876", Dipartimento.AMMINISTRAZIONE);
        dipendenti[3] = new DipendentePartTime("8654", Dipartimento.PRODUZIONE, 60, 18.00 );

        CheckIn[] presenti = new CheckIn[5];

        presenti[0] = new DipendenteFullTime("8756", Dipartimento.PRODUZIONE, 2100.00);
        presenti[1] = new DipendentePartTime("8230", Dipartimento.VENDITE, 80, 15.50);
        presenti[2] = new Dirigente("6183", Dipartimento.AMMINISTRAZIONE);
        presenti[3] = new Volontario("Giggi", 27, "StudyBuddy presso Epicode");
        presenti[4] = new Volontario("Giangiorgia", 34, "Insegnante presso Epicode");


        stampaMatricola(dipendenti);

        stampaDipendenti(dipendenti);

        stampaCheckIn(presenti);


    }

    public static void stampaCheckIn(CheckIn[] persone){
        for (int i = 0; i < persone.length; i++) {
            persone[i].checIn();

        }
    }

    public static void stampaDipendenti(Dipendente[] dipendenti){
        double totaleStipendi = 0;
        for (int i = 0; i < dipendenti.length; i++) {
            double stipendio = dipendenti[i].calculateSalary();
            System.out.println("Matricola: " + dipendenti[i].getMatricola()
                    + " - Dipartimento: " + dipendenti[i].getDipartimento()
                    + " - Stipendio: " + stipendio);
            totaleStipendi += stipendio;
        }

        System.out.println("Totale stipendi da pagare: " + totaleStipendi);
    }

    public static void stampaMatricola(Dipendente[] dipendenti){
        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Matricola del dipendente: "+ dipendenti[i].getMatricola());

        }
    }


}
