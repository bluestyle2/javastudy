
package davinciProj;




public class PlayerInfoDTO {

   String name, id, pw, birth, tel, fstLogin, ipNum; // 변수 fstLogin 추가
   int jelly, dino, hp;

   public PlayerInfoDTO() {

   }
   
   
   
   public PlayerInfoDTO(String id){
         this.id = id;
         this.tel= id;
      }

   public PlayerInfoDTO(String id, String pw) {
      this.id = id;
      this.pw = pw;

   }

   public PlayerInfoDTO(String name, String id, String pw, String birth, String tel) {
      this.name = name;
      this.id = id;
      this.pw = pw;
      this.birth = birth;
      this.tel = tel;
      this.jelly = 0;
      this.dino = 0;
      this.hp = 0;
   }

   public PlayerInfoDTO(String name, String id, String pw, String birth, String tel, int jelly, int dino, int hp) {
      this.name = name;
      this.id = id;
      this.pw = pw;
      this.birth = birth;
      this.tel = tel;
      this.jelly = jelly;
      this.dino = dino;
      this.hp = hp;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getPw() {
      return pw;
   }

   public void setPw(String pw) {
      this.pw = pw;
   }

   public String getBirth() {
      return birth;
   }

   public void setBirth(String birth) {
      this.birth = birth;
   }

   public String getTel() {
      return tel;
   }

   public void setTel(String tel) {
      this.tel = tel;
   }

   public int getJelly() {
      return jelly;
   }

   public void setJelly(int jelly) {
      this.jelly = jelly;
   }

   public int getDino() {
      return dino;
   }

   public void setDino(int dino) {
      this.dino = dino;
   }

   public int getHp() {
      return hp;
   }

   public void setHp(int hp) {
      this.hp = hp;
   }

   public String getFstLogin() { //첫로그인 추가
      return fstLogin;
   }

   public void setFstLogin(String fstLogin) { //첫로그인 추가
      this.fstLogin = fstLogin;
   }
   
   public String getIpNum() {    //접속 아이피 번호
         return ipNum;
      }

   public void setIpNum(String ipNum) {
      
      this.ipNum = ipNum;
   }

   public String toString() {
      return name + ", " + id + ", " + pw + ", " + birth + ", "+ tel + "," + jelly + ", " + dino + ", " + hp +", "+ ipNum;

   }

}