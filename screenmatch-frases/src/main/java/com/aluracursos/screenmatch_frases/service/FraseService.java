package com.aluracursos.screenmatch_frases.service;

import com.aluracursos.screenmatch_frases.dto.FraseDTO;
import com.aluracursos.screenmatch_frases.model.Frase;
import com.aluracursos.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    FraseRepository repository;
    public FraseDTO obtenerFraseAleatoria() {
        return convertirDatos(repository.obtenerFraseAleatoria());
    }

    public FraseDTO convertirDatos(Frase frase){
        return new FraseDTO(frase.getId(), frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
