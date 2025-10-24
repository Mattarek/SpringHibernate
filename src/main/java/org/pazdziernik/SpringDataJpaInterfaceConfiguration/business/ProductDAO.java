package org.pazdziernik.SpringDataJpaInterfaceConfiguration.business;

import org.pazdziernik.SpringDataJpaInterfaceConfiguration.infrastructure.database.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity getProduct(final Integer productId);

    void saveProduct(final ProductEntity productEntity);

    void deleteProduct(final Integer productId);
}
