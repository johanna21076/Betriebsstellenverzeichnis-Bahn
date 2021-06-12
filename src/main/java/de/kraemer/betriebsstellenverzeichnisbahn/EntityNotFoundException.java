package de.kraemer.betriebsstellenverzeichnisbahn;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND,reason ="abk not in csv-file")
public class EntityNotFoundException extends RuntimeException {

}
