package handeling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EventDBUtil {
	
	private static boolean isSuccess;
	private static Connection con=null;
	private static Statement stmt =null;
	private static ResultSet rs =null;
	
	
	private static final String InsertEventSQL = "insert into event" +"(title,cusid,type,location,date,stime,etime,pid) values" + "( ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String SelectEventSQL = "select * from event";
	private static final String MyEventSQL = "select  title,type,location,date,stime,etime,pid from event where cusid=?";
	private static final String UpdateEventSQL = "update event set date=?, stime=?,etime=? where eid=?";
	private static final String DeleteEventSQL ="delete from event where eid=?";
	
	// create validate method
		public static boolean validate(String email, String password) {
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from cutomer where email='"+email+"' and password='"+password+"'";
				rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					isSuccess=true;
				}else {
					isSuccess=false;
				}			
			}catch(Exception e) {
				e.printStackTrace(); //track the error
			}		
			return isSuccess;
		}
		
		// retrieve customer data
		public static List<Customer> getCustomer(String Email){
			ArrayList<Customer> customer= new ArrayList<>();
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from cutomer where email='"+Email+"' '";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int cusid= rs.getInt(1);
					String cusname =rs.getString(2);
					String password =rs.getString(3);
					String email =rs.getString(4);
					String phone =rs.getString(5);
					String nic =rs.getString(6);				
					
					Customer cus= new Customer(cusid,cusname,password,email,phone,nic);
					customer.add(cus);
				}
							
			}catch(Exception e) {
				e.printStackTrace(); //track the error
			}
			return customer;
		}
		
	//insert event
		public static boolean insertevent(String title, int cusid, String type, String location,String date, String stime, String etime, String pid) {
			isSuccess=false;
			
			try {
				con =DBConnect.getConnection();
				stmt = con.createStatement();
				String sql="insert into event values (0,'"+title+"','"+cusid+"','"+type+"','"+location+"','"+date+"','"+stime+"','"+etime+"','"+pid+"' ) ";
				int rs = stmt.executeUpdate(sql);
				
				if(rs>0) {
					isSuccess=true;
				}else {
					isSuccess=false;
				}
				
			}catch(Exception e) {
				e.printStackTrace(); // display error
			}
			
			return isSuccess;
		}
	//update event
	//select event by customer
	//select events
	//delete event
}
