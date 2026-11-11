package br.com.fiap.locatech.locatech.repositories;

import br.com.fiap.locatech.locatech.entities.Veiculo;

import java.util.List;
import java.util.Optional;

//Contrato da nossa Veiculo Repository
//Alguem precisa agora implementar este contrato, isso é o exemplo do uso das interfaces.

public interface VeiculoRepository {

    Optional<Veiculo> findById(Long id);

    List<Veiculo> findAll(int size, int offset);
    Integer save(Veiculo veiculo);
    Integer uptate(Veiculo veiculo, Long id);
    Integer delete(Long id);
}
