package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {

    //ESTO ES UN QUERY METHOD, YA QUE NOS OFRECEN UNA MEJOR FLEXIBILIDAD
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    //PODEMOS HACERLO CON UN anotacion @QUERY
    // --> @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    // --> List<Producto> findByIdCategory(int idCategory);

}
