package week4.week4_day2.read_line_parser.Parser;

import week4.week4_day2.read_line_parser.domain.Hospital;


public class HospitalParser implements Parser<Hospital>{

    private String getSubdivision(String name) {
        String[] subdivisions = {"내과", "외과", "소아과", "피부과", "성형외과", "정형외과", "산부인과", "안과", "가정의학과", "비뇨기과", "치과"};
        for (String subdivision : subdivisions) {
            if (name.contains(subdivision)) {
                return subdivision;
            }
        }
        return "";
    }

    public String formatDistrict(String str) {
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
                hospitalParser.formatDistrict(split[1]),
                split[2], Integer.parseInt(split[6]),
                split[10], hospitalParser.getSubdivision(split[10]));
    }
}
