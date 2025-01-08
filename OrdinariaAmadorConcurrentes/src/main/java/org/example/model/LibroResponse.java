package org.example.model;


public class LibroResponse {
    private String id;
    private String titulo;
    private String autorNombre;
    private String categoriaNombre;
    private boolean disponibilidad;

    // Constructor vacío
    public LibroResponse() {}

    // Constructor completo
    public LibroResponse(String id, String titulo, String autorNombre, String categoriaNombre, boolean disponibilidad) {
        this.id = id;
        this.titulo = titulo;
        this.autorNombre = autorNombre;
        this.categoriaNombre = categoriaNombre;
        this.disponibilidad = disponibilidad;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorNombre() {
        return autorNombre;
    }

    public void setAutorNombre(String autorNombre) {
        this.autorNombre = autorNombre;
    }

    public String getCategoriaNombre() {
        return categoriaNombre;
    }

    public void setCategoriaNombre(String categoriaNombre) {
        this.categoriaNombre = categoriaNombre;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
