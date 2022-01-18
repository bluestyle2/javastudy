package davinciProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PlayerInfoDAO {   //db 전체회원 조회, 회원가입 완료(추가), 첫 캐릭터 배정, 젤리갱신
   
   Connection con;
   Statement stmt;
   ResultSet rs;
   
   String sql;
   
   public PlayerInfoDAO() {
         String url = "jdbc:mysql://localhost:3306/davinci_db";
         String username = "davinci_code";
         String pw ="123456";

      
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(url, username, pw);
         stmt = con.createStatement();
         
      } catch (Exception e) {
      
      }
   
   }
   
   
   public ArrayList<PlayerInfoDTO> list(){  //회원 전체 목록(랭킹할 때)
      
      ArrayList<PlayerInfoDTO> res = new ArrayList<PlayerInfoDTO>();
         
         
       sql = "select * from playerinfo order by jelly desc, dino";      //모든 데이터 가져오기
         
       try {
           rs = stmt.executeQuery(sql);         //튜플로 하나씩 가져옴
            
           while(rs.next()) {
              PlayerInfoDTO dto = new PlayerInfoDTO();
               dto.setName( rs.getString("name") );
               dto.setId( rs.getString("id") );
               dto.setPw( rs.getString("pw") );
               dto.setBirth( rs.getString("birth") );
               dto.setTel( rs.getString("tel"));
               dto.setJelly( rs.getInt("jelly") );
               dto.setDino( rs.getInt("dino") );
               dto.setHp( rs.getInt("hp") );   
               dto.setIpNum( rs.getString("ipnum") );  
               
               res.add(dto);
          }
            
       } catch (Exception e) {

            e.printStackTrace();
            
       }finally {
            close();
       }

       return res;
   }
   
   public ArrayList<PlayerInfoDTO> list2(){  //회원 id,ip
         
         ArrayList<PlayerInfoDTO> res = new ArrayList<PlayerInfoDTO>();
            
            
          sql = "select id, ipnum from playerinfo";      //모든 데이터 가져오기
            
          try {
              rs = stmt.executeQuery(sql);         //튜플로 하나씩 가져옴
               
              while(rs.next()) {
                 PlayerInfoDTO dto = new PlayerInfoDTO();
                  dto.setId( rs.getString("id") );
                  dto.setIpNum( rs.getString("ipnum") );  
                  
                  res.add(dto);
             }
               
          } catch (Exception e) {

               e.printStackTrace();
               
          }finally {
               close();
          }

          return res;
      }
   
   
   public int insert(PlayerInfoDTO dto){  // 회원가입 완료(dto에 등록 후)
      int res = 0;
        
      sql = "insert into playerinfo"
         + "(name, id, pw, birth, tel, jelly, dino, hp) "
         + "values ('"
         +dto.getName()+"', '"
         +dto.getId()+"', '"
         +dto.getPw()+"', '"
         +dto.getBirth()+ "', '"
         +dto.getTel()+ "', "
         +dto.getJelly()+ ", "
         +dto.getDino()+ ", "
         +dto.getHp()+" )";                  
            
       try {
          res = stmt.executeUpdate(sql);
        
       } catch (Exception e) {
   
          e.printStackTrace();
       }finally {
          close();
       }
   
       return res;
   }   
   

   public PlayerInfoDTO detail(String id){    //로그인, 회원가입
      PlayerInfoDTO res = null;
         
         sql = "select * from playerinfo where id = '"+id+"' ";

         try {
            rs = stmt.executeQuery(sql);
            
            if(rs.next()) {
               res = new PlayerInfoDTO();
               res.setName( rs.getString("name") );
               res.setId( rs.getString("id") );
               res.setPw( rs.getString("pw") );
               res.setBirth( rs.getString("birth") );
               res.setTel(rs.getString("tel"));
               res.setJelly( rs.getInt("jelly") );
               res.setDino( rs.getInt("dino") );
               res.setHp( rs.getInt("hp") );
               
            }
            
         } catch (Exception e) {

            e.printStackTrace();
            
         }finally {
            close();
         }

        return res;
   }
   
   public PlayerInfoDTO detail3(String tel){    //번호 
         PlayerInfoDTO res = null;
            
            sql = "select * from playerinfo where tel = '"+tel+"' ";

            try {
               rs = stmt.executeQuery(sql);
               
               if(rs.next()) {
                  res = new PlayerInfoDTO();
                  res.setName( rs.getString("name") );
                  res.setId( rs.getString("id") );
                  res.setPw( rs.getString("pw") );
                  res.setBirth( rs.getString("birth") );
                  res.setTel(rs.getString("tel"));
                  res.setJelly( rs.getInt("jelly") );
                  res.setDino( rs.getInt("dino") );
                  res.setHp( rs.getInt("hp") );
                  
               }
               
            } catch (Exception e) {

               e.printStackTrace();
               
            }finally {
               close();
            }

           return res;
      }
   
   public PlayerInfoDTO details2(String id, String pw){    //로그인, 회원가입
      PlayerInfoDTO res = null;
         
      sql = "select * from playerinfo where id = '" + id + "'AND pw ='" + pw + "' ";

         try {
            rs = stmt.executeQuery(sql);
            
            if(rs.next()) {
               res = new PlayerInfoDTO();
               res.setName( rs.getString("name") );
               res.setId( rs.getString("id") );
               res.setPw( rs.getString("pw") );
               res.setBirth( rs.getString("birth") );
               res.setTel(rs.getString("tel"));
               res.setJelly( rs.getInt("jelly") );
               res.setDino( rs.getInt("dino") );
               res.setHp( rs.getInt("hp") );           
               
            }
            
         } catch (Exception e) {

            e.printStackTrace();
            
         }finally {
            close();
         }

        return res;
   }
   
   
 
   
   public int modify(PlayerInfoDTO dto){  //첫 로그인일 경우: 캐릭터 배정
         int res = 0;
         System.out.println(dto.getId());
         sql = "update playerinfo set jelly = '"
              +dto.getJelly()+ "', dino = "
              +dto.getDino()+ ", hp = "
               +dto.getHp()+ " ,fstLogin ='2' where id = '"
               +dto.getId()+"' AND fstLogin ='1'";
               

   
               
         System.out.println(sql);
         
         try {
            res = stmt.executeUpdate(sql);
         
         } catch (Exception e) {
            e.printStackTrace();

         }finally {
            close();
         }

         return res;
      }
   
   
   public int modify2(PlayerInfoDTO dto){  //게임종료 젤리 개수 update
         int res = 0;
         
         sql = "update playerinfo set jelly = "
              +dto.getJelly()+ " where id = '"
               +dto.getId()+"' ";                


               
         System.out.println(sql);
         
         try {
            res = stmt.executeUpdate(sql);
         
         } catch (Exception e) {
            e.printStackTrace();

         }finally {
            close();
         }

         return res;
      }
   
   public int modify3(PlayerInfoDTO dto){  //게임종료 젤리 개수 update
       int res = 0;
       
       sql = "update playerinfo set ipnum = '"
             +dto.getIpNum()+ "' where id = '"
             +dto.getId()+"' ";                


             
       System.out.println(sql);
       
       try {
          res = stmt.executeUpdate(sql);
       
       } catch (Exception e) {
          e.printStackTrace();

       }finally {
          close();
       }

       return res;
    }

      
      public PlayerInfoDTO fstLogin(PlayerInfoDTO dto){  //추가          
          
          sql = "select fstLogin from playerinfo where "+ 
                "id ='"+dto.getId()+"'";
                
          System.out.println(sql);
          
          try {             
             rs = stmt.executeQuery(sql);   
             
             if (rs.next()) {
                dto.setFstLogin(rs.getString("fstLogin"));   
             }        
          
          } catch (Exception e) {
             e.printStackTrace();

          }finally {
             close();
          }

          return dto;
       }
      
      public PlayerInfoDTO ipFind(PlayerInfoDTO dto){  //추가          
          
          sql = "select ipnum from playerinfo where "+ 
                "id ='"+dto.getId()+"'";
                
          System.out.println(sql);
          
          try {             
             rs = stmt.executeQuery(sql);   
             
             if (rs.next()) {
                dto.setIpNum(rs.getString("ipnum"));   
             }        
          
          } catch (Exception e) {
             e.printStackTrace();

          }finally {
             close();
          }

          return dto;
       }
      

      
      
      public void close() {
          if(rs!=null) try {rs.close();} catch (Exception e) {}
          if(stmt!=null) try {stmt.close();} catch (Exception e) {}
          if(con!=null) try {con.close();} catch (Exception e) {}
    }

}