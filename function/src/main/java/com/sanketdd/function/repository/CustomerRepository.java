package com.sanketdd.function.repository;

import com.sanketdd.function.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    @Query(value = "select get_customer_count()", nativeQuery = true)
    public Long fetchCutomer();



    /*
    CREATE  FUNCTION get_customer_count() RETURNS INT
READS SQL DATA
BEGIN
    DECLARE count_of_customers INT;
    SELECT COUNT(*) INTO count_of_customers FROM customer;
    RETURN count_of_customers;
END;
     */
}
