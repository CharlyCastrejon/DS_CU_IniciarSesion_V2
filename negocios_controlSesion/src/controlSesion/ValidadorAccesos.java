/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlSesion;

/**
 *
 * @author castrejon
 */

import dto.UsuarioDTO;

public class ValidadorAccesos implements IValidadorAcceso {
    @Override
    public boolean validarUsuario(UsuarioDTO usuario) {
        // Simula usuario válido: carlos / 1234
        return "carlos".equals(usuario.getUsuario()) && "1234".equals(usuario.getContrasena());
    }
}
