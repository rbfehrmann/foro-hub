package com.alurachallenge.foro_hub.topico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public Topico crearTopico(Topico topico) {
        return topicoRepository.save(topico);
    }

    public List<Topico> listarTopicos() {
        return topicoRepository.findAll();
    }

    public Topico obtenerTopicoPorId(Long id) {
        return topicoRepository.findById(id).orElseThrow(() -> new RuntimeException("Tópico no encontrado"));
    }

    public Topico actualizarTopico(Long id, Topico topico) {
        Topico topicoExistente = obtenerTopicoPorId(id);
        topicoExistente.setTitulo(topico.getTitulo());
        topicoExistente.setMensaje(topico.getMensaje());
        return topicoRepository.save(topicoExistente);
    }

    public void eliminarTopico(Long id) {
        topicoRepository.deleteById(id);
    }
}
