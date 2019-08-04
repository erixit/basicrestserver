package com.erixit.basicrestserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/clientmanager")
@CrossOrigin
public class ClientManagerResource {

	@Autowired
	private ClientManager clientManager;

	@PutMapping(value = "/reset")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void reset() {
		clientManager.reset();
	}

	@GetMapping(value = "/verify")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Boolean verify() {
		return Boolean.TRUE;

	}

}