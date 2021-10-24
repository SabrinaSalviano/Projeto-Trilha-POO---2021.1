package models;

public class PedidoFornecedorModel {

    public static class PedidoFornecedor{

        private String IdFornecedor;
        private int IdLivro;
        private int Quantidade;

        // Implementando o que se pede na atividade 8.02

        public PedidoFornecedor() {
        }

        public PedidoFornecedor(String idFornecedor, int idLivro, int quantidade) {
            IdFornecedor = idFornecedor;
            IdLivro = idLivro;
            Quantidade = quantidade;
        }

        public String getIdFornecedor() {
            return IdFornecedor;
        }

        public int getIdLivro() {
            return IdLivro;
        }

        public int getQuantidade() {
            return Quantidade;
        }

        public void setIdFornecedor(String idFornecedor) {
            IdFornecedor = idFornecedor;
        }

        public void setIdLivro(int idLivro) {
            IdLivro = idLivro;
        }

        public void setQuantidade(int quantidade) {
            Quantidade = quantidade;
        }
    }
}
