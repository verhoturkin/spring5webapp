package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Alexander Verkhoturkin
 * @created 17/06/2020 - 18:57
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
