package com.alurachallenge.foro_hub.controller;

import com.alurachallenge.foro_hub.infra.jwt.JwtUtil;
import com.alurachallenge.foro_hub.login.LoginRequest;
import com.alurachallenge.foro_hub.login.LoginResponse;
import com.alurachallenge.foro_hub.usuario.UsuarioRepository;
import com.alurachallenge.foro_hub.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/registro")
    public String registrar(@RequestBody Usuario usuario) {
        usuario.setContrasena(passwordEncoder.encode(usuario.getContrasena()));
        usuarioRepository.save(usuario);
        return "Usuario registrado exitosamente.";
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getContrasena())
        );
        String token = jwtUtil.generateToken(request.getEmail());
        return new LoginResponse(token);
    }
}
