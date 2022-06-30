package com.khy2.dbtest.dao;

import com.khy2.dbtest.dto.TestDTO;

import java.util.List;

public interface TestDAO {
    List<TestDTO> getTestData();
}
