package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
        //findAll() regresa un iterable, por lo que
        // debemos castear el valor a una lista de productos
    }

    public List<Producto> getByCategoria(int idCategoria){
        return  productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidadStock){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidadStock, true);
    }

}
