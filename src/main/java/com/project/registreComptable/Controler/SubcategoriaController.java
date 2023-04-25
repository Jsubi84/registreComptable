package com.project.registreComptable.Controler;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.registreComptable.Model.Subcategoria;
import com.project.registreComptable.Service.SubcategoriaServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "*")
@RequestMapping({"/api/v1/subcategories"})
public class SubcategoriaController extends BaseControllerImpl<Subcategoria, SubcategoriaServiceImpl> {
}
