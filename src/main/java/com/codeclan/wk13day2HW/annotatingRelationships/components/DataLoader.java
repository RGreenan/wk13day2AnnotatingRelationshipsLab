package com.codeclan.wk13day2HW.annotatingRelationships.components;

import com.codeclan.wk13day2HW.annotatingRelationships.models.File;
import com.codeclan.wk13day2HW.annotatingRelationships.models.Folder;
import com.codeclan.wk13day2HW.annotatingRelationships.repositories.FileRepository;
import com.codeclan.wk13day2HW.annotatingRelationships.repositories.FolderRepository;
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

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Folder folder1 = new Folder("master_folder");
        folderRepository.save(folder1);

        File file1 = new File("misc_file", "text", 300.0, folder1);
        fileRepository.save(file1);
    }
}
