package models;

public class ItemVendaModel {

    public static class ItemVenda{

        private int Venda;
        private int Livro;
        private int Quantidade;
        private double ValorUnitario;

        // Implementando o que se pede na atividade 8.02

        public ItemVenda() {
        }

        public ItemVenda(int venda, int livro, int quantidade, double valorUnitario) {
            Venda = venda;
            Livro = livro;
            Quantidade = quantidade;
            ValorUnitario = valorUnitario;
        }

        public int getVenda() {
            return Venda;
        }

        public int getLivro() {
            return Livro;
        }

        public int getQuantidade() {
            return Quantidade;
        }

        public double getValorUnitario() {
            return ValorUnitario;
        }

        public void setVenda(int venda) {
            Venda = venda;
        }

        public void setLivro(int livro) {
            Livro = livro;
        }

        public void setQuantidade(int quantidade) {
            Quantidade = quantidade;
        }

        public void setValorUnitario(double valorUnitario) {
            ValorUnitario = valorUnitario;
        }
    }
}
