/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import exception.EventDetailsNotFoundException;
import exception.EventFrequencyAlreadyExistsException;
import exception.EventFrequencyNotFoundException;
import exception.EventStatusAlreadyExistsException;
import exception.EventStatusNotFoundException;
import exception.EventTypeAlreadyExistsException;
import exception.EventTypeNotFoundException;
import exception.NoDataAvailableException;

import org.springframework.hateoas.VndErrors;

/**
 * @author Billy Bissic
 *
 */
@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class EventManagementControllerAdvice {
	
	@ResponseBody
	@ExceptionHandler(EventDetailsNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors eventDetailsNotFoundException(EventDetailsNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventStatusNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors eventStatusNotFoundException(EventStatusNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventTypeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors eventTypeNotFoundException(EventTypeNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventFrequencyNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors eventFrequencyNotFoundException(EventFrequencyNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventStatusAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors eventStatusNotFoundException(EventStatusAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventTypeAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors eventTypeNotFoundException(EventTypeAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(EventFrequencyAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors eventFrequencyAlreadyExistsException(EventFrequencyAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(NoDataAvailableException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors noDataAvailableException(NoDataAvailableException ex) {
		return new VndErrors("error", ex.getMessage());
	}
}
