package com.ndeta.rest_api_task_euas.controller;

import com.ndeta.rest_api_task_euas.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
   @PostMapping("/person")
   public ResponseEntity<Person>createPerson(@RequestBody Person person){
       String fullName= person.getFirstName()+ " " + person.getLastName();
       person.setFullName(fullName);
       return new ResponseEntity<>(person, HttpStatus.OK);
   }
}
