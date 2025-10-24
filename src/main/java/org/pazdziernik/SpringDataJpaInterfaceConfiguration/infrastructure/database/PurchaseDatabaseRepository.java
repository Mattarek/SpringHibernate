package org.pazdziernik.SpringDataJpaInterfaceConfiguration.infrastructure.database;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.pazdziernik.SpringDataJpaInterfaceConfiguration.business.PurchaseDAO;
import org.pazdziernik.SpringDataJpaInterfaceConfiguration.infrastructure.database.entity.PurchaseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PurchaseDatabaseRepository implements PurchaseDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public PurchaseEntity getPurchase(final Integer purchaseId) {
        return entityManager.find(PurchaseEntity.class, purchaseId);
    }

    @Override
    public void savePurchase(final PurchaseEntity purchaseEntity) {
        entityManager.persist(purchaseEntity);
    }

    @Override
    public void deletePurchase(final Integer purchaseId) {
        entityManager.remove(entityManager.find(PurchaseEntity.class, purchaseId));
    }
}
