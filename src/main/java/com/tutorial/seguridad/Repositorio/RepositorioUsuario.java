package com.tutorial.seguridad.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.tutorial.seguridad.Modelos.Usuario;
public interface RepositorioUsuario extends
MongoRepository<Usuario,String>{
}