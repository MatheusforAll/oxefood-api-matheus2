package br.com.ifpe.oxefood.modelo.venda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class VendaService {

 @Autowired
   private VendaRepository repository;

    @Transactional
   public Venda save(Venda venda) {

    venda.setHabilitado(Boolean.TRUE);
       return repository.save( venda);
       
   }

   public List<Venda> listarTodos() {
  
    return repository.findAll();
}

public Venda obterPorID(Long id) {

    return repository.findById(id).get();
}

 @Transactional
   public void update(Long id,Venda vendaAlterado) {

    Venda venda = repository.findById(id).get();
    venda.setcliente(vendaAlterado.getcliente());
    venda.setproduto(vendaAlterado.getproduto());
    venda.setstatusVenda(vendaAlterado.getstatusVenda());
    venda.setdataVenda(vendaAlterado.getdataVenda());
    venda.setvalorTotal(vendaAlterado.getvalorTotal());
    venda.setobservacao(vendaAlterado.getobservacao());
    venda.setretiradaEmLoja(vendaAlterado.getretiradaEmLoja());
	    
      repository.save(venda);
  }



    
}
