package com.ani.sri.traini8.training_center.Service;

import com.ani.sri.traini8.training_center.Model.TrainingCenter;
import com.ani.sri.traini8.training_center.Repository.TrainingCenterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterService {

    private final TrainingCenterRepository repository;

    public TrainingCenterService(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    public void addTrainingCenter(TrainingCenter trainingCenter) {
        //System.out.println("Received Training Center: " + trainingCenter);
        //trainingCenter.setCreatedOn();
//        if (trainingCenter.getstudentCapacity() == 0) {
//            trainingCenter.setstudentCapacity(100); // Default capacity
//        }
         repository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}