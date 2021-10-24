package models;

public class ClienteModel {

    public static class Cliente extends Pessoa {

        private String DataNasc;


        // Implementando o que se pede na atividade 8.02

        // public Cliente() {
        // }

        public Cliente(String dataNasc, String CPF, String nome, String endereco, String telefone) {
            super(CPF, nome, endereco, telefone);
            DataNasc = dataNasc;
        }

        public String getDataNasc() {
            return DataNasc;
        }

        public void setDataNasc(String dataNasc) {
            DataNasc = dataNasc;
        }

        @Override
        public String Cadastrar(){
            return "Nao cadastrado no momento";
        }
    }
}