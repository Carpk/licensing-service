package com.thekleinbottle.licensing_service.service;

import java.util.Random;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.thekleinbottle.licensing_service.model.License;

@Service
public class LicenseService {

  public License getLicense(String licenseId, String organizationId) {
    License license = new License();
    license.setId(new Random().nextInt(1000));
    license.setLicenseId(licenseId);
    license.setOrganizationId(organizationId);
    license.setDescription("Software Product");
    license.setProductName("Ostock");
    license.setLicenseType("full");
    
    return license;
  }

  public String createLicense(License license, String organizationId) {
    String responseMessage = null;
    if (license != null) {
      license.setOrganizationId(organizationId);
      responseMessage = String.format("This is the post and the object is: %s", license.toString());
    }

    return responseMessage;
  }

  public String updateLicense(License license, String organizationId) {
    String responseMessage = null;
    if (license != null) {
      license.setOrganizationId(organizationId);
      responseMessage = String.format("This is the put and the object is: %s", license.toString());
    }

    return responseMessage;
  }

  public String deleteLicense(String licenseId, String organizationId) {
    String responseMessage = null;
    responseMessage = String.format("Deleting license with id %s for the organization %s", licenseId, organizationId);

    return responseMessage;
  }
}
