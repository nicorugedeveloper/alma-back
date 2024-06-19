package com.alma.alma.service.imp.EstudiantesImp;

import com.alma.alma.entity.Estudiante;
import com.alma.alma.repository.EstudianteRepository;
import com.alma.alma.service.EstudianteInterface.EstudianteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class EstudianteServiceImp implements EstudianteService {
    private final EstudianteRepository estudianteRepository;
    @Override
    public Estudiante save(Estudiante estudiante) {

        return estudianteRepository.save(estudiante);
    }
    @Override
    public List<Estudiante> findAll() {

        return estudianteRepository.findAll();
    }
    @Override
    public Optional<Estudiante> findById(Integer id) {
        return estudianteRepository.findById(id);
    }
    @Override
    public Estudiante update(Integer id, Estudiante estudiante) {
        Optional<Estudiante> existingEstudiante = estudianteRepository.findById(id);
        if (existingEstudiante.isPresent()) {
            Estudiante updatedEstudiante = existingEstudiante.get();
            updatedEstudiante.setPrimer_nombre(estudiante.getPrimer_nombre());
            updatedEstudiante.setSegundo_nombre(estudiante.getSegundo_nombre());
            updatedEstudiante.setPrimer_apellido(estudiante.getPrimer_apellido());
            updatedEstudiante.setSegundo_apellido(estudiante.getSegundo_apellido());
            updatedEstudiante.setDireccion(estudiante.getDireccion());
            updatedEstudiante.setCedula(estudiante.getCedula());
            updatedEstudiante.setEmail(estudiante.getEmail());
            updatedEstudiante.setTelefono(estudiante.getTelefono());
            return estudianteRepository.save(updatedEstudiante);
        }
        return null;
    }
    @Override
    public void deleteById(Integer id) {
        estudianteRepository.deleteById(id);
    }
}
