package br.gov.sp.fatecsjc.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.gov.sp.fatecsjc.services.exception.AuthorizationException;
import br.gov.sp.fatecsjc.services.exception.DataIntegrityException;
import br.gov.sp.fatecsjc.services.exception.ObjectNotFoundException;


@ControllerAdvice
public class ResourceExceptionHandler {
	
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandartError> objectNotFound(ObjectNotFoundException error, 
														HttpServletRequest request){
		
		
		StandartError standartError = new StandartError(System.currentTimeMillis(), 
														HttpStatus.NOT_FOUND.value(), 
														"Não Encontrado", 
														error.getMessage(), 
														request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standartError);
		
	}
	
	
	
	@ExceptionHandler(DataIntegrityException.class)
	public ResponseEntity<StandartError> dataIntegrityException(DataIntegrityException error,
																HttpServletRequest request){
		
		
		StandartError standartError = new StandartError(System.currentTimeMillis(), 
														HttpStatus.BAD_REQUEST.value(), 
														"Integridade de Dados", 
														error.getMessage(), 
														request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(standartError);
	}
	
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<StandartError> validation(MethodArgumentNotValidException error,
										  HttpServletRequest request){
		
		ValidatationError validatationError = new ValidatationError(System.currentTimeMillis(), 
																	HttpStatus.UNPROCESSABLE_ENTITY.value(), 
																	"Erro de Validação", 
																	error.getMessage(), 
																	request.getRequestURI());
		
		
		for(FieldError fieldError: error.getBindingResult().getFieldErrors()) {
			validatationError.addError(fieldError.getField(), fieldError.getDefaultMessage());
		}

		
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(validatationError);
		
	}
	
	
	
	@ExceptionHandler(AuthorizationException.class)
	public ResponseEntity<StandartError> authorization(AuthorizationException error, 
														HttpServletRequest request){
		
		
		StandartError standartError = new StandartError(System.currentTimeMillis(), 
														HttpStatus.FORBIDDEN.value(), 
														"Acesso Negado", 
														error.getMessage(), 
														request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(standartError);
		
	}
	
	
	
	
}
