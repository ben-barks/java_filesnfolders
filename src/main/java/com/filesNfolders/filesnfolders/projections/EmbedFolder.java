package com.filesNfolders.filesnfolders.projections;

import com.filesNfolders.filesnfolders.folders.File;
import com.filesNfolders.filesnfolders.folders.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name ="embedFolder", types = File.class)
public interface EmbedFolder {
    String getname();
    String getExtension();
    int getSize();
    Folder getFolder();
}
