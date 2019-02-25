package org.jhipster.health.repository;

import org.jhipster.health.domain.MyUser;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the MyUser entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Long> {

}
