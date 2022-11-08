public abstract class ProdottoMultimediale {  // prodotto multimediale in generale. Ovvero estende sia Serie Tv che Film
    private String titolo;
    private int annoUscita;
    private String[] cast;
    private String genere;
    private String linguaOriginale;

    ProdottoMultimediale(String titolo, int annoUscita, String[] cast, String genere, String linguaOriginale){
        this.titolo = titolo;
        this.annoUscita = annoUscita;
        this.cast = cast;
        this.genere = genere;
        this.linguaOriginale = linguaOriginale;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoUscita() {
        return annoUscita;
    }

    public String[] getCast() {
        return cast;
    }

    public String getGenere() {
        return genere;
    }

    public String getLinguaOriginale() {
        return linguaOriginale;
    }
}
