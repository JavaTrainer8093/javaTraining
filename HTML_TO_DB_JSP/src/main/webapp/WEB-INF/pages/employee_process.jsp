<%@page  import="java.sql.*"   %>

<%!
  private Connection con;
  private  PreparedStatement ps1,ps2;
 public void jspInit(){
   
      ServletConfig cg=getServletConfig();
    //read  jsp init param values
    String driver=cg.getInitParameter("driver");
    String url=cg.getInitParameter("url");
    String user=cg.getInitParameter("username");
    String pwd=cg.getInitParameter("pwd");
    try{
     //Load  JDBC driver class
      Class.forName(driver);
     //establish the connection
     con=DriverManager.getConnection(url,user,pwd);
     //create PreparedStatement objs
      ps1=con.prepareStatement("INSERT INTO JSP_EMPLOYEE VALUES(?,?,?)");
      ps2=con.prepareStatement("SELECT  EMPNAME,EMPADDRS,SALARY  FROM  JSP_EMPLOYEE");
    }//try
    catch(SQLException se){
    	se.printStackTrace();
    }
    catch(ClassNotFoundException cnf){
    	cnf.printStackTrace();
    }
    catch(Exception e){
    	e.printStackTrace();
    }
  } %>
  
  <%
     // read s1 req pram value to know wheather request has come from submit button or hyperlink
        String  s1Val=request.getParameter("s1");
        if(s1Val.equalsIgnoreCase("register")){
        	//read form data
        	   String name=request.getParameter("ename");
        	   String addrs=request.getParameter("eadd");
        	   Integer salary=Integer.parseInt(request.getParameter("esal"));
        	   //set values to INSERT Query params
        	   ps1.setString(1,name);
        	   ps1.setString(2,addrs);
        	   ps1.setFloat(3,salary);
        	   //execute query
        	   int result=ps1.executeUpdate();
        	   //process the results
        	  if(result==1){  %>
        		    <h1 style="color:green;text-align:center">Employee registered </h1>
        	<%  }//if
        	  else {  %>
        		    <h1 style="color:red;text-align:center">Employee not registered </h1>
        	<%  }//else 
        }//if
        else{
        	
        	ResultSet rs=ps2.executeQuery();
        	%>
        	 <table  border="1"  bgcolor="pink"  align="center">
        	      <tr>   <th>EmpName  </th> <th>EmpAddrs</th> <th>EmpSalary</th> </tr> 
        	
        	<% while(rs.next()){ %>
        		  <tr>
        		  
        		   <td><%=rs.getString(1)%>   </td>
        		   <td><%=rs.getString(2)%>   </td>
        		   <td><%=rs.getInt(3)%>   </td>
        		</tr>
        	   <%  }//while
        	%>
        	  </table>  
      <%  }//else
    %>
          <br><br>
             <a href="Employee_form.html">home</a>
             
  
  <%! public void jspDestroy(){
        try{
        	if(ps1!=null)
        		ps1.close();
        }
        catch(SQLException se){
        	se.printStackTrace();
        }
        try{
        	if(ps2!=null)
        		ps2.close();
        }
        catch(SQLException se){
        	se.printStackTrace();
        }
        
        try{
        	if(con!=null)
        		con.close();
        }
        catch(SQLException se){
        	se.printStackTrace();
        }
        
	  
    } %>