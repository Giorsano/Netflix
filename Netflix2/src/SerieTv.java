public class SerieTv extends ProdottoMultimediale {
    private int numStagioni;
    private int episodiPerStagione;

    SerieTv(String titolo, int annoUscita, String[] cast, String genere, String linguaOriginale, int numStagioni, int episodiPerStagione) {  //costruttore
        super(titolo, annoUscita, cast, genere, linguaOriginale);
        this.numStagioni = numStagioni;
        this.episodiPerStagione = episodiPerStagione;
    }

    public int getNumStagioni() {
        return numStagioni;
    }

    public int getEpisodiPerStagione() {
        return episodiPerStagione;
    }
}
