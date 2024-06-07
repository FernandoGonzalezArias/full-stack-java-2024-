package com.alkewallet.controllers;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alkewallet.dto.CuentaDTO;
import com.alkewallet.model.Cuenta;
import com.alkewallet.services.CuentaServices;

@Controller
@RequestMapping("/cuenta")
public class CuentaController {
	
	@Autowired
	private CuentaServices cuentaService;
	
	
	@GetMapping
	public String verCuenta(Model model) {
		CuentaDTO cuentaDTO = cuentaService.getCuenta();
		model.addAttribute("vistaCuenta",cuentaDTO);
		return "cuentaTemplate"; // el nombre del html que se va a abrir
	}
	
	@PostMapping("/depositar")
	public String depositar(@RequestParam Double montoDepositar, Model model) {
		CuentaDTO cuenta =  cuentaService.depositar(montoDepositar);
		model.addAttribute("vistaCuenta",cuenta);
		return "cuentaTemplate";
	}
	
	@PostMapping("/retirar")
	public String retirar(@RequestParam Double montoRetiro, Model model) {
		CuentaDTO cuenta = cuentaService.retirar(montoRetiro);
		model.addAttribute("vistaCuenta",cuenta);
		return "cuentaTemplate";
	}

}
