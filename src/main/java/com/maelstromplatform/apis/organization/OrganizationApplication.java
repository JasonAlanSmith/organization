package com.maelstromplatform.apis.organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Maelstrom Platform Organization Service API.
 */
@SpringBootApplication
public class OrganizationApplication {

  /**
   * The entry point to the Organization service API.
   *
   * @param args The arguments to the entry point.
   */
  public static void main(String[] args) {
    SpringApplication.run(
        OrganizationApplication.class, args);
  }
}
