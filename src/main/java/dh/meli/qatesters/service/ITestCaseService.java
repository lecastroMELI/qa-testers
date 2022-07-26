package dh.meli.qatesters.service;

import dh.meli.qatesters.model.TestCase;

import java.util.List;

public interface ITestCaseService {
    TestCase insertTest(TestCase newTestCase);
    List<TestCase> getAllTests();
    TestCase getTestById(long id);
    TestCase updateTestById(TestCase testCase);
    void deleteTestById(long id);
    List<TestCase> getAllTestsByDate();
}
