package com.bootcoding.patient.controller;

import com.bootcoding.patient.model.Patient;
import com.bootcoding.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/patient/")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("name")
    public List<Patient> getPatient(){
        return patientService.getPatient();
    }
    @GetMapping(name/{id})
    public Patient getPatientById(@RequestBody int id){
        return patientService.getPatientById(id);
    }
    @PostMapping("register")
    public boolean registerPatient(@RequestBody Patient patients){
        boolean isRegister = patientService.registerNewPatient(patients);
        return isRegister;
    }
    @PostMapping("register/new")
    public boolean registerPatient(@RequestBody List<Patient> patients){
        boolean isRegister = patientService.registerNewPatient(patients);
        return isRegister;
    }

}
