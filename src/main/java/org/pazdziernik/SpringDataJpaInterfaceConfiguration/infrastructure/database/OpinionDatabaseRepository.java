package org.pazdziernik.SpringDataJpaInterfaceConfiguration.infrastructure.database;

import org.pazdziernik.SpringDataJpaInterfaceConfiguration.business.OpinionDAO;
import org.pazdziernik.SpringDataJpaInterfaceConfiguration.infrastructure.database.entity.OpinionEntity;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class OpinionDatabaseRepository implements OpinionDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public OpinionEntity getOpinion(final Integer opinionId) {
        return entityManager.find(OpinionEntity.class, opinionId);
    }

    @Override
    public void saveOpinion(final OpinionEntity opinionEntity) {
        entityManager.persist(opinionEntity);
    }

    @Override
    public void deleteOpinion(final Integer opinionId) {
        entityManager.remove(entityManager.find(OpinionEntity.class, opinionId));
    }
}
