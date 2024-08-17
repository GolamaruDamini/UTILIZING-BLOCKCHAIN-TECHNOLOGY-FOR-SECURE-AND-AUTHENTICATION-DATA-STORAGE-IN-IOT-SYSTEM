
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;
 
public class Time_Delay_Results {
    public static void main(String[] args) {
        
    

 int count=0;
 int count1=0;
 
  double c1=0.0;
  double c2=0.0;
  double c3=0.0;
  double c4=0.0;
  double c5=0.0;
  double c6=0.0;
  double c7=0.0;
  double c8=0.0;

  

    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
		        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blockchainnetwork","root", "root");
		System.out.println("Connected");
    		Statement st=con.createStatement();
    		
    		ResultSet rs=st.executeQuery("select * from TDelay");
    		
    		
    		while(rs.next()==true)
    		{
    			
    			
    		count++;

			if(count==1)
			{
    			
    				c1=Double.valueOf(rs.getString("Delay"));	
			 }   			
    		if(count==2)
			{
    				c2=Double.valueOf(rs.getString("Delay"));	
    			
    		}
    			
    		if(count==3)
			{
    				c3=Double.valueOf(rs.getString("Delay"));	
    			
    		}
    		if(count==4)
			{
    				c4=Double.valueOf(rs.getString("Delay"));	
    			
    		}
    		if(count==5)
			{
    				c5=Double.valueOf(rs.getString("Delay"));	
    			
    		}
    		if(count==6)
			{
    				c6=Double.valueOf(rs.getString("Delay"));	
    			
    		}
    		if(count==7)
			{
    				c7=Double.valueOf(rs.getString("Delay"));	
    			
    		}
    		if(count==8)
			{
    				c8=Double.valueOf(rs.getString("Delay"));	
    			
    		}
    			
    		}

    		DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
    	        dataSet.setValue(c1, "1st Transaction", "1T");
    	        dataSet.setValue(c2, "2nd Transaction", "2T");
    	        dataSet.setValue(c3, "3rd Transaction", "3T");
    	        dataSet.setValue(c4, "4th Transaction", "4T");
    	        dataSet.setValue(c5, "5th Transaction", "5T");
    	        dataSet.setValue(c6, "6th Transaction", "6T");
    	        dataSet.setValue(c7, "7th Transaction", "7T");
    	        dataSet.setValue(c8, "8th Transaction", "8T");


	

    	      
    	 
    	        JFreeChart chart = ChartFactory.createBarChart(
    	                "Block chain-based data storage with privacy and authentication in IOT", "Transaction Category", "Time Delay",
    	                dataSet, PlotOrientation.VERTICAL, true, true, true);
    	 
    	      
    	        ChartFrame chartFrame=new ChartFrame("Different Transaction Time Delay",chart);
    	        chartFrame.setVisible(true);
    	     
    	        chartFrame.setSize(800,500);
    	        
        
    	}
    	catch(Exception ex)
    	{
    	System.out.println(ex);	
    		
    	}
    
}
}