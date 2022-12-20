package in.emps.profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.emps.profile.enitty.Employee;
import in.emps.profile.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> respondAllEmps(){
		return ResponseEntity.ok(empService.getAll());
	}
	
	@GetMapping("/{eid}")
	public ResponseEntity<Employee> respondEmpById(@PathVariable(name="eid")long employeeId){
		Employee emp = empService.getById(employeeId);
		return emp==null? ResponseEntity.notFound().build():ResponseEntity.ok(emp);
	}
	
	@DeleteMapping("/{eid}")
	public ResponseEntity<Void> respondDeletedEmpById(@PathVariable(name="eid")long id){
		ResponseEntity<Void> resultantResponse;
		if(empService.existsById(id)) {
			resultantResponse =ResponseEntity.notFound().build(); 
		}else {
			empService.deleteById(id);
			resultantResponse =new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return resultantResponse;
	}
	
	@PostMapping
	public ResponseEntity<Employee> respondAddEmployee(@RequestBody Employee emp){
		ResponseEntity<Void> resultantResponse;
		emp = empService.save(emp);
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);		
	}
	
	@PutMapping
	public ResponseEntity<Employee> respondUpdatedEmployee(@RequestBody Employee emp){
		ResponseEntity<Void> resultantResponse;
		emp = empService.save(emp);
		return new ResponseEntity<Employee>(emp,HttpStatus.ACCEPTED);		
	}
}
