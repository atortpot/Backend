package org.example.model;


import java.time.LocalDate;

public class PrestamoInput {
    private String usuarioId;
    private String libroId;
    private LocalDate fechaPrestamo;

    // Constructor vacío
    public PrestamoInput() {}

    // Constructor completo
    public PrestamoInput(String usuarioId, String libroId, LocalDate fechaPrestamo) {
        this.usuarioId = usuarioId;
        this.libroId = libroId;
        this.fechaPrestamo = fechaPrestamo;
    }

    // Getters y Setters
    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getLibroId() {
        return libroId;
    }

    public void setLibroId(String libroId) {
        this.libroId = libroId;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
}