package com.glucip.apiCheckPoint4.controllers;

import com.glucip.apiCheckPoint4.model.Glucip;
import com.glucip.apiCheckPoint4.respositories.GlucipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class glucipController {
    @Autowired
    private GlucipRepository GlucipRepository;

    @GetMapping("/activity")
    public List<GlucipRepository> getAllPosts() {
        return GlucipRepository.findAll();
    }

    @GetMapping("/glucip/{id}")
    public ResponseEntity<Glucip> getglucipById(@PathVariable(value = "id") Long glucipId) throws ResourceNotFoundException {
        GlucipRepository Glucip = GlucipRepository.findById(GlucipId)
                .orElseThrow(() -> new ResourceNotFoundException("glucip not found for this id :: " + GlucipId));
        return ResponseEntity.ok().body(Glucip);
    }

    @PostMapping("/glucip")
    public Glucip createglucip(@Validated @RequestBody Glucip glucip) {
        return GlucipRepository.save(glucip);
    }

    @PutMapping("/glucips/{id}")
    public ResponseEntity<Glucip> updateGlucip(@PathVariable(value = "id") Long glucipId,
                                               @Validated @RequestBody Glucip glucipDetails) throws ResourceNotFoundException {
        Glucip glucip = GlucipRepository.findById(glucipId)
                .orElseThrow(() -> new ResourceNotFoundException("glucip not found for this id :: " + glucipId));

        glucip.setName(glucipDetails.getName());
        glucip.setCategory(glucipDetails.getCategory());
        glucip.setDescription(glucipDetails.getDescription());
        glucip.setUrl(glucipDetails.getUrl());
        final Glucip updatedActivity = GlucipRepository.save(glucip);
        return ResponseEntity.ok(updatedActivity);
    }

    @DeleteMapping("/glucip/{id}")
    public Map<String, Boolean> deleteGlucip(@PathVariable(value = "id") Long GlucipId) throws ResourceNotFoundException {
        Glucip blocky = GlucipRepository.findById(GlucipId)
                .orElseThrow(() -> new ResourceNotFoundException("Glucip not found for this id :: " + GlucipId));

        GlucipRepository.delete(blocky);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}

}
