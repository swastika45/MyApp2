package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDao {
	
	public String getNameById(Integer userId) {
		if(userId==100) {
			return "John";
		}else if(userId==101) {
			return "Smith";
		}
		else {
			return "name not found";
		}
	
		
	}

}
