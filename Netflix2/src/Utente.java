public class Utente extends Profilo {
    private String nomeUtente;
    private String tipoUtente;
    private int pin;
    private Catalogo catalogo;

    Utente(String email, String password, String tipoOfferta, String[] utenti, String nomeUtente, String tipoUtente, int pin, Catalogo catalogo) {
        super(email, password, tipoOfferta, utenti);
        this.nomeUtente = nomeUtente;
        this.tipoUtente = tipoUtente;
        this.pin = pin;

    }


}
