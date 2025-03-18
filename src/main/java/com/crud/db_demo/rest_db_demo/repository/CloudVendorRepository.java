package com.crud.db_demo.rest_db_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.db_demo.rest_db_demo.models.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
