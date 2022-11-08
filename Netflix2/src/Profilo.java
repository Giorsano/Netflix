import java.util.Arrays;

public class Profilo {
    private String email;
    private String password;
    private String tipoOfferta;
    private String[] utenti;

Profilo(String email, String password, String tipoOfferta, String[] utenti) {
    this.email = email;
    this.password = password;
    this.tipoOfferta = tipoOfferta;
    this.utenti = utenti;
}

public String toString(){
    String profilo = "Profilo: " + this.email + ", " + "Password: " + this.password + ", " + "Offerta: " + this.tipoOfferta + ", " + "Utenti: " + Arrays.toString(utenti);
    return profilo;
}

}
