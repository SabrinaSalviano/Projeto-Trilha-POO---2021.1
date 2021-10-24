package models;

public class EditoraModel {

    public static class Editora{

        private int Id;
        private String RazaoSocial;

        // Implementando o que se pede na atividade 8.02

        public Editora() {
        }

        public Editora(int id, String razaoSocial) {
            Id = id;
            RazaoSocial = razaoSocial;
        }

        public int getId() {
            return Id;
        }

        public String getRazaoSocial() {
            return RazaoSocial;
        }

        public void setId(int id) {
            Id = id;
        }

        public void setRazaoSocial(String razaoSocial) {
            RazaoSocial = razaoSocial;
        }
    }


}
