package com.crud.db_demo.rest_db_demo.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.db_demo.rest_db_demo.models.CloudVendor;
import com.crud.db_demo.rest_db_demo.response.ResponseHandler;
import com.crud.db_demo.rest_db_demo.service.ICloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	ICloudVendorService cloudVendorService;
	
	public CloudVendorController(ICloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}

	@GetMapping("{vendorId}")
	public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId) 
	{
		return ResponseHandler.responseBuilder("Requested vendor details fetch successfully!", HttpStatus.OK, cloudVendorService.getCloudVendor(vendorId));
	}
	
	@GetMapping()
	public List<CloudVendor> getCloudVendors() 
	{
		return cloudVendorService.getCloudVendors();
	}
	
	@PostMapping
	public String createCloudVendor(@RequestBody CloudVendor cloudVendor) 
	{
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud vendor created successfully!";
	}
	
	@PutMapping
	public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) 
	{
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "Cloud vendor updated successfully!";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) 
	{
		cloudVendorService.deleteCloudVendor(vendorId);
		return "Cloud vendor deleted successfully!";
	}
}
