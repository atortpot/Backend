package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal que inicializa la aplicación Spring Boot.
 */
@SpringBootApplication
public class Main {

    /**
     * Método principal que inicia la ejecución del proyecto.
     *
     * @param args Argumentos pasados por la línea de comandos.
     */
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("🎉 Biblioteca en línea iniciada exitosamente. Servidor disponible en http://localhost:8080/graphql");
    }
}