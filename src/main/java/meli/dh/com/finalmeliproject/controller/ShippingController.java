package meli.dh.com.finalmeliproject.controller;

import meli.dh.com.finalmeliproject.dto.ShippingDTO;
import meli.dh.com.finalmeliproject.service.shipping.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    @Autowired
    private ShippingService service;

    @GetMapping
    public List<ShippingDTO> listShipping(Long id){
        return service.listShippingDTO(id);
    }


}
