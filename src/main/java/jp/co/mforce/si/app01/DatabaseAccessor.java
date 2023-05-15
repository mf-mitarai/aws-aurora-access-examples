package jp.co.mforce.si.app01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseAccessor implements ApplicationRunner  {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(employeeRepository.findAll());
	}

}
