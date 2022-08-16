package meli.dh.com.finalmeliproject.repository;

import meli.dh.com.finalmeliproject.model.Representative;
import meli.dh.com.finalmeliproject.model.ShippingCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepresentativeRepo extends JpaRepository<Representative, Long> {


}
