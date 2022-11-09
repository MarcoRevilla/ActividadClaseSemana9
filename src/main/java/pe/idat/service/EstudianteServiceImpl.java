package pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.model.Estudiante;
import pe.idat.repository.EstudianteRepository;
@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	private EstudianteRepository repositorio;
	
	@Override
	public void guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		repositorio.save(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<Estudiante> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Estudiante obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
