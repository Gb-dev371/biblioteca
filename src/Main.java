import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Livro[] livros = new Livro[1000];
        String retorno;
        int i = 0;

        do{
            System.out.println("********************************");
            System.out.println("Sistema de Cadastro de Livros:");
            System.out.println("********************************");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar revista");
            System.out.println("3 - Procurar livro");
            System.out.println("4 - Listar livros");
            System.out.println("5 - Quantidade cadastrada/livre");
            System.out.println("6 - Excluir último livro da lista");
            System.out.println("7 - Ordenar livros cadastrados");
            System.out.println("8 - Encerrar programa");

            retorno = inp.next();

            if(retorno.equals("1")){
                String nome, autor, editora, prateleira, secao;
                int ISBN, edicao, ano, CDD;

                System.out.println("Informe o nome do livro: ");
                nome = inp.next();

                System.out.println("Informe o nome do autor: ");
                autor = inp.next();

                System.out.println("Informe o número do ISBN: ");
                ISBN = inp.nextInt();

                System.out.println("Informe o número da edição do livro: ");
                edicao = inp.nextInt();

                System.out.println("Informe o ano de publicação do livro: ");
                ano = inp.nextInt();

                System.out.println("Informe o nome da editora do livro: ");
                editora = inp.next();

                System.out.println("Informe a prateleira: ");
                prateleira = inp.next();

                System.out.println("Informe a seção: ");
                secao = inp.next();

                System.out.println("Informe o CDD: ");
                CDD = inp.nextInt();

                System.out.print("");
                livros[i] = new Livro(nome, autor, editora, prateleira, secao, ISBN, edicao, ano, CDD);
                // String nome, String autor, String editora, String prateleira, String secao, int ISBN, int edicao, int ano, int CDD

                i++;
                System.out.println("Livro cadastrado com sucesso!");
            }

            if(retorno.equals("4")){
                System.out.println("Livros listados:");

                if(i>0) {
                    for (int k = 0; k < i; k++) {
                        System.out.println(livros[k].getNome() + ", " +
                                livros[k].getAutor() + ", " +
                                livros[k].getISBN() + ", " +
                                livros[k].getAno() + ", " +
                                livros[k].getEditora() + ", " +
                                livros[k].getPrateleira() + ", " +
                                livros[k].getSecao() + ", " +
                                livros[k].getISBN() + ", " +
                                livros[k].getEdicao() + ", " +
                                livros[k].getAno() + ", " +
                                livros[k].getCDD() + ", ");
                    }
                }else{
                    System.out.println("Não há livros cadastrados.");
                }
            }

            if(retorno.equals("5")){
                System.out.println("Total = 1000");
                System.out.println("Usado = "+i);
                System.out.println("Disponíveis: "+(1000-i));
            }

            if(retorno.equals("6")){
                if(i>0){
                    i--;
                    System.out.println("Excluído com sucesso");
                }else{
                    System.out.println("Não existe nenhum livro cadastrado");
                }

            }

        }while(!retorno.equals("7"));

        System.out.println("Fim do programa");
    }
}