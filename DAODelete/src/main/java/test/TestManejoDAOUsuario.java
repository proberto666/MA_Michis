package test;

import datos.UsuarioDao;
import domain.Usuario;
import java.util.List;
import java.util.Scanner;

public class TestManejoDAOUsuario {
    public static void main(String[] args){

        UsuarioDao usuarioDao = new UsuarioDao();

    //INSERTAR
    Usuario usuarioNuevo = new Usuario("Yare", "1234");
    usuarioDao.insertar(usuarioNuevo);
    usuarioNuevo = new Usuario("Otra Yare", "1234");
    usuarioDao.insertar(usuarioNuevo);
    usuarioNuevo = new Usuario("Otra Yare 3", "1234");
    usuarioDao.insertar(usuarioNuevo);
    usuarioNuevo = new Usuario("Otra Yare 4", "1234");
    usuarioDao.insertar(usuarioNuevo);
    usuarioNuevo = new Usuario("Otra Yare 5", "1234");
    usuarioDao.insertar(usuarioNuevo);

    //ACTUAIZAR
    Usuario usuarioEditar = new Usuario(4,"Yareli","yare12");
    usuarioDao.actualizar(usuarioEditar);

    //ELIMINAR
    Usuario UsuarioEliminar = new Usuario(3);
        usuarioDao.delete(UsuarioEliminar);

        // CONSULTAR
        List<Usuario> usuarios= UsuarioDao.seleccionar();
        usuarios.forEach(usuario -> {
            System.out.println(usuario);
        });

    }
}