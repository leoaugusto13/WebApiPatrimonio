package com.navita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navita.models.*;
import com.navita.repository.*;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@PostMapping("/usuario")
	public Usuario registraUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}