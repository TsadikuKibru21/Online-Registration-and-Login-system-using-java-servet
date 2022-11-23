
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.util.logging.Level" %>
<%@page import="java.util.logging.Logger" %>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.util.ArrayList" %>
  
<html>
    <head>    
        <title>Student Registration Form</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        </head>
    <body>
   
    <div class="form-group col-12 p-0">
        

</div>
        
        <form id="form" method="post" action="servlet/CourseRegister" class="form-horizontal">
        
            <div class="form-group">
                <div  class="col-sm-4"></div>
                <div  class="col-sm-4">
                    <h2 style="text-align: center">course Details</h2>
                </div>
            </div>
            <hr/>
            <div class="form-group">
                 <div  class="col-sm-4"></div>
                  <div  class="col-sm-4 mx-auto">
                   <label>stud_ID</label>
   <input type="text" name="stud_id" class="form-control" id="sid">
                  </div>
</div>
<div class="form-group">
                 <div  class="col-sm-4"></div>
                  <div  class="col-sm-4 mx-auto">
                   <label > Automata</label>
   <input type="text" name="Automata" class="form-control" id="a">
                  </div>
</div>
<div class="form-group">
                 <div  class="col-sm-4"></div>
                  <div  class="col-sm-4 mx-auto">
                   <label>AdvancedProgramming</label>
   <input type="text" name="AdvancedProgramming" class="form-control" id="b">
                  </div>
</div>
<div class="form-group">
                            <div  class="col-sm-4"></div>
                            <div  class="col-sm-4 mx-auto">
                                        <label>AssemblyLanguage</label>
   <input type="text" name="AssemblyLanguage" class="form-control" id="c">
                            </div>
</div>
            <div class="form-group">
                            <div  class="col-sm-4"></div>
                            <div  class="col-sm-4 mx-auto">
                                        <label>NumericalAnalaysis</label>
   <input type="text" name="NumericalAnalaysis" class="form-control" id="d">
                            </div>
            </div><!-- comment -->
            <div class="form-group">
                            <div  class="col-sm-4"></div>
                            <div  class="col-sm-4 mx-auto">
                                        <label>OperatingSystem</label>
   <input type="text" name="OperatingSystem" class="form-control" id="e">
                            </div>
</div>
            <div class="form-group">
                            <div  class="col-sm-4"></div>
                            <div  class="col-sm-4 mx-auto">
                                        <label>SoftwareEngineering</label>
   <input type="text" name="SoftwareEngineering" class="form-control" id="f">
                            </div>
</div>

            <br/>
            
            <div class="form-group" align="right">
            
                <div class="col-sm-6">
                    <div class="col-sm-2">
                        <Button class="btn btn-success" style="width: 80px;">Submit</Button>
                      
                    </div>
                    <div class="col-sm-4">
                    </div>
                    
                </div>
            </div>
            
        </form>
        <div class="col-sm-12"  align="top">
            <a href="index.jsp"><Button class="btn btn-success" style="width: 80px;">Home</Button></a>
             <a href="adminWork.jsp"><Button class="btn btn-success" style="width: 80px;">BACK</Button></a>
        </div>
    </body>
    
    <script>

        
        </script>
    
    
</html>