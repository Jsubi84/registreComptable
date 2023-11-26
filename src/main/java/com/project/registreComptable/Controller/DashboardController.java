package com.project.registreComptable.Controller;

import java.sql.Date;

import org.springframework.data.web.JsonPath;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.registreComptable.Model.Registre;
import com.project.registreComptable.Model.registreFilter;
import com.project.registreComptable.Service.RegistreServiceImpl;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*")
@RequestMapping({"/api/v1/dashboard"})
public class DashboardController extends BaseControllerImpl<Registre, RegistreServiceImpl> {
	
	@GetMapping("/getResumAny")
	public ResponseEntity<?> getResumAny(@RequestParam int year){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(service.getResumAny( year));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\""+ e.getMessage()+"\"}");
		}
	}
	
	@GetMapping("/getTotalSubcatByYear")
	public ResponseEntity<?> getTotalSubcatByYear(@RequestParam Long idSubcat, @RequestParam int year){
		try {		
			return ResponseEntity.status(HttpStatus.OK).body(service.getTotalSubcatByYear(idSubcat, year));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\""+ e.getMessage()+"\"}");
		}
	}
	
	@GetMapping("/getTotalCatByYear")
	public ResponseEntity<?> getTotalCatByYear(@RequestParam Long idCat, @RequestParam int year){
		try {		
			return ResponseEntity.status(HttpStatus.OK).body(service.getTotalCatByYear(idCat, year));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\""+ e.getMessage()+"\"}");
		}
	}
	
	@GetMapping("/getCatByYearMonth")
	public ResponseEntity<?> getCatByYearMonth( @RequestParam Long idCat, @RequestParam int year, @RequestParam int month){
		try {		
			return ResponseEntity.status(HttpStatus.OK).body(service.getCatByYearMonth(idCat, year, month));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\""+ e.getMessage()+"\"}");
		}
	}
	
	@GetMapping("/getSubcatByYearMonth")
	public ResponseEntity<?> getSubcatByYearMonth( @RequestParam Long idSubcat, @RequestParam int year, @RequestParam int month){
		try {		
			return ResponseEntity.status(HttpStatus.OK).body(service.getSubcatByYearMonth(idSubcat, year, month));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\""+ e.getMessage()+"\"}");
		}
	}
		
}
