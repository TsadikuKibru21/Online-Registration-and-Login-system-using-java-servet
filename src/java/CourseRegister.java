
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

public class CourseRegister extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
 
               String stud_id = request.getParameter("stud_id");
   String Automata = request.getParameter("Automata");
      String AdvancedProgramming = request.getParameter("AdvancedProgramming");
      String AssemblyLanguage = request.getParameter("AssemblyLanguage");
      String NumericalAnalaysis = request.getParameter("NumericalAnalaysis");
      String OperatingSystem = request.getParameter("OperatingSystem");
       String SoftwareEngineering = request.getParameter("SoftwareEngineering");
       
       
      double str1 = Double.parseDouble(Automata);
       double str2 = Double.parseDouble(AdvancedProgramming);
       double str3 = Double.parseDouble(AssemblyLanguage);
       double str4 = Double.parseDouble(NumericalAnalaysis);
       double str5 = Double.parseDouble(OperatingSystem);
       double str6 = Double.parseDouble(SoftwareEngineering);
       double tot=0;
       double [] ab={str1,str2,str3,str4,str5,str6};
       
       
        if(str1>=85){
          ab[0]=4.0;  
       }
        else if(str1>=80&&str1<85){
          ab[0]=3.75;  
       }
        else if(str1>=75&&str1<80){
          ab[0]=3.5;  
       }
        else if(str1>=70&&str1<75){
          ab[0]=3.0;  
       }
       else  if(str1>=65&&str1<70){
          ab[0]=2.75;  
       }
        else if(str1>=60&&str1<65){
          ab[0]=2.5;  
       }
    
        else if(str1>=50&&str1<60){
          ab[0]=2.0;  
       }
        else if(str1>=45&&str1<50){
          ab[0]=1.75;  
       }
        else if(str1>=40&&str1<45){
          ab[0]=1.0;  
       }
        else if(str1<40){
          ab[0]=0;  
       }
       
 
             if(str2>=85){
          ab[1]=4.0;  
       }
        else if(str2>=80&&str2<85){
          ab[1]=3.75;  
       }
        else if(str2>=75&&str2<80){
          ab[1]=3.5;  
       }
        else if(str2>=70&&str2<75){
          ab[1]=3.0;  
       }
       else  if(str2>=65&&str2<70){
          ab[1]=2.75;  
       }
        else if(str2>=60&&str2<65){
          ab[1]=2.5;  
       }
        
              else if(str2>=50&&str2<60){
          ab[1]=2.0;  
       }
        else if(str2>=45&&str2<50){
          ab[1]=1.75;  
       }
        else if(str2>=40&&str2<45){
          ab[1]=1.0;  
       }
        else if(str2<40){
          ab[1]=0;  
       }
             
             
             
             
                   if(str3>=85){
          ab[2]=4.0;  
       }
        else if(str3>=80&&str3<85){
          ab[2]=3.75;  
       }
        else if(str3>=75&&str3<80){
          ab[2]=3.5;  
       }
        else if(str3>=70&&str3<75){
          ab[2]=3.0;  
       }
       else  if(str3>=65&&str3<70){
          ab[2]=2.75;  
       }
        else if(str3>=60&&str3<65){
          ab[2]=2.5;  
       }
       
        else if(str3>=50&&str3<60){
          ab[2]=2.0;  
       }
        else if(str3>=45&&str3<50){
          ab[2]=1.75;  
       }
        else if(str3>=40&&str3<45){
          ab[2]=1.0;  
       }
        else if(str3<40){
          ab[2]=0;  
       }          
                   
                   
                         if(str4>=85){
          ab[3]=4.0;  
       }
        else if(str4>=80&&str4<85){
          ab[3]=3.75;  
       }
        else if(str4>=75&&str4<80){
          ab[3]=3.5;  
       }
        else if(str4>=70&&str4<75){
          ab[3]=3.0;  
       }
       else  if(str4>=65&&str4<70){
          ab[3]=2.75;  
       }
        else if(str4>=60&&str4<65){
          ab[3]=2.5;  
       }
              else if(str4>=50&&str4<60){
          ab[3]=2.0;  
       }
        else if(str4>=45&&str4<50){
          ab[3]=1.75;  
       }
        else if(str4>=40&&str4<45){
          ab[3]=1.0;  
       }
        else if(str4<40){
          ab[3]=0;  
       }
                         
                         
                         
                         
                               if(str5>=85){
          ab[4]=4.0;  
       }
        else if(str5>=80&&str5<85){
          ab[4]=3.75;  
       }
        else if(str5>=75&&str5<80){
          ab[4]=3.5;  
       }
        else if(str5>=70&&str5<75){
          ab[4]=3.0;  
       }
       else  if(str5>=65&&str5<70){
          ab[4]=2.75;  
       }
        else if(str5>=60&&str5<65){
          ab[4]=2.5;  
       }
              else if(str5>=50&&str5<60){
          ab[4]=2.0;  
       }
        else if(str5>=45&&str5<50){
          ab[4]=1.75;  
       }
        else if(str5>=40&&str5<45){
          ab[4]=1.0;  
       }
        else if(str5<40){
          ab[4]=0;  
       }
       
  if(str6>=85){
          ab[5]=4.0;  
       }
        else if(str6>=80&&str6<85){
          ab[5]=3.75;  
       }
        else if(str6>=75&&str6<80){
          ab[5]=3.5;  
       }
        else if(str6>=70&&str6<75){
          ab[5]=3.0;  
       }
       else  if(str6>=65&&str6<70){
          ab[5]=2.75;  
       }
        else if(str6>=60&&str6<65){
          ab[5]=2.5;  
       }
              else if(str6>=50&&str6<60){
          ab[5]=2.0;  
       }
        else if(str6>=45&&str6<50){
          ab[5]=1.75;  
       }
        else if(str6>=40&&str6<45){
          ab[5]=1.0;  
       }
        else if(str6<40){
          ab[5]=0;  
       }
  
  
  
  
       
       for(int i=0;i<6;i++){
           
           tot=tot+ab[i];
       }
       
    Double tr=tot/6;
       

       

        try {
               
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            out.print("You are connected successfully ...");
            PreparedStatement ps = con.prepareStatement("insert into course values(?,?,?,?,?,?,?,?)");
            ps.setString(1, stud_id);
            ps.setString(2, Automata);
            ps.setString(3, AdvancedProgramming);
            ps.setString(4, AssemblyLanguage);
            ps.setString(5, NumericalAnalaysis);
            ps.setString(6, OperatingSystem);
            ps.setString(7, SoftwareEngineering);
            ps.setDouble(8, tr);
              if(stud_id.equals("")||Automata.equals("")||AdvancedProgramming.equals("")||AssemblyLanguage.equals("")||NumericalAnalaysis.equals("")||OperatingSystem.equals("")||SoftwareEngineering.equals(""))
      {
         JOptionPane.showMessageDialog(null, "every field is required");
      }

          ps.execute();
        out.print("You are inserted successfully ...");

                /* Printing column names */
      

        
        
        
        }catch (Exception e2) {
            System.out.println(e2);
        }

        out.close();
    }



}
