package in.emps.profile.service;

import java.util.List;

import in.emps.profile.enitty.Employee;

public interface EmployeeService {
	List<Employee> getAll();
	Employee getById(Long employeeId);
	boolean existsById(Long id);
	Employee save(Employee emp);
	void deleteById(Long id);
}
