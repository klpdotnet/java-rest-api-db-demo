package com.crud.db_demo.rest_db_demo.service;

import java.util.List;
import com.crud.db_demo.rest_db_demo.models.CloudVendor;

public interface ICloudVendorService {
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String cloudVendorId);
	public CloudVendor getCloudVendor(String cloudVendorId);
	public List<CloudVendor> getCloudVendors();
}
