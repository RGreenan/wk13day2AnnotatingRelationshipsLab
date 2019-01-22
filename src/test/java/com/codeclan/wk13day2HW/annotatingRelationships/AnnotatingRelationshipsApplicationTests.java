package com.codeclan.wk13day2HW.annotatingRelationships;

import com.codeclan.wk13day2HW.annotatingRelationships.models.File;
import com.codeclan.wk13day2HW.annotatingRelationships.models.Folder;
import com.codeclan.wk13day2HW.annotatingRelationships.models.User;
import com.codeclan.wk13day2HW.annotatingRelationships.repositories.FileRepository;
import com.codeclan.wk13day2HW.annotatingRelationships.repositories.FolderRepository;
import com.codeclan.wk13day2HW.annotatingRelationships.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotatingRelationshipsApplicationTests {

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
	public void canCreateUserFileFolderThenSave(){
	    User user1 = new User("Mick");
	    userRepository.save(user1);

		Folder folder1 = new Folder("master_folder", user1);
		folderRepository.save(folder1);

		File file1 = new File("misc_file", "text", 300.0, folder1);
		fileRepository.save(file1);
	}
}

