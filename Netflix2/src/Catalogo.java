import java.util.Arrays;
import java.util.Objects;

public class Catalogo {
    private String[] laMiaLista;
    private String[] iMiePiaciuti;

    private String[] divisiPerGenere;

    private String[] consigliati;
    private ProdottoMultimediale prodottoMultimediale;

    Catalogo(String[] laMiaLista, String[] iMiePiaciuti, String[] divisiPerGenere, String[] consigliati) {
        this.laMiaLista = new String[6];
        this.iMiePiaciuti = new String[6];
        this.divisiPerGenere = new String[6];
        this.consigliati = new String[6];
    }

    public String[] listaPreferiti(String[] laMiaLista) {
        for (int i = 0; i < laMiaLista.length; i++) {
            if (laMiaLista[i] == null) {
                laMiaLista[i] = prodottoMultimediale.getTitolo();
                break;
            }
        }
        return laMiaLista;
    }


    public String[] listaMiPiace(String[] iMiePiaciuti) {
        for (int j = 0; j < iMiePiaciuti.length; j++) {
            if (iMiePiaciuti[j] == null) {
                iMiePiaciuti[j] = prodottoMultimediale.getTitolo();
            }
        }
        return iMiePiaciuti;
    }

    public String[] listaGeneri(String[] divisiPerGenere){
        for (int y = 0; y < divisiPerGenere.length; y++){
            if (Objects.equals(prodottoMultimediale.getTitolo(), prodottoMultimediale.getGenere())) {
                divisiPerGenere[y] = prodottoMultimediale.getTitolo();
                break;
            }
        }
        return divisiPerGenere;
    }


    public String[] listaConsigliati(String[] consigliati){
        for (int a = 0; a < consigliati.length; a++){
            if(Objects.equals(prodottoMultimediale.getTitolo(), prodottoMultimediale.getGenere())){
                consigliati[a] = prodottoMultimediale.getTitolo();
            }
        }
        return consigliati;
    }

    public String toString() {
        String liste = "I tuoi preferiti: " + Arrays.toString(laMiaLista) + "\n" + "I tuoi 'Mi Piace': " + Arrays.toString(iMiePiaciuti) + "\n" + "\n" + "Potrebbero piacerti: " + Arrays.toString(consigliati) + "\n" + "\n" + "Filme e Serie divisi per genere: " + Arrays.toString(divisiPerGenere);

        return liste;
    }

    public String[] getDivisiPerGenere(){
        return divisiPerGenere;
    }


}
