package com.FileUpload.DealWithImages.Repository;

import com.FileUpload.DealWithImages.Entity.FileData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileDataRepository extends JpaRepository<FileData , Long> {
    Optional<FileData> findByName(String name);
}
