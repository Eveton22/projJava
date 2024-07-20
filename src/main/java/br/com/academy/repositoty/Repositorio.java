package br.com.academy.repositoty;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.academy.models.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {
    

}
