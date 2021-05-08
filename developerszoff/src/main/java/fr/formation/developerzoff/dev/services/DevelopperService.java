package fr.formation.developerzoff.dev.services;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import domain.MyDevelloper;
@Component
public class DevelopperService {
	private int developperIdCount = 1;
	private List <MyDevelloper> developerList = new CopyOnWriteArrayList<>();
	public MyDevelloper addDevelopper(MyDevelloper developer){
		developer.setDevelopperid(developperIdCount);
		developerList.add(developer);
		developperIdCount++;
		return developer;
	}

	public List<MyDevelloper> getDevelopers(){
		return developerList;
	}
	
	public MyDevelloper getDevelopper(int developperid) {
		return developerList
		.stream()
		.filter(c -> c.getDevelopperid() == developperid)
		.findFirst()
		.get();
	}
	
	public MyDevelloper updateDevelopper (int developperid , MyDevelloper developer) {
		
developerList
				.stream()
				.forEach(c -> {
					if (c.getDevelopperid()== developperid) {
						
						c.setFirstName(developer.getFirstName());
						c.setLastName(developer.getLastName());
						c.setNickName(developer.getNickName());
					}
				})
				;
		return developerList
				.stream()
				.filter(c -> c.getDevelopperid() == developperid)
				.findFirst()
				.get();
	}
	
	
	public void deleteDevelopper(int developperid){
		
		developerList
		.stream()
		.forEach(c -> {
			if ( c.getDevelopperid() == developperid) {
				developerList.remove(c);
			}
		});
	}
}
