package week4.week4_day2.read_line_parser;

import week4.week4_day2.read_line_parser.domain.Hospital;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Writer {
    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(List<String> strs, String filename) {
        File file = new File(filename);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            for (String str : strs){
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> makeQuery(List<Hospital> hospitals) {

        List<String> queryList = new ArrayList<>();
        queryList.add("INSERT INTO\n");
        queryList.add("`likelion-db`.`seoul_hospital`(`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)\n");
        queryList.add("VALUES\n");
        int i=1;
        for (Hospital hospital : hospitals) {
            if (i != 19039) {
                String s = String.format("('%s','%s','%s','%s', %d ,'%s','%s'),\n",hospital.getId(),hospital.getAddress(),hospital.getDistrict(),
                        hospital.getCategory(),hospital.getEmergencyRoom(),hospital.getName(),hospital.getSubdivision());
                queryList.add(s);

            } else {
                String s1 = String.format("('%s','%s','%s','%s', %d ,'%s','%s');\n",hospital.getId(),hospital.getAddress(),hospital.getDistrict(),
                        hospital.getCategory(),hospital.getEmergencyRoom(),hospital.getName(),hospital.getSubdivision());
                queryList.add(s1);
            }
            i++;
        }

        queryList.add("SELECT * FROM `likelion-db`.seoul_hospital;");
        return queryList;
    }
}
