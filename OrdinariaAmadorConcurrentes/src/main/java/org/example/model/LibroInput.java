package org.example.model;


public class LibroInput {
    private String titulo;
    private String autorId;
    private String categoriaId;
    private boolean disponibilidad;

    // Constructor vacío
    public LibroInput() {}

    // Constructor completo
    public LibroInput(String titulo, String autorId, String categoriaId, boolean disponibilidad) {
        this.titulo = titulo;
        this.autorId = autorId;
        this.categoriaId = categoriaId;
        this.disponibilidad = disponibilidad;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorId() {
        return autorId;
    }

    public void setAutorId(String autorId) {
        this.autorId = autorId;
    }

    public String getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(String categoriaId) {
        this.categoriaId = categoriaId;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}