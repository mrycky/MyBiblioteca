/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import modelos.Libros;
import modelos.Prestamo;
import modelos.usuarios;

/**
 *
 * @author Usuario
 */
public interface DAOPrestamos {
    public void registrar (Prestamo user) throws Exception;
    public void modificar (Prestamo user) throws Exception;
    //public void eliminar (Prestamo user) throws Exception;
    public Prestamo getLending(usuarios user, Libros book) throws Exception;
    public List<Prestamo> listar() throws Exception;
}
