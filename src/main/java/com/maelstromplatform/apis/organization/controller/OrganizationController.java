package com.maelstromplatform.apis.organization.controller;

import com.maelstromplatform.apis.organization.entity.Organization;
import com.maelstromplatform.apis.organization.service.OrganizationService;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Organization controller.
 */
@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

  private OrganizationService organizationService;

  /**
   * The OrganizationController constructor.
   *
   * @param organizationService An Organization Service.
   */
  public OrganizationController(
      OrganizationService organizationService) {
    this.organizationService = organizationService;
  }

  /**
   * Get all of the Organizations.
   *
   * @return Return a list of all of the Organizations.
   */
  @GetMapping
  public List<Organization> getAllOrganizations() {
    return organizationService.getAllOrganizations();
  }

  /**
   * Get an Organization by its Id.
   *
   * @param id The Id of the Organization to get.
   * @return Return the Organization matching the Id.
   */
  @GetMapping("/{id}")
  public Organization getOrganizationById(@PathVariable UUID id) {
    return organizationService.getOrganizationById(id);
  }

  /**
   * Create an Organization.
   *
   * @param organization The Organization to create.
   * @return Return the created Organization.
   */
  @PostMapping
  public Organization createOrganization(
      @RequestBody Organization organization) {
    return organizationService.createOrganization(organization);
  }

  /**
   * Update an Organization.
   *
   * @param id The Id of the Organization to update.
   * @param organizationDetails The modified Organization details.
   * @return Return the updated Organization.
   */
  @PutMapping("/{id}")
  public Organization updateOrganization(
      @PathVariable UUID id,
      @RequestBody Organization organizationDetails) {
    return organizationService.updateOrganization(
      id, organizationDetails);
  }

  /**
   * Delete an Organization.
   *
   * @param id The Id of the Organization to delete.
   */
  @DeleteMapping("/{id}")
  public void deleteOrganization(@PathVariable UUID id) {
    organizationService.deleteOrganization(id);
  }
}
