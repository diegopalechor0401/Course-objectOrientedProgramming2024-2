package Taller2;

public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private int numeroPaginas;
    private boolean disponible;

    public Libro(String titulo, String autor, String ISBN, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.disponible = true;  
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado y no puede ser prestado nuevamente.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está disponible y no necesita ser devuelto.");
        }
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}