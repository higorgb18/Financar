package com.iff.dev_web.repository;

import com.iff.dev_web.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT c FROM Cliente c")
    List<Usuario> buscarTodosClientes();

    @Query("SELECT f FROM Funcionario f")
    List<Usuario> buscarTodosFuncionarios();

}