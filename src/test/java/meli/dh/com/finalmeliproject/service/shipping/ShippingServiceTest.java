package meli.dh.com.finalmeliproject.service.shipping;


import meli.dh.com.finalmeliproject.dto.ShippingDTO;
import meli.dh.com.finalmeliproject.model.ShippingCategory;
import meli.dh.com.finalmeliproject.repository.IShippingRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ShippingServiceTest {

    @InjectMocks
    private ShippingService service;

    @Mock
    private IShippingRepo repo;

    //  testa se o id for null
    @Test
    public void nullShippingId() {
        List<ShippingCategory> shippingDTOS = repo.findAll();

        Mockito.when(service.listShippingCategoryDTO(null)).thenReturn(
                ShippingDTO.shippingCategories(shippingDTOS));


    }

//    testa se o id vir preenchido
    @Test
    public void passingShippingId() {
        List<ShippingCategory> shippingDTOS = repo.findAll();

        Mockito.when(service.listShippingCategoryDTO(1L)).thenReturn(
                ShippingDTO.shippingCategories(shippingDTOS));


    }

}
