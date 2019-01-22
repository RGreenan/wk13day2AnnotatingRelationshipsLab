package com.codeclan.wk13day2HW.annotatingRelationships.components;

import com.codeclan.wk13day2HW.annotatingRelationships.models.File;
import com.codeclan.wk13day2HW.annotatingRelationships.models.Folder;
import com.codeclan.wk13day2HW.annotatingRelationships.models.User;
import com.codeclan.wk13day2HW.annotatingRelationships.repositories.FileRepository;
import com.codeclan.wk13day2HW.annotatingRelationships.repositories.FolderRepository;
import com.codeclan.wk13day2HW.annotatingRelationships.repositories.UserRepository;
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

    public void run(ApplicationArguments args){
        User user1 = new User("Jeff");
        userRepository.save(user1);
        User user2 = new User("Begbie");
        userRepository.save(user2);

        Folder folder1 = new Folder("master_folder", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("sub_folder", user2);
        folderRepository.save(folder2);


        File file1 = new File("misc_file", "text", 300.0, folder1);
        fileRepository.save(file1);
        File file2 = new File("unnamed_file", "doc", 500.0, folder2);
        fileRepository.save(file2);
    }
}
