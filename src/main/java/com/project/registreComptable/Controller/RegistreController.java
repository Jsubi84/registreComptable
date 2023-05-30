package com.project.registreComptable.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.registreComptable.Model.Registre;
import com.project.registreComptable.Service.RegistreServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "*")
@RequestMapping({"/api/v1/registres"})
public class RegistreController extends BaseControllerImpl<Registre, RegistreServiceImpl> {
	
	@GetMapping("/getBySubcat")
	public ResponseEntity<?> getRegistreBySubcategoriaId(@RequestParam Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(service.getRegistreBySubcategoriaId(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\""+ e.getMessage()+"\"}");
		}
	}	
	
	@GetMapping("/getByCat")
	public ResponseEntity<?> getRegistreByCategoria(@RequestParam Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(service.getRegistreByCategoria(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\""+ e.getMessage()+"\"}");
		}
	}
	
	@GetMapping("/getTipusReg")
	public ResponseEntity<?> getTipusRegistre(@RequestParam Boolean tipus){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(service.getTipusRegistre(tipus));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\""+ e.getMessage()+"\"}");
		}
	}
	
	@GetMapping("/getSumaByTipus")
	public ResponseEntity<?> getSumaByTipus(@RequestParam Boolean tipus, @RequestParam int year){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(service.getSumaByTipus(tipus, year));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\""+ e.getMessage()+"\"}");
		}
	}
	
}
