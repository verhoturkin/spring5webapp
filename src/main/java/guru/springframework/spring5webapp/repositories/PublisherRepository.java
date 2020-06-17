package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Alexander Verkhoturkin
 * @created 17/06/2020 - 19:14
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
