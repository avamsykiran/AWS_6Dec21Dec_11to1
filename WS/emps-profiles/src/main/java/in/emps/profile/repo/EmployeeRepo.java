package in.emps.profile.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.emps.profile.enitty.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
