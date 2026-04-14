package ec.ucacue.registro.hombre_maquina.services;

import java.util.List;

import ec.ucacue.registro.hombre_maquina.models.Producto;

public interface ProductoService {
    List<Producto> listarProducto();

    Producto guardar(Producto producto);

    Producto buscarPorId(Long id);

    void eliminar(Long id);

    Producto actualizar(Producto product);
}
