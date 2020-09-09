package com.savvybytes.traumaxprogramme.controllers;

import com.savvybytes.traumaxprogramme.models.Programme;
import com.savvybytes.traumaxprogramme.services.ProgrammeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ProgrammeController {
    @Autowired
    private ProgrammeService programmeService;

    @PostMapping("add-programme")
    public Programme addProgramme(@RequestBody Programme programme){
        return programmeService.createProgramme(programme);
    }
    @GetMapping("fetch-all-programmes")
    public List<Programme> getProgrammes(){
        return programmeService.fetchProgrammes();
    }
    @GetMapping("fetch-a-programme/{id}")
    public Programme getProgramme(@PathVariable("id") int id){
        return programmeService.fetchProgramme(id);
    }
}
