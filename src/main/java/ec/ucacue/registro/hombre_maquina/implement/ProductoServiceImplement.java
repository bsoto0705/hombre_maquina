package ec.ucacue.registro.hombre_maquina.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.ucacue.registro.hombre_maquina.models.Producto;
import ec.ucacue.registro.hombre_maquina.repositories.ProductRepository;
import ec.ucacue.registro.hombre_maquina.services.ProductoService;

@Service
public class ProductoServiceImplement implements ProductoService {

    private final ProductRepository productRepository;

    public ProductoServiceImplement(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Producto> listarProducto() {
        return productRepository.findAll();
    }

    @Override
    public Producto guardar(Producto producto) {
        return productRepository.save(producto);
    }

    @Override
    public Producto buscarPorId(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Producto actualizar(Producto product) {
        return productRepository.save(product);

    }

    @Override
    public void eliminar(Long id) {
        productRepository.deleteById(id);
    }
}
