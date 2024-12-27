package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            //source = "atributo de la entidad", target = "atributo del dominio"
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "estado",target = "active")
    })
    Category toCategory(Categoria categoria);


    //ESTA ANOTACIÓN VA HACER EL INVERSO DE LA FUNCIÓN "TOCATEGORY"
    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategory(Category category);


}
