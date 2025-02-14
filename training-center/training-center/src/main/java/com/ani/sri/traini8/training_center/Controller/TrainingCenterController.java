package com.ani.sri.traini8.training_center.Controller;

import com.ani.sri.traini8.training_center.Model.TrainingCenter;
import com.ani.sri.traini8.training_center.Service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    private final TrainingCenterService service;

    public TrainingCenterController(TrainingCenterService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addTrainingCenter(@Valid @RequestBody TrainingCenter center) {
       //center.setCreatedOn(System.currentTimeMillis());
        service.addTrainingCenter(center);
        return ResponseEntity.ok("Training Center added successfully!");
    }

    @GetMapping("/all")
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        return ResponseEntity.ok(service.getAllTrainingCenters());
    }
}