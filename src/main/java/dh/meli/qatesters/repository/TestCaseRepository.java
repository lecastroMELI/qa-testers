package dh.meli.qatesters.repository;

import dh.meli.qatesters.model.TestCase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCaseRepository extends CrudRepository<TestCase, Long> {
}
