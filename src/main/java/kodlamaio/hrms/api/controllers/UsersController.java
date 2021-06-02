package kodlamaio.hrms.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.businness.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Job;
import kodlamaio.hrms.entities.concretes.User;
@RestController
@RequestMapping("api/users")
public class UsersController {
	
	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		this.userService=userService;
	
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}
	@PostMapping("add")
	public ResponseEntity<?> add(@Valid @RequestBody User user) {
		return ResponseEntity.ok(this.userService.add(user));
		}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions ){
		Map<String,String> validationErrors=new HashMap<String, String>();
		
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
			
		}
		
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors,"Dogrulama hatalari : ");
		return errors;
	}
//git ogrenildi.
}
