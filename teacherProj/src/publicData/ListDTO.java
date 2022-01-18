package publicData;

import org.json.simple.JSONObject;

public class ListDTO {

//	다발지역FID   afos_fid	22	필수	6096407	다발지역에 대한 공간정보 식별자
//	다발지역ID	afos_id	7	필수	2015046	다발지역 식별자
//	법정동코드	bjd_cd	10	필수	1111017500	법정동 코드
//	지점코드	spot_cd	10	필수	11110001	사고다발지역 목록내의 지점코드
//	시도시군구명	sido_sgg_nm	40	필수	서울특별시 종로구1	지점의 시도시군구명
//	지점명	spot_nm	100	필수	서울특별시 종로구 숭인동(동묘앞역 부근)	다발지역 지점의 위치
//	발생건수	occrrnc_cnt	8	필수	5	다발지역 내 발생건수
//	사상자수	caslt_cnt	8	필수	6	다발지역 내 사상자수
//	사망자수	dth_dnv_cnt	8	필수	0	다발지역 내 사망자수
//	중상자수	se_dnv_cnt	8	필수	1	다발지역 내 중상자수
//	경상자수	sl_dnv_cnt	8	필수	4	다발지역 내 경상자수
//	부상신고자수	wnd_dnv_cnt	8	필수	1	다발지역 내 부상신고자수
//	경도	lo_crd	16	필수	127.03537050324	다발지역지점 중심점의 경도(EPSG 4326)
//	위도	la_crd	15	필수	37.64965990738	다발지역지점 중심점의 위도(EPSG 4326)
//	다발지역폴리곤	geom_json	4000	필수	{\"type\":\"Polygon\",\"coordinates\":[[[127.0167897,37.5749092],[127.0164467,37.5751333],[127.0160552,37.5752998],[127.0156305,37.5754023],[127.0151889,37.575437],[127.0147472,37.5754023],[127.0143225,37.5752998],[127.0139311,37.5751333],[127.013588,37.5749092],[127.0133065,37.5746361],[127.0130973,37.5743246],[127.0129684,37.5739865],[127.0129249,37.573635],[127.0129685,37.5732835],[127.0130973,37.5729454],[127.0133065,37.5726339],[127.0135881,37.5723609],[127.0139311,37.5721368],[127.0143225,37.5719702],[127.0147472,37.5718677],[127.0151889,37.5718331],[127.0156305,37.5718677],[127.0160552,37.5719702],[127.0164466,37.5721368],[127.0167897,37.5723609],[127.0170712,37.5726339],[127.0172804,37.5729454],[127.0174093,37.5732835],[127.0174528,37.573635],[127.0174093,37.5739865],[127.0172805,37.5743246],[127.0170713,37.5746361],[127.0167897,37.5749092]]]}","x_crd":127.01519,"y_crd":37.573635}]}	다발지역 지점의 폴리곤 정보(EPSG 4326)
//	결과 코드	resultCode	4	필수	0000	API호출 결과 코드
//	결과 메시지	resultMsg	100	필수	Success	API호출 결과 메시지
//	총건수	totalCount	5	필수	9	검색결과 총건수
//	검색건수	numOfRows	4	필수	10	검색건수
//	페이지 번호	pageNo	4
	String resultCode;
	String resultMsg;
	String afost_fid;
	String afost_id;
	String bjd_cd;
	String spot_cd;
	String sido_sgg_nm;
	String spot_nm;
	int occrrnc_cnt;
	int caslt_cnt;
	int dth_dnv_cnt;
	int se_dnv_cnt;
	int sl_dnv_cnt;
	int wnd_dnv_cnt;
	double lo_crd;
	double la_crd;
	String geom_json;
	
	int totalCount;
	int numOfRows;
	int pageNo;
	
	public ListDTO() {
		// TODO Auto-generated constructor stub
	}


	
	public ListDTO(JSONObject jj) {
		super();
		this.resultCode = (String)jj.get("resultCode");
		this.resultMsg = (String)jj.get("resultMsg");
		this.afost_fid = (String)jj.get("afost_fid");
		this.afost_id = (String)jj.get("afost_id)");
		this.bjd_cd = (String)jj.get("bjd_cd");
		this.spot_cd = (String)jj.get("spot_cd");
		this.sido_sgg_nm = (String)jj.get("sido_sgg_nm");
		this.spot_nm = (String)jj.get("spot_nm");
		//this.occrrnc_cnt = (Integer)jj.get("occrrnc_cnt");
		//this.caslt_cnt = (Integer)jj.get("caslt_cnt");
		//this.dth_dnv_cnt = (Integer)jj.get("dth_dnv_cnt");
		//this.se_dnv_cnt = (Integer)jj.get("se_dnv_cnt");
		//this.sl_dnv_cnt = (Integer)jj.get("sl_dnv_cnt");
//		this.wnd_dnv_cnt =(Integer)jj.get("wnd_dnv_cnt");
//		this.lo_crd = (Double)jj.get("lo_crd");
//		this.la_crd = (Double)jj.get("la_crd");
//		this.geom_json = (String)jj.get("geom_json");
		
//		this.totalCount = (Integer)jj.get("totalCount");
//		this.numOfRows = (Integer)jj.get("numOfRows");
//		this.pageNo = (Integer)jj.get("pageNo");
	}



	@Override
	public String toString() {
		return "ListDTO [fost_fid=" + afost_fid + ", afost_id=" + afost_id + ", bjd_cd=" + bjd_cd + ", spot_cd="
				+ spot_cd + ", sido_sgg_nm=" + sido_sgg_nm + ", spot_nm=" + spot_nm + ", occrrnc_cnt=" + occrrnc_cnt
				+ ", caslt_cnt=" + caslt_cnt + ", dth_dnv_cnt=" + dth_dnv_cnt + ", se_dnv_cnt=" + se_dnv_cnt
				+ ", sl_dnv_cnt=" + sl_dnv_cnt + ", wnd_dnv_cnt=" + wnd_dnv_cnt + ", lo_crd=" + lo_crd + ", la_crd="
				+ la_crd + "]";
	}
	
	

}
