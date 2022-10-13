package week4.week4_day2.read_line_parser;

import week4.week4_day2.read_line_parser.Parser.HospitalParser;
import week4.week4_day2.read_line_parser.domain.Hospital;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String filename = "C:\\Users\\chlal\\Desktop\\Spring study\\coderion\\서울시 병의원 위치 정보.csv";
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);
        Writer writer = new Writer();

        String targetFilename = "javaQuery.sql";
        writer.createAFile(targetFilename);
        List<String> queryList = writer.makeQuery(hospitals);
        writer.write(queryList,targetFilename);

    }
}
