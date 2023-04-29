package com.project.registreComptable.Controler;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.registreComptable.Model.Registre;
import com.project.registreComptable.Service.RegistreServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "*")
@RequestMapping({"/api/v1/registres"})
public class RegistreController extends BaseControllerImpl<Registre, RegistreServiceImpl> {
}
