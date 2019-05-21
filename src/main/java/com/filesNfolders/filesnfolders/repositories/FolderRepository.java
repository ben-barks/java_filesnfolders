package com.filesNfolders.filesnfolders.repositories;

import com.filesNfolders.filesnfolders.folders.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
