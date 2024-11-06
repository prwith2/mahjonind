package br.com.etechoracio.mahjong.service;

import br.com.etechoracio.mahjong.entity.Jogador;
import br.com.etechoracio.mahjong.repository.JogadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {
    private final JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public List<Jogador> listarJogadores() {
        return jogadorRepository.findAll();
    }

    public Jogador salvarJogador(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }
}