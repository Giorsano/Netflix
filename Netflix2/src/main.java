public class main {

    public static void main(String[] args){
        Profilo profilo = new Profilo("LaMiaEmail@gmail.com", "893409jk", "Abbonamento standard", new String[]{"Sofia", "Marco", "Francesca"});
        Utente utente = new Utente("LaMiaEmail@gmail.com", "893409jk", "Abbonamento standard", new String[]{}, "Sofia", "Standard", 66759);
        Film film = new Film("Shutter Island", 2010, new String[]{"Leonardo di Caprio", "Mark Ruffalo", "Ben Kingsley"}, "Thriller", "Inglese");
        SerieTv serieTv = new SerieTv("Le Bizzarre Avventure di Jojo", 2012, new String[]{"Jotaro Kujo", "Dio Brando", "Joseph Joestar"},"Anime", "Giapponese", 6, 40);



    }
}
