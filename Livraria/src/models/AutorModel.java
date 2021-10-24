package models;

public class AutorModel {

    public static class Autor{

        private int Id;
        private String Nome;

    // Implementando o que se pede na atividade 8.02

        public Autor() {
        }

        public Autor(int id, String nome) {
            Id = id;
            Nome = nome;
        }

        public int getId() {
            return Id;
        }

        public String getNome() {
            return Nome;
        }

        public void setId(int id) {
            Id = id;
        }

        public void setNome(String nome) {
            Nome = nome;
        }
    }
}
