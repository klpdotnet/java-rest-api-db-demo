package com.crud.db_demo.rest_db_demo.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.db_demo.rest_db_demo.models.CloudVendor;
import com.crud.db_demo.rest_db_demo.repository.CloudVendorRepository;
import com.crud.db_demo.rest_db_demo.service.ICloudVendorService;

@Service
public class CloudVendorService implements ICloudVendorService {

	CloudVendorRepository cloudVendorRepository;
	public CloudVendorService(CloudVendorRepository cloudVendorRepository) 
	{	
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Created Successfully!";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Updated Successfully!";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Deleted Successfully!";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getCloudVendors() {
		return cloudVendorRepository.findAll();
	}

}
