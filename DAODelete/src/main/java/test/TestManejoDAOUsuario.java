package test;

import datos.UsuarioDao;
import domain.Usuario;
import java.util.List;
import java.util.Scanner;

public class TestManejoDAOUsuario {
    public static void main(String[] args){

        UsuarioDao usuarioDao = new UsuarioDao();

         // CONSULTAR
        List<Usuario> usuarios= UsuarioDao.seleccionar();
        usuarios.forEach(usuario -> {
            System.out.println(usuario);
        });
        //INSERTAR
        Usuario usuarioNuevo = new Usuario("Victor", "1234");
        usuarioDao.insertar(usuarioNuevo);
        usuarioNuevo = new Usuario("Mariela", "1234");
        usuarioDao.insertar(usuarioNuevo);
        //ACTUAIZAR
        Usuario usuarioEditar = new Usuario(5,"Yareli","yare12");
        usuarioDao.actualizar(usuarioEditar);
        //ELIMINAR
        Usuario UsuarioEliminar = new Usuario(6);
            usuarioDao.delete(UsuarioEliminar);
        // CONSULTAR
        usuarios= UsuarioDao.seleccionar();
        usuarios.forEach(usuario -> {
            System.out.println(usuario);
        });

    }
}