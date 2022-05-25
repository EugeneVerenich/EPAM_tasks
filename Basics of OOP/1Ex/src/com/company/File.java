package com.company;

import java.util.Scanner;

public class File {

    private String file_name, file_type;

    public File(String file_name, String file_type){
        this.file_name = file_name;
        this.file_type = file_type;
    }

    public File(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла : ");
        file_name = in.nextLine();
        System.out.println("Введите тип файла : ");
        file_type = "." + in.next();
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getFile_type() {
        return file_type;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }
}
