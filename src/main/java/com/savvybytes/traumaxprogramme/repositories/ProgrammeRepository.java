package com.savvybytes.traumaxprogramme.repositories;

import com.savvybytes.traumaxprogramme.models.Programme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ProgrammeRepository extends JpaRepository<Programme, Integer> {
}
