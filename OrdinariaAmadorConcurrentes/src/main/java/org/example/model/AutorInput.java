package org.example.model;


public class AutorInput {
    private String nombre;

    // Constructor vacío
    public AutorInput() {}

    // Constructor completo
    public AutorInput(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
