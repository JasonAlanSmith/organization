package com.maelstromplatform.apis.organization.service;

import com.maelstromplatform.apis.organization.entity.Organization;
import com.maelstromplatform.apis.organization.repository.OrganizationRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

/**
 * The Organization Service.
 */
@Service
public class OrganizationService {

  private OrganizationRepository organizationRepository;

  /**
   * The Organization Service constructor.
   *
   * @param organizationRepository An Organization Repository.
   */
  public OrganizationService(
      OrganizationRepository organizationRepository) {
    this.organizationRepository = organizationRepository;
  }

  /**
   * Get all of the Organizations.
   *
   * @return Return a list of all of the Organizations.
   */
  public List<Organization> getAllOrganizations() {
    return organizationRepository.findAll();
  }

  /**
   * Get an Organization by its Id.
   *
   * @param id The Organization's Id.
   * @return Return the Organization matching the given Id.
   */
  public Organization getOrganizationById(UUID id) {
    return organizationRepository.findById(id)
        .orElseThrow(
          () -> new RuntimeException("Organization not found"));
  }
  
  /**
   * Create an Organization.
   *
   * @param organization The Organization to create.
   * @return Return the created Organization.
   */
  public Organization createOrganization(Organization organization) {
    return organizationRepository.save(organization);
  }

  /**
   * Update an Organization.
   *
   * @param id The Id of the Organization to update.
   * @param organizationDetails The modified details of the
   *                            Organization.
   * @return Return the updated Organization.
   */
  public Organization updateOrganization(
      UUID id,
      Organization organizationDetails) {
    Organization organization = getOrganizationById(id);
    // Map the fields.
    return organizationRepository.save(organization);
  }

  /**
   * Delete an Organization.
   *
   * @param id The Id of the Organization to delete.
   */
  public void deleteOrganization(UUID id) {
    organizationRepository.deleteById(id);
  }
}
