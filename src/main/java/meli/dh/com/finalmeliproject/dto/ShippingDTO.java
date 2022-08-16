package meli.dh.com.finalmeliproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import meli.dh.com.finalmeliproject.model.PurchaseOrder;
import meli.dh.com.finalmeliproject.model.ShippingCategory;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShippingDTO {

    private long id;

    private int quantityMax;

    private String NameCategory;

    public ShippingDTO(ShippingCategory shippingCategory){
        this.id = shippingCategory.getId();
        this.quantityMax = shippingCategory.getQuantityMax();
        this.NameCategory = shippingCategory.getCategory().getCategoryName();

    }

    public static List<ShippingDTO> shippingCategories(List<ShippingCategory> shipping){
        return shipping.stream().map(ShippingDTO::new).collect(Collectors.toList());
    }

}
