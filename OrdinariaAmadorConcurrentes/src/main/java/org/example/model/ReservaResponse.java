package org.example.model;


import java.time.LocalDate;

public class ReservaResponse {
    private String id;
    private String usuarioNombre;
    private String libroTitulo;
    private LocalDate fechaReserva;
    private String estado;

    // Constructor vacío
    public ReservaResponse() {}

    // Constructor completo
    public ReservaResponse(String id, String usuarioNombre, String libroTitulo, LocalDate fechaReserva, String estado) {
        this.id = id;
        this.usuarioNombre = usuarioNombre;
        this.libroTitulo = libroTitulo;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
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

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}