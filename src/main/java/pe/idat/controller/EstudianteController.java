package pe.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.idat.model.Estudiante;
import pe.idat.service.EstudianteService;

@RestController
@RequestMapping("estudiante/sem9")
public class EstudianteController {
	
	@Autowired
	private EstudianteService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Estudiante>> listar(){
		return new ResponseEntity<List<Estudiante>>(service.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar" , method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Estudiante estudiante){
		service.guardar(estudiante);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method =  RequestMethod.GET)
	public ResponseEntity<Estudiante> obtenerPorId(@PathVariable Integer id){
		Estudiante estudiante = service.obtener(id);
		if (estudiante !=null) {
			return new ResponseEntity<Estudiante>(estudiante, HttpStatus.OK);
		}else {
			return new ResponseEntity<Estudiante>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Estudiante estudiante){
		Estudiante p =service.obtener(estudiante.getIdEstudiante());
		if(p !=null) {
			service.actualizar(estudiante);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/eliminar/{id}" , method = RequestMethod.DELETE)
	public ResponseEntity<Void>eliminar(@PathVariable Integer id){
		Estudiante estudiante = service.obtener(id);
		if(estudiante !=null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
			
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
}
