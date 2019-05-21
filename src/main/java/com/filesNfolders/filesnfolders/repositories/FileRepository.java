package com.filesNfolders.filesnfolders.repositories;

import com.filesNfolders.filesnfolders.folders.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
