package models;

public class LivroModel {

    public static class Livro{

        private int Id;
        private String Titulo;
        private int Autor;
        private int Editora;
        private double Valor;

        // Implementando o que se pede na atividade 8.02

        public Livro() {
        }

        public Livro(int id, String titulo, int autor, int editora, double valor) {
            Id = id;
            Titulo = titulo;
            Autor = autor;
            Editora = editora;
            Valor = valor;
        }

        public int getId() {
            return Id;
        }

        public String getTitulo() {
            return Titulo;
        }

        public int getAutor() {
            return Autor;
        }

        public int getEditora() {
            return Editora;
        }

        public double getValor() {
            return Valor;
        }

        public void setId(int id) {
            Id = id;
        }

        public void setTitulo(String titulo) {
            Titulo = titulo;
        }

        public void setAutor(int autor) {
            Autor = autor;
        }

        public void setEditora(int editora) {
            Editora = editora;
        }

        public void setValor(double valor) {
            Valor = valor;
        }
    }
}
