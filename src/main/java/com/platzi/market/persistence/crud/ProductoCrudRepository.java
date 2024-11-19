package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

// CrudRepository recibe dos parametros:
// 1.- La clase a la que vamos a controlar. 2.- el tipo de la clave primaria de la clase a controlar
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

}
