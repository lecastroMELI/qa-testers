package dh.meli.qatesters.service;

import dh.meli.qatesters.exception.BadRequest;
import dh.meli.qatesters.model.TestCase;
import dh.meli.qatesters.repository.TestCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestCaseService implements ITestCaseService {

    @Autowired
    private TestCaseRepository repository;

    @Override
    public TestCase insertTest(TestCase newTestCase) {
        if (newTestCase.getId_case() > 0) {
            throw new BadRequest("⚠️ Novo caso de teste não deve possuir um ID para ser inserido!");
        }
        return repository.save(newTestCase);
    }

    @Override
    public List<TestCase> getAllTests() {
        return null;
    }

    @Override
    public TestCase getTestById(long id) {
        return null;
    }

    @Override
    public TestCase updateTestById(TestCase testCase) {
        return null;
    }

    @Override
    public void deleteTestById(long id) {

    }

    @Override
    public List<TestCase> getAllTestsByDate() {
        return null;
    }
}
