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
import objetosnegocio.UsuarioON;

class GestorSesion {
    public boolean validarCredenciales(UsuarioDTO dto) {
        return UsuarioON.getInstance().validar(dto);
    }
}