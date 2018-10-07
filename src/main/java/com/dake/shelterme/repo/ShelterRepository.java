package com.dake.shelterme.repo;

import com.dake.shelterme.data.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShelterRepository extends JpaRepository<Shelter, String> {
}
