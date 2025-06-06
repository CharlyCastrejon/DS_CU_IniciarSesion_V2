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
    private GestorSesion gestor = new GestorSesion(); // stateless

    @Override
    public boolean validarUsuario(UsuarioDTO usuario) {
        return gestor.validarCredenciales(usuario);
    }
}