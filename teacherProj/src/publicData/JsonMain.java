package publicData;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;

public class JsonMain {
    public static void main(String[] args) throws IOException {
    	
    	String kk ="LZZA9thUj%2FKIBuBqXtMic7y19SGGV24kbe%2F8oXe%2Fa4aqDUPEDKqc8CjfsFrT55OASZq5vKMOHOVJqGkGHq8odA%3D%3D";
    	
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552061/frequentzoneBicycle/getRestFrequentzoneBicycle"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "="+kk); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("searchYearCd","UTF-8") + "=" + URLEncoder.encode("2015", "UTF-8")); /*조회하고자 하는 연도값 입력(값 없을 시 공백리턴)*/
        urlBuilder.append("&" + URLEncoder.encode("siDo","UTF-8") + "=" + URLEncoder.encode("11", "UTF-8")); /*코드종류 코드값전체 공백시 전체 선택서울특별시 11부산광역시 26대구광역시 27인천광역시 28광주광역시 29대전광역시 30울산광역시 31세종특별자치시 36경기도 41강원도 42충청북도 43충청남도 44전라북도 45전라남도 46경상북도 47경상남도 48제주특별자치도 50*/
        urlBuilder.append("&" + URLEncoder.encode("guGun","UTF-8") + "=" + URLEncoder.encode("110", "UTF-8")); /*시도 코드종류 코드값서울특별시 강남구 680 강동구 740 강북구 305 강서구 500 관악구 620 광진구 215 구로구 530 금천구 545 노원구 350 도봉구 320 동대문구 230 동작구 590 마포구 440 서대문구 410 서초구 650 성동구 200 성북구 290 송파구 710 양천구 470 영등포구 560 용산구 170 은평구 380 종로구 110 중구 140 중랑구 260부산광역시 강서구 4*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식(xml/json)*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*검색건수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        //urlBuilder.append("&" + URLEncoder.encode("sido_sgg_nm","UTF-8") + "=" + URLEncoder.encode("서울특별시 종로구2", "UTF-8")); 
        System.out.println(urlBuilder.toString());
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        //String data = sb.toString().replaceAll(" ", "").replaceAll("\t",""); //공백간격자르기,탭
        
        System.out.println(sb.toString());
        
        JSONParser parser = new JSONParser();
        JSONObject obj = null;
        
        try {
			obj = (JSONObject)parser.parse(sb.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //배열형태 [] : JSONArray
        //맵형태 {} : JSONObject
        //System.out.println(obj);
        JSONArray items = (JSONArray)((JSONObject)obj.get("items")).get("item");
        //JSONObject items = (JSONObject)obj.get("items");
        //System.out.println(items);
        ArrayList<ListDTO> arr = new ArrayList<ListDTO>();
        for (Object oo : items) {
        	JSONObject jj = (JSONObject)oo;
        	//System.out.println(oo);
        	System.out.println(jj.get("spot_nm") +" => " + jj.get("sido_sgg_nm"));
        	arr.add(new ListDTO(jj));
        }
        
        for (ListDTO dto : arr) {
        	System.out.println(dto);
        }
        
    }
}