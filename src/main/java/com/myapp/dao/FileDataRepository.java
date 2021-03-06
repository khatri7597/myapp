package com.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.model.FileData;

@Repository
public interface FileDataRepository extends JpaRepository<FileData, Long> {

}
