package br.com.Parte.controller;

import br.com.Parte.controller.request.ContatoRequest;
import br.com.Parte.domain.service.ContatoServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/contato")
public class ContatoController {
    @Autowired
    private ContatoServiceImpl contatoService;

    @PostMapping
    public ResponseEntity save(@RequestBody ContatoRequest request){
        log.info("M save, request={}", request);
        return ResponseEntity.ok(contatoService.save(request.toEntity()));
    }

    @GetMapping(path = "/{name}")
    public ResponseEntity getByName(@PathVariable("name") String name){
        log.info("M getByName, name={}", name);
        return ResponseEntity.ok(contatoService.getByName(name));
    }

    @GetMapping
    public ResponseEntity getAll(){
        log.info("M getAll, NEW");
        return ResponseEntity.ok(contatoService.getAll());
    }

}
