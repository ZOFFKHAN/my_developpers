package fr.formation.developerzoff.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.MyDevelloper;
import fr.formation.developerzoff.dev.services.DevelopperService;

@RestController
@RequestMapping(value = "/developers")
public class DevelopperController {

    @Autowired
    private DevelopperService developperService;

    @PostMapping
    public MyDevelloper adddevelopper(@RequestBody MyDevelloper developer) {
	System.out.println(developer);
	return developperService.addDevelopper(developer);
    }

    @GetMapping
    public List<MyDevelloper> getDeveloper() {
	return developperService.getDevelopers();
    }

    @GetMapping(value = "/{developperid}")
    public MyDevelloper getDevelopper(@PathVariable("developperid") int developperid) {
	return developperService.getDevelopper(developperid);
    }

    @PutMapping(value = "/{developperid}")
    public MyDevelloper updateDevelopper(@PathVariable("developperid") int developperid,
	    @RequestBody MyDevelloper developer) {
	return developperService.updateDevelopper(developperid, developer);
    }

//10 not working
    @DeleteMapping("/{developperid}")
    public void delDevelopper(@PathVariable("developperid") int developperid) {
	developperService.deleteDevelopper(developperid);
    }

}
