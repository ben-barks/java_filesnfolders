package com.filesNfolders.filesnfolders;

import com.filesNfolders.filesnfolders.folders.File;
import com.filesNfolders.filesnfolders.folders.Folder;
import com.filesNfolders.filesnfolders.folders.User;
import com.filesNfolders.filesnfolders.repositories.FileRepository;
import com.filesNfolders.filesnfolders.repositories.FolderRepository;
import com.filesNfolders.filesnfolders.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesnfoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFileFolderAndUser(){
		User jon = new User("Jon");
		userRepository.save(jon);
		Folder gals = new Folder("Gals", jon);
		folderRepository.save(gals);
		File elena = new File("Elena", "pdf", 15, gals);
		fileRepository.save(elena);
	}



}
