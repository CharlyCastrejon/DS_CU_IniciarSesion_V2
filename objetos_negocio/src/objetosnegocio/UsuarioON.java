/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosnegocio;

/**
 *
 * @author castrejon
 */
import dto.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;

public class UsuarioON {
    private static UsuarioON instancia;
    private List<UsuarioDTO> usuarios;

    private UsuarioON() {
        usuarios = new ArrayList<>();
        // Datos simulados
        usuarios.add(new UsuarioDTO("admin", "1234"));
        usuarios.add(new UsuarioDTO("maria", "abcd"));
    }

    public static synchronized UsuarioON getInstance() {
        if (instancia == null) {
            instancia = new UsuarioON();
        }
        return instancia;
    }

    public synchronized void agregarUsuario(UsuarioDTO usuario) {
        usuarios.add(usuario);
    }

    public synchronized List<UsuarioDTO> obtenerUsuarios() {
        return usuarios;
    }

    public synchronized boolean validar(UsuarioDTO dto) {
        return usuarios.stream().anyMatch(u ->
            u.getUsuario().equals(dto.getUsuario()) &&
            u.getContrasena().equals(dto.getContrasena())
        );
    }
}

