package org.example.model;


import java.time.LocalDate;

public class PrestamoResponse {
    private String id;
    private String usuarioNombre;
    private String libroTitulo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    // Constructor vacío
    public PrestamoResponse() {}

    // Constructor completo
    public PrestamoResponse(String id, String usuarioNombre, String libroTitulo, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.id = id;
        this.usuarioNombre = usuarioNombre;
        this.libroTitulo = libroTitulo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getLibroTitulo() {
        return libroTitulo;
    }

    public void setLibroTitulo(String libroTitulo) {
        this.libroTitulo = libroTitulo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
