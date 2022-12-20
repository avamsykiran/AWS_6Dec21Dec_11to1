package in.emps.profile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.emps.profile.enitty.Employee;
import in.emps.profile.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public List<Employee> getAll() {
		return empRepo.findAll();
	}

	@Override
	public Employee getById(Long employeeId) {
		return empRepo.findById(employeeId).orElse(null);
	}

	@Override
	public boolean existsById(Long id) {
		return empRepo.existsById(id);
	}

	@Override
	public Employee save(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public void deleteById(Long id) {
		empRepo.deleteById(id);
	}

}
