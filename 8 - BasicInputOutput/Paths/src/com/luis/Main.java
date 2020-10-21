package com.luis;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {

        try {

            //Files metadata/attributes
            Path filePath = FileSystems.getDefault().getPath("Examples","Dir1\\file1.txt");
            System.out.println("Size: " + Files.size(filePath));
            System.out.println("LastModifiedDate: " + Files.getLastModifiedTime(filePath));
            System.out.println("IsHidden: " + Files.isHidden(filePath));
            System.out.println("***********************************************************************");
            //System.out.println("All attributes: " + Files.readAttributes(filePath, BasicFileAttributes.class).toString());
            BasicFileAttributes attrs = Files.readAttributes(filePath,BasicFileAttributes.class);
            System.out.println(attrs.size());
            System.out.println(attrs.creationTime());



            //Create files and directories
//            Path dirtToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6\\Dir7");
//            Files.createDirectories(dirtToCreate);
//            Path multipleDirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
//            Files.createDirectories(multipleDirToCreate);
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.createDirectory(dirToCreate);

//            //Delete
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.deleteIfExists(fileToDelete);

//            //Rename
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","file2.txt");
//            Files.move(fileToMove,destination);

            //Move
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1Copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","Dir1","file1copy.txt");
//            Files.move(fileToMove,destination);

            //copy
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples","file1copy.txt");
//            Files.copy(sourceFile,copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Examples","Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.copy(sourceFile,copyFile, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//
//
//        System.out.println("****************");
//
//        Path pathSub = FileSystems.getDefault().getPath(".","files","SubdirectoryFile.txt");
//        printFile(pathSub);
//
//        System.out.println("****************");
//
//        Path outPath = Paths.get("C:\\Users\\Luis\\JavaCourse\\8 - BasicInputOutput\\OutThere.txt");
//        printFile(outPath);
//
//        Path filePath;
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        System.out.println(filePath.normalize().toAbsolutePath());
//
//        Path path3 = FileSystems.getDefault().getPath("thisFileDoes.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("C:\\Users\\Luis\\JavaCourse\\8 - BasicInputOutput\\OutTheredasdsada.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists "  + Files.exists(filePath));
//        System.out.println("Exists "  + Files.exists(path4));
//
//



    }

    private static void printFile(Path path){
        try(BufferedReader fileReader = Files.newBufferedReader(path)){
            String line;
            while ((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
