package com.despegar.hf.echo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.despegar.hf.echo.service.EchoService;

@Controller
public class EchoController {

    private EchoService echoService;

    @RequestMapping(value = "/echo/{msg}", method = RequestMethod.GET)
    public ResponseEntity<String> echo(@PathVariable("msg") String message) {
        String result = this.echoService.echo(message);
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/setContent/{id}/{msg}", method = RequestMethod.GET)
    public ResponseEntity<String> setContent(@PathVariable("id") String id, @PathVariable("msg") String message) {
        this.echoService.setContent(id, message);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = "/echoEnhanced/{id}/{msg}", method = RequestMethod.GET)
    public ResponseEntity<String> echoEnhanced(@PathVariable("id") String id, @PathVariable("msg") String message) {
        String resultenhanced = this.echoService.echoEnhanced(id, message);
        return new ResponseEntity<String>(resultenhanced, HttpStatus.OK);
    }


    public EchoService getEchoService() {
        return this.echoService;
    }

    public void setEchoService(EchoService echoService) {
        this.echoService = echoService;
    }
}
