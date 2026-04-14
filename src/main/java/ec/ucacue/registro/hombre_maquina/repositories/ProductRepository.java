package ec.ucacue.registro.hombre_maquina.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.ucacue.registro.hombre_maquina.models.Producto;

public interface ProductRepository extends JpaRepository<Producto, Long> {

}
