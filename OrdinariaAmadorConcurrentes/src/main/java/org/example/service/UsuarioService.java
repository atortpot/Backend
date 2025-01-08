package org.example.service;


import org.example.domain.Usuario;
import org.example.model.UsuarioInput;
import org.example.repos.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    /**
     * Obtiene todos los usuarios del sistema.
     *
     * @return Lista de usuarios.
     */
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    /**
     * Obtiene un usuario por su ID.
     *
     * @param id Identificador del usuario.
     * @return Usuario encontrado.
     */
    public Usuario obtenerUsuarioPorId(String id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    /**
     * Agrega un nuevo usuario al sistema.
     *
     * @param usuarioInput Datos de entrada del usuario.
     * @return Usuario agregado.
     */
    public Usuario agregarUsuario(UsuarioInput usuarioInput) {
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioInput.getNombre());
        usuario.setCorreo(usuarioInput.getCorreo());
        return usuarioRepository.save(usuario);
    }

    /**
     * Edita un usuario existente en el sistema.
     *
     * @param id Identificador del usuario.
     * @param usuarioInput Nuevos datos del usuario.
     * @return Usuario actualizado.
     */
    public Usuario editarUsuario(String id, UsuarioInput usuarioInput) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            usuario.setNombre(usuarioInput.getNombre());
            usuario.setCorreo(usuarioInput.getCorreo());
            return usuarioRepository.save(usuario);
        }
        throw new RuntimeException("Usuario no encontrado");
    }

    /**
     * Elimina un usuario del sistema.
     *
     * @param id Identificador del usuario.
     * @return True si se elimina correctamente, False de lo contrario.
     */
    public boolean eliminarUsuario(String id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}