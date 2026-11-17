
package com.example.touristmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.touristmanagement.entity.Tourist;

@Repository
public interface TouristRepository
        extends JpaRepository<Tourist, Long> {

}
