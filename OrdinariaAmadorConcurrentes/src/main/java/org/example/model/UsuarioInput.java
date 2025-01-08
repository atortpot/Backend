package org.example.model;


public class UsuarioInput {
    private String nombre;
    private String correo;

    // Constructor vacío
    public UsuarioInput() {}

    // Constructor completo
    public UsuarioInput(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
