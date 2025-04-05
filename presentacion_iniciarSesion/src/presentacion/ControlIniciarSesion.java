/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

/**
 *
 * @author castrejon
 */

import controlSesion.IValidadorAcceso;
import controlSesion.ValidadorAccesos;
import dto.UsuarioDTO;

public class ControlIniciarSesion {
    private IValidadorAcceso validador;

    public ControlIniciarSesion() {
        validador = new ValidadorAccesos();
    }

    public boolean iniciarSesion(String usuario, String contrasena) {
        UsuarioDTO dto = new UsuarioDTO(usuario, contrasena);
        return validador.validarUsuario(dto);
    }
}
