package org.pazdziernik.SpringDataJpaInterfaceConfiguration.infrastructure.database;

import org.pazdziernik.SpringDataJpaInterfaceConfiguration.business.ProductDAO;
import org.pazdziernik.SpringDataJpaInterfaceConfiguration.infrastructure.database.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class ProductDatabaseRepository implements ProductDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ProductEntity getProduct(final Integer productId) {
        return entityManager.find(ProductEntity.class, productId);
    }

    @Override
    public void saveProduct(final ProductEntity productEntity) {
        entityManager.persist(productEntity);
    }

    @Override
    public void deleteProduct(final Integer productId) {
        entityManager.remove(entityManager.find(ProductEntity.class, productId));
    }
}
