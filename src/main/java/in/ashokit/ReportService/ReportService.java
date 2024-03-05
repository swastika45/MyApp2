package in.ashokit.ReportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.ReportDao;
@Service
public class ReportService {
	private  ReportDao dao;
	@Autowired
	public void setDao(ReportDao dao) {
		this.dao = dao;
	}
	
	public void printName(Integer userId) {
		
		String nameId=dao.getNameById(userId);
		System.out.println(nameId);
	}

}
