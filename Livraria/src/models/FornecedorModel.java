package models;

public class FornecedorModel {

    public static class Fornecedor{

        private String CNPJ;
        private String RazaoSocial;
        private String Telefone;
        private String Email;

        // Implementando o que se pede na atividade 8.02

        public Fornecedor() {
        }

        public Fornecedor(String CNPJ, String razaoSocial, String telefone, String email) {
            this.CNPJ = CNPJ;
            RazaoSocial = razaoSocial;
            Telefone = telefone;
            Email = email;
        }

        public String getCNPJ() {
            return CNPJ;
        }

        public String getRazaoSocial() {
            return RazaoSocial;
        }

        public String getTelefone() {
            return Telefone;
        }

        public String getEmail() {
            return Email;
        }

        public void setCNPJ(String CNPJ) {
            this.CNPJ = CNPJ;
        }

        public void setRazaoSocial(String razaoSocial) {
            RazaoSocial = razaoSocial;
        }

        public void setTelefone(String telefone) {
            Telefone = telefone;
        }

        public void setEmail(String email) {
            Email = email;
        }
    }
}
