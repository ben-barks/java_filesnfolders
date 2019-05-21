package com.filesNfolders.filesnfolders.components;

import com.filesNfolders.filesnfolders.folders.File;
import com.filesNfolders.filesnfolders.folders.Folder;
import com.filesNfolders.filesnfolders.folders.User;
import com.filesNfolders.filesnfolders.repositories.FileRepository;
import com.filesNfolders.filesnfolders.repositories.FolderRepository;
import com.filesNfolders.filesnfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) {
        User jon = new User("Jon");
        userRepository.save(jon);

        User rory = new User("Rory");
        userRepository.save(rory);

        Folder gals = new Folder("Gals", jon);
        folderRepository.save(gals);

        Folder instruments = new Folder("Instruments", rory);
        folderRepository.save(instruments);

        File elena = new File("Elena", "pdf", 15, gals);
        fileRepository.save(elena);

        File fender = new File("Fender", "mp3", 50, instruments);
        fileRepository.save(fender);

    }
}
