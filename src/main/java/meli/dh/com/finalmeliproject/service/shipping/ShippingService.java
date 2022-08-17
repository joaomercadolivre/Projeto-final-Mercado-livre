package meli.dh.com.finalmeliproject.service.shipping;


import meli.dh.com.finalmeliproject.dto.ShippingDTO;
import meli.dh.com.finalmeliproject.model.ShippingCategory;
import meli.dh.com.finalmeliproject.repository.IShippingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ShippingService {

    @Autowired
    private IShippingRepo repo;


    public List<ShippingDTO> listShippingCategoryDTO(Long id) {
        if (id == null) {
            List<ShippingCategory> shippingCategories = repo.findAll();
            return ShippingDTO.shippingCategories(shippingCategories);
        } else {
            List<ShippingCategory> shippingCategories = repo.findByShipping(id);
            return ShippingDTO.shippingCategories(shippingCategories);
        }

    }

    public ResponseEntity<?> deleteShippingCategory(Long id) {
        repo.deleteById(id);
        return ResponseEntity.ok("category of " + id + " was deleted");

    }

}
