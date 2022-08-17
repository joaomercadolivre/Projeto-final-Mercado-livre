package meli.dh.com.finalmeliproject.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Builder
@Getter @Setter
public class ShippingCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public ShippingCategory(long id, int quantityMax, Category category, Shipping shipping) {
        this.id = id;
        this.quantityMax = quantityMax;
        this.category = category;
        this.shipping = shipping;
    }

    private int quantityMax;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "id_shipping")
    private Shipping shipping;

    public ShippingCategory(ShippingCategory shippingCategory) {
    }
}
