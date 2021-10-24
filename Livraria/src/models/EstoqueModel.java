package models;

public class EstoqueModel {

    public static class Estoque{

        static int Id;
        private int Livro;
        private int Quantidade;

        // Implementando o que se pede na atividade 8.02

        public Estoque() {
        }

        public Estoque(int id, int livro, int quantidade) {
            Id = id;
            Livro = livro;
            Quantidade = quantidade;
        }

        public int getId() {

            return Id;
        }

        public int getLivro() {

            return Livro;
        }

        public int getQuantidade() {
            return Quantidade;
        }

        public void setId(int id) {
            Id = id;
        }

        public void setLivro(int livro) {
            Livro = livro;
        }

        public void setQuantidade(int quantidade) {
            Quantidade = quantidade;
        }
    }
}
