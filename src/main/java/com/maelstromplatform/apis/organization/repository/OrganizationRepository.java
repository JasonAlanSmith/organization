package com.maelstromplatform.apis.organization.repository;

import com.maelstromplatform.apis.organization.entity.Organization;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The Organization repository.
 */
@Repository
public interface OrganizationRepository
    extends JpaRepository<Organization, UUID> {
  
}
