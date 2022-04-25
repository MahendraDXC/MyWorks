import java.sql.*;
import java.io.*;
public class SelectAllRowsToHtmlDemo 
{
	public static void main(String[] args) throws Exception
	{
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="scott";
		String pwd="tiger";
		String sqlQuery="select * from employees";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(sqlQuery);
		String data="";
		data = data+"<html><body bgcolor='green' text='white'><center><table border='2' >";
		data=data+"<tr><td>ENO</td><td>ENAME</td><td>ESAL</td><td>EADDR</td></tr>";
		while(rs.next())
		{
			data=data+"<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getDouble(3)+"</td><td>"+rs.getString(4)+"</td></tr>";
		}
		data=data+"</table></center></body></html>";
		FileOutputStream fos = new FileOutputStream("emp.html");
		byte[] b = data.getBytes();
		fos.write(b);//write byte[] to html
		fos.flush();
		System.out.println("Open emp.html to get Employees data");
		fos.close();
		con.close();
	}
}
