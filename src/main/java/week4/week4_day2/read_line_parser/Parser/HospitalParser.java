package week4.week4_day2.read_line_parser.Parser;

import week4.week4_day2.read_line_parser.domain.Hospital;


public class HospitalParser implements Parser<Hospital>{

    public String setDistrict(String str) {
        String[] s = str.split(" ");
        return s[0] + " " + s[1];
    }
    // "" "" 제거 내가 만든거
    public String getRealValue(String str) {
        return str.substring(1, str.length() - 1);
    }

    // "" "" 제거 강사님꺼
    private String replaceAllQuot(String str) {
        return str.replaceAll("\"", "");
    }

    @Override
    public Hospital parse(String str) {

        // "" "" 제거 다른 수강생분거 이게 제일 깔끔
        HospitalParser hospitalParser = new HospitalParser();
        str = str.replaceAll("\"", "");
        str = str.replaceAll("'","");

        String[] split = str.split(",");

        return new Hospital(split[0], split[1],
                hospitalParser.setDistrict(split[1]),
                split[2], Integer.parseInt(split[6]),
                split[10],null);
    }
}
