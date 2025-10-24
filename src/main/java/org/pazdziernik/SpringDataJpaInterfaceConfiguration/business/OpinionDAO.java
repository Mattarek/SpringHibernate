package org.pazdziernik.SpringDataJpaInterfaceConfiguration.business;

import org.pazdziernik.SpringDataJpaInterfaceConfiguration.infrastructure.database.entity.OpinionEntity;

public interface OpinionDAO {

    OpinionEntity getOpinion(final Integer opinionId);

    void saveOpinion(final OpinionEntity opinionEntity);

    void deleteOpinion(final Integer opinionId);
}
