package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Colaborador;
import com.example.demo.repositories.ColaboradorRepository;

@Service
public class ColaboradorService {
   
   private final ColaboradorRepository colaboradorRepository;
   
   @Autowired
   public ColaboradorService(ColaboradorRepository colaboradorrepository) {
       this.colaboradorRepository = colaboradorrepository;
   }
   
   //Criação do produto
   public Colaborador saveColaborador(Colaborador colaborador) {
       return colaboradorRepository.save(colaborador);
   }
   
   //Buscar produto
   public Colaborador getColaboradorByeId(Long id) {
       return colaboradorRepository.findById(id).orElse(null);
   }
   
   
   //Procurar todos os produtos
   public List<Colaborador> getAllColaborador(){
       return colaboradorRepository.findAll();
   }
   
   //Excluir os produtos
   public void deleteColaborador(Long id) {
       colaboradorRepository.deleteById(id);
       
   }
}