package eu.dcode.ecommerce.repository;

import eu.dcode.ecommerce.model.OrderProduct;
import eu.dcode.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
