package com.filesNfolders.filesnfolders.projections;

import com.filesNfolders.filesnfolders.folders.File;
import com.filesNfolders.filesnfolders.folders.Folder;
import com.filesNfolders.filesnfolders.folders.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
    String getName();
    List<File> getFiles();
    User getUser();
}
