public class Revista extends Livro{
    private String ISSN;

    public Revista(String ISSN, String nome, String autor, String editora, String prateleira, String secao, int ISBN, int edicao, int ano, int CDD){
        super(nome, autor, editora, prateleira, secao, ISBN, edicao, ano, CDD);
        this.ISSN = ISSN;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
}
