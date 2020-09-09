package com.savvybytes.traumaxprogramme.services;

import com.savvybytes.traumaxprogramme.models.Programme;
import com.savvybytes.traumaxprogramme.repositories.ProgrammeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammeService {
    @Autowired
    private ProgrammeRepository programmeRepository;

    public Programme createProgramme(Programme programme){
        return programmeRepository.save(programme);
    }
    public List<Programme> fetchProgrammes(){
        return programmeRepository.findAll();
    }
    public Programme fetchProgramme(int id){
        return programmeRepository.findById(id).orElse(null);
    }
}
