package org.example.model;


import java.time.LocalDate;

public class ReservaInput {
    private String usuarioId;
    private String libroId;
    private LocalDate fechaReserva;

    // Constructor vacío
    public ReservaInput() {}

    // Constructor completo
    public ReservaInput(String usuarioId, String libroId, LocalDate fechaReserva) {
        this.usuarioId = usuarioId;
        this.libroId = libroId;
        this.fechaReserva = fechaReserva;
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

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}
