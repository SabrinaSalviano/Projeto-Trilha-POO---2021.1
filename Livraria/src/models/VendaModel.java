package models;

public class VendaModel{

    public static class Venda  implements Delivery {

        private int Id;
        private String Data;
        private int Funcionario;
        private double ValorTotal;
        private String Cliente;

        // Implementando o que se pede na atividade 8.02

        public Venda() {
        }

        public Venda(int id, String data, int funcionario, double valorTotal, String cliente) {
            Id = id;
            Data = data;
            Funcionario = funcionario;
            ValorTotal = valorTotal;
            Cliente = cliente;
        }

        public int getId() {
            return Id;
        }

        public String getData() {
            return Data;
        }

        public int getFuncionario() {
            return Funcionario;
        }

        public double getValorTotal() {
            return ValorTotal;
        }

        public String getCliente() {
            return Cliente;
        }

        public void setId(int id) {
            Id = id;
        }

        public void setData(String data) {
            Data = data;
        }

        public void setFuncionario(int funcionario) {
            Funcionario = funcionario;
        }

        public void setValorTotal(double valorTotal) {
            ValorTotal = valorTotal;
        }

        public void setCliente(String cliente) {
            Cliente = cliente;
        }

        public void entrega() {
            System.out.println("o pedido foi entrgue!!!");
        }
    }
}
