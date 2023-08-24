import java.util.Scanner;

public class Livro {
    private String nome, autor, editora, prateleira, secao;
    private int ISBN, edicao, ano, CDD;

    public Livro(String nome, String autor, String editora, String prateleira, String secao, int ISBN, int edicao, int ano, int CDD) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.prateleira = prateleira;
        this.secao = secao;
        this.ISBN = ISBN;
        this.edicao = edicao;
        this.ano = ano;
        this.CDD = CDD;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCDD() {
        return CDD;
    }

    public void setCDD(int CDD) {
        this.CDD = CDD;
    }
}