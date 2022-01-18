package homework_p;
//성별, 국적, 생년월일, 한국나이까지 과제
/*class JuminData{
		String info;
		
		String genderInfo() {
			
		}
		
		
		
		
		
		public String toString() {
			return genderInfo();
			}
			
		JuminData(String info){
			
				this.info = info;
				
			}
		}
*/
public class Study8 {

	public static void main(String[] args) {
		
		String jumin = "950415-1228633";
		
		int pp = Integer.parseInt(jumin.substring(7,8));
		System.out.println("성별 : "+"여남".charAt(pp%2));
		System.out.println("국적 : "+"내외".charAt(pp/5)+"국인");


		System.out.print("생년월일 : ");
		int aa = Integer.parseInt(jumin.substring(0,2));
		System.out.print(aa+"년 ");
		int bb = Integer.parseInt(jumin.substring(2,4));
		System.out.print(bb+"월 ");
		int cc = Integer.parseInt(jumin.substring(4,6));
		System.out.print(cc+"일 ");

		System.out.println(aa-68+"세");
		
String jumin1 = "951206-2028613";
		
		int pp1 = Integer.parseInt(jumin1.substring(7,8));
		System.out.println("성별 : "+"여남".charAt(pp1%2));
		System.out.println("국적 : "+"내외".charAt(pp1/5)+"국인");


		System.out.print("생년월일 : ");
		int aa1 = Integer.parseInt(jumin1.substring(0,2));
		System.out.print(aa1+"년 ");
		int bb1 = Integer.parseInt(jumin1.substring(2,4));
		System.out.print(bb1+"월 ");
		int cc1 = Integer.parseInt(jumin1.substring(4,6));
		System.out.print(cc1+"일 ");

		System.out.println(aa1-68+"세");
		
String jumin2 = "980608-6128614";
		
		int pp2 = Integer.parseInt(jumin2.substring(7,8));
		System.out.println("성별 : "+"여남".charAt(pp2%2));
		System.out.println("국적 : "+"내외".charAt(pp2/5)+"국인");


		System.out.print("생년월일 : ");
		int aa2 = Integer.parseInt(jumin2.substring(0,2));
		System.out.print(aa2+"년 ");
		int bb2 = Integer.parseInt(jumin2.substring(2,4));
		System.out.print(bb2+"월 ");
		int cc2 = Integer.parseInt(jumin2.substring(4,6));
		System.out.print(cc2+"일 ");

		System.out.println(aa2-68+"세");
	/*	JuminData[] aa = { 
				new JuminData("950406-1243532"),
				new JuminData("970304-2101456"),
				new JuminData("950203-1132212")
				};
		
		
	
		for (JuminData bb : arr) {
			System.out.println(bb);*/
		}
	
	}




