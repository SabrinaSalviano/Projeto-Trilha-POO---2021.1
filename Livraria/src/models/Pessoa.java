package models;

public abstract class Pessoa {

       private String CPF;
       private String Nome;
       private String Endereco;
       private String Telefone;

       public abstract String Cadastrar();

    public Pessoa(String CPF, String nome, String endereco, String telefone) {
        this.CPF = CPF;
        Nome = nome;
        Endereco = endereco;
        Telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
}
