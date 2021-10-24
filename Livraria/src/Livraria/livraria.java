package Livraria;

import models.*;

import javax.swing.*;

public class livraria {

    public static void main (String [] args){

        // Atividade 3.02

        String autor1 = "Nicholas Sparks";
        String autor2 = "George Orwell";
        String autor3 = "Edgar Allan Poe";

        String SelectAutor;
        String SelectGenero;

        SelectAutor =  JOptionPane.showInputDialog("Informe sobre qual destes autores voce gostaria de saber sobre o estoque:\n" + autor1 + "\n" + autor2 + "\n" + autor3);

        // Atividade 4.02

        if(SelectAutor.equals(autor1)){
            JOptionPane.showMessageDialog(null, "Os titulos disponives de Nicholas em nosso estoque sao:\n O Diario de Uma Paixao, A Ultima Musica e Querido John ");
        }
        else if(SelectAutor.equals(autor2)){
            JOptionPane.showMessageDialog(null, "Os titulos disponives de George em nosso estoque sao:\n A Revolucao dos Bixos e 1984  ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Os titulos disponives de Edgar em nosso estoque sao:\n O Gato Preto e outros contos, Medo Classico e Historias Extraordinarias ");
        }
        //Atividade 5.02 - Implementando uma estrutura de repeticao de forma criativa no meu projeto.

        int k;
        for(k = 0; k < 3; k++) {

        SelectGenero =  JOptionPane.showInputDialog( "Legal, voce acabou de conhecer alguns autores e algumas de suas obras disponiveis.\nAgora, para que a sua experiencia seja mais confortavel voce poderia nos dizer qual desses generos literarios voce prefere?\nRomance, Horror, Fantasia ou Poesia? ");

            switch (SelectGenero) {

                case "romance":
                    JOptionPane.showMessageDialog(null, "Entre os titulos de romance mais conhecidos, no momento temos para voce:\nAlmas Gemeas e O Diario de Uma Paixao - Nicholas Sparks\n Quem é voce, Alasca? e A Culpa é Das Estrelas - John Green");
                    break;
                case "Romance":
                    JOptionPane.showMessageDialog(null, "Entre os titulos de romance mais conhecidos, no momento temos para voce:\nAlmas Gemeas e O Diario de Uma Paixao - Nicholas Sparks\n Quem é voce, Alasca? e A Culpa é Das Estrelas - John Green");
                    break;
                case "horror":
                    JOptionPane.showMessageDialog(null, "Entre os titulos de terror/horror mais conhecidos, no momento temos para voce:\nMedo Classico e O Corvo e outros contos - Edgar Allan Poe\n Cujo, O Iluminado e It: A Coisa - Stephen King");
                    break;
                case "Horror":
                    JOptionPane.showMessageDialog(null, "Entre os titulos de terror/horror mais conhecidos, no momento temos para voce:\nMedo Classico e O Corvo e outros contos - Edgar Allan Poe\n Cujo, O Iluminado e It: A Coisa - Stephen King");
                    break;
                case "fantasia":
                    JOptionPane.showMessageDialog(null, "Entre os titulos de fantasia  mais conhecidos, no momento temos para voce:\nAs Duas Torres, O Retorno do Rei e A Sociedade do Anel - J.R.R. Tolkien\n Corte de Espinhos e Rosas, Corte de Nevoa e Furia, Corte de Asas e Ruina, e Corte de Chamas Prateadas - Sarah J. Mass");
                    break;
                case "Fantasia":
                    JOptionPane.showMessageDialog(null, "Entre os titulos de fantasia mais conhecidos, no momento temos para voce:\nAs Duas Torres, O Retorno do Rei e A Sociedade do Anel - J.R.R. Tolkien\n Corte de Espinhos e Rosas, Corte de Nevoa e Furia, Corte de Asas e Ruina, e Corte de Chamas Prateadas - Sarah J. Mass");
                    break;
                case "poesia":
                    JOptionPane.showMessageDialog(null, "Entre os titulos de poesia mais conhecidos, no momento temos para voce:\nTudo Nela Brilha e Queima, e Jamais Peco Desculpas Por Me Derramar - Ryane Leao\n Claro Enigma, Alguma Poesia e Sentimentos do Mundo - Carlos Drummond de Andrade");
                    break;
                case "Poesia":
                    JOptionPane.showMessageDialog(null, "Entre os titulos de poesia mais conhecidos, no momento temos para voce:\nTudo Nela Brilha e Queima, e Jamais Peco Desculpas Por Me Derramar - Ryane Leao\n Claro Enigma, Alguma Poesia e Sentimentos do Mundo - Carlos Drummond de Andrade");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Desculpe, acho que voce nao escreveu nada ou talvez o seu genero favorito ainda nao esteja em nosso acervo.");
            }
        }

        // Atividade 6.02

        int j;
        int cont =0;
        int tamanho = 8;
        String[] LivrosEmEstoque = new String[tamanho];
        String[] LivrosDesejados = new String[tamanho];

        LivrosEmEstoque[0]= "espadachim de carvao e as pontes de puzur";
        LivrosEmEstoque[1]= "as duas torres";
        LivrosEmEstoque[2]= "tudo nela brilha e queima";
        LivrosEmEstoque[3]= "coraline";
        LivrosEmEstoque[4]= "por lugares incriveis";
        LivrosEmEstoque[5]= "bukowiski sobre gatos";
        LivrosEmEstoque[6]= "alice no pais das maravilhas";
        LivrosEmEstoque[7]= "o pequeno principe";

        for(k = 0; k <= tamanho-1; k++){
          LivrosDesejados[k] = JOptionPane.showInputDialog("Informe o livro que voce deseja para que possamos\n saber se ha disponibilidade em nosso estoque, por favor.\n Lembre-se de informar um livro por vez e por favor,\n informe o nome do livro corretamente e com letras minusculas ;) ");
        }

        for(k = 0; k <= tamanho-1; k++){
            cont =0;
            for(j = 0; j <= tamanho-1; j++) {
                if (LivrosDesejados[k].equals(LivrosEmEstoque[j]))  {

                    cont = cont +1;

                }

            }
            if(cont>0){
                JOptionPane.showMessageDialog(null, "O livro " + LivrosDesejados[k] + " esta disponivel em nosso estoque!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Desculpe livro " + LivrosDesejados[k] + " nao esta disponivel em nosso estoque!");
            }
        }

        final int Quantidade = 2;

        AutorModel.Autor autor = new AutorModel.Autor(1, "Edgar Allan Poe");

        ClienteModel.Cliente cliente = new ClienteModel.Cliente("02/01/1992", "087.158.458-97", "João Miguel","Rua das Almas, 97", "(11)98888-8888");

        EditoraModel.Editora editora = new EditoraModel.Editora(45, "Darksida");

        FornecedorModel.Fornecedor fornecedor = new FornecedorModel.Fornecedor("77.777.777/0001-36", "FornexLivros","92545-3655", "fornex@livros.com");

        FuncionarioModel.Funcionario funcionario = new FuncionarioModel.Funcionario(2, "888.999.444.78","Maria Sampaio","Rua vinte de abril, 89","95555-6666");

        LivroModel.Livro livro = new LivroModel.Livro(1,"Medo Classico", autor.getId(), editora.getId(), 35.50);

        ItemVendaModel.ItemVenda itemVenda = new ItemVendaModel.ItemVenda(6, livro.getId(),2, 35.50);

        PedidoFornecedorModel.PedidoFornecedor pedidoFornecedor = new PedidoFornecedorModel.PedidoFornecedor(fornecedor.getCNPJ(), livro.getId(),Quantidade);

        VendaModel.Venda venda = new VendaModel.Venda(6,"31/07/2021", funcionario.getId(), 71.00, cliente.getCPF());

        venda.entrega();
    }

}
