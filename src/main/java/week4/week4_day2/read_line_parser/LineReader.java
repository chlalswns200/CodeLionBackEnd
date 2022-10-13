package week4.week4_day2.read_line_parser;

import week4.week4_day2.read_line_parser.Parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T> {

    Parser<T> parser;
    boolean isRemoveColumnName = true;

    public LineReader(Parser<T> parser) {
        this.parser = parser;
    }

    List<T> readLines(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        List<T> result = new ArrayList<>();
        if (isRemoveColumnName) {
            br.readLine();

        }
        while ((str = br.readLine()) != null) {
            result.add(parser.parse(str));
        }
        return result;
    }
}
