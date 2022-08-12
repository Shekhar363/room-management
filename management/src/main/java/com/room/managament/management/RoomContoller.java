package com.room.managament.management;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomContoller 
{
	@Autowired
	RoomRepositry er;
	@PostMapping("/saveRoommangement")
	public Roommangement saveRoommangement(@RequestBody Roommangement roommangement)
	{
		Roommangement roommangement1=er.save(roommangement);
		return roommangement1;
	}
	//update data
	public List<Roommangement> getRoommangements()
	{
		return er.findAll();
	}
	

}
