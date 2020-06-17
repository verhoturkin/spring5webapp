package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Alexander Verkhoturkin
 * @created 17/06/2020 - 18:55
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
