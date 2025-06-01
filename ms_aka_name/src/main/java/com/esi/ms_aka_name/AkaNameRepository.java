package com.esi.ms_aka_name;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AkaNameRepository extends JpaRepository<AkaName, Integer> {
    // Add custom queries if needed
}
