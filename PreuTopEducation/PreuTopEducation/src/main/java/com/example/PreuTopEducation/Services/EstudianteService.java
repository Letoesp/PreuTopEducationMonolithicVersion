package com.example.PreuTopEducation.Services;

import com.example.PreuTopEducation.Entities.Estudiante;
import com.example.PreuTopEducation.Repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    private final EstudianteRepository estudianteRepository;
    @Autowired
    public EstudianteService(EstudianteRepository estudianteRepository){
        this.estudianteRepository = estudianteRepository;
    }
    public List<Estudiante> getEstudiantes(){
        return this.estudianteRepository.findAll();
    }
    public Estudiante registrarEstudiante(Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }

    public Estudiante actualizarEstudiante(Estudiante estudiante){
        return estudianteRepository.save(estudiante);

    }
    public Estudiante obtenerEstudianteporId(Long id){
        return estudianteRepository.findById(id).get();

    }

    public void eliminarEstudiante(Long id){
        estudianteRepository.deleteById(id);

    }
    public List<Estudiante> getEstudianteporTipopago(String tipopago) {
        return estudianteRepository.findEstudiantesByTipopago(tipopago);
    }









}
