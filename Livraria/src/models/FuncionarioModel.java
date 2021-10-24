package models;

public class FuncionarioModel  {
    public static class Funcionario extends Pessoa{

        private int Id;
        // Implementando o que se pede na atividade 8.02


        public Funcionario(int Id, String CPF, String nome, String endereco, String telefone) {
            super(CPF, nome, endereco, telefone);
            this.Id = Id;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            this.Id = id;
        }

        @Override
        public String Cadastrar(){
            return "Ainda nao foi cadastrado";
        }

    }
}
