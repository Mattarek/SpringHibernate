package org.pazdziernik.SpringDataJpaInterfaceConfiguration.business;

import org.pazdziernik.SpringDataJpaInterfaceConfiguration.infrastructure.database.entity.PurchaseEntity;

public interface PurchaseDAO {

    PurchaseEntity getPurchase(final Integer purchaseId);

    void savePurchase(final PurchaseEntity purchaseEntity);

    void deletePurchase(final Integer purchaseId);
}
