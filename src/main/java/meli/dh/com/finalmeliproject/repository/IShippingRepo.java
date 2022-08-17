package meli.dh.com.finalmeliproject.repository;

import meli.dh.com.finalmeliproject.model.ShippingCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IShippingRepo extends JpaRepository<ShippingCategory, Long> {

    List<ShippingCategory> findByShipping(Long id);



}
