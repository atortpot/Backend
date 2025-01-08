package org.example.service;


import org.example.domain.Prestamo;
import org.example.model.PrestamoInput;
import org.example.repos.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    public Prestamo obtenerPrestamoPorId(String id) {
        return prestamoRepository.findById(id).orElseThrow(() -> new RuntimeException("Préstamo no encontrado"));
    }

    public Prestamo crearPrestamo(PrestamoInput prestamoInput) {
        Prestamo prestamo = new Prestamo();
        prestamo.setUsuarioId(prestamoInput.getUsuarioId());
        prestamo.setLibroId(prestamoInput.getLibroId());
        prestamo.setFechaPrestamo(prestamoInput.getFechaPrestamo());
        return prestamoRepository.save(prestamo);
    }

    public boolean finalizarPrestamo(String id) {
        if (prestamoRepository.existsById(id)) {
            prestamoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}