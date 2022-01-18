package homework_p;

	interface Mp3{
	
		void listening();
		void stop();
	}
	interface Camera{
	
		void filmshoot();
		void lookalbum();
	}
	interface Call{
		void calllisten();
		void talking();
	}
	interface Phone{
		void mp3button(String mp3push);
		void cambutton(String campush);
		void calbutton(String calpush);
	}
	class PhoneData{
		
		public PhoneData(String name) {
			super();
			this.name = name;
		
	}
		String name;
		int mp3p, mp3s, cams, albm, cali, tal;
		public String toString() {
			
		return name+" 기기의 mp3재생 = "+mp3p+" mp3정지 = "+mp3s+" 카메라 촬영 = " +cams+ "앨범 출력 = "+albm+"전화 듣기 = "+cali+"전화연결 = "+tal+"";
		}
	}


	class SysPhone implements Mp3, Camera, Call, Phone {
	
		PhoneData phtot,data;
		
		public SysPhone(PhoneData phtot, String name) {
		data = new PhoneData(name);
			this.phtot = phtot;
		}
		

	
		public void listening() {
			System.out.println(data.name+"으로 mp3를 재생합니다");
			data.mp3p++;
			phtot.mp3p++;
		}	
	
		public void stop() {
			
			System.out.println(data.name+"으로 mp3를 정지합니다");
			data.mp3s++;
			phtot.mp3s++;
		}

		public void filmshoot() {
			
			System.out.println(data.name+"으로 카메라를 촬영합니다");
			data.cams++;
			phtot.cams++;
		}
	
	public void lookalbum() {
		
			System.out.println(data.name+"으로 카메라앨범을 보여줍니다");
			data.albm++;
			phtot.albm++;
	}
	
	public void calllisten() {
		
			System.out.println(data.name+"으로 전화를 듣습니다");
			data.cali++;
			phtot.cali++;
	}
	public void talking() {
		
			System.out.println(data.name+"으로 전화 목소리를연결합니다");
			data.tal++;
			phtot.tal++;
	}

}
public class Study3 {

	public static void main(String[] args) {
		
		PhoneData dataSys = new PhoneData("명령동작횟수");
	
		SysPhone [] play = {
			new SysPhone(dataSys,"아이폰"),
			new SysPhone(dataSys,"블랙베리"),
			new SysPhone(dataSys,"폰노이만")
		};
		
		Mp3 mp = play[0];
		Camera ca = play[1];
		Call caa = play[2];
		
		mp.listening();
		mp.stop();
		mp = play[2];
		mp.listening();
		mp.stop();
		caa.talking();
		caa = play[1];
		caa.talking();
		caa.calllisten();
		ca.filmshoot();
		ca.lookalbum();
		for (SysPhone aa : play) {
			System.out.println(aa.data);
		}
		System.out.println(dataSys);
	}
}
///기능

//// mp3 - 듣기, 멈추기

/// 카메라 - 찍기, 보기

/// 전화   - 듣기, 말하기

/// 핸드폰 - mp3, 카메라, 전화



/// 구현

///  어른폰 을 만들어 주세요