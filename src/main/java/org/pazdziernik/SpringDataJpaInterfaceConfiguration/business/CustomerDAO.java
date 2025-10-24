package org.pazdziernik.SpringDataJpaInterfaceConfiguration.business;

import org.pazdziernik.SpringDataJpaInterfaceConfiguration.infrastructure.database.entity.CustomerEntity;

public interface CustomerDAO {

    CustomerEntity getCustomer(final Integer customerId);

    void saveCustomer(final CustomerEntity customerEntity);

    void deleteCustomer(final Integer customerId);
}
