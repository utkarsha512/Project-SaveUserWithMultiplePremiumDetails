package com.velocity.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.PremiumDetails;
import com.velocity.model.User;
import com.velocity.service.PremiumDetailsService;
import com.velocity.service.UserService;

@RestController
public class MyController {
	@Autowired
	private UserService userService;
	@Autowired
	private PremiumDetailsService premiumDetailsService;
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
	User user1= userService.saveUser( user);
	List<PremiumDetails> list=user.getPremiumDetailsList();
	for (PremiumDetails premiumDetails : list) {
		premiumDetails.setUserid(user.getId());
		 premiumDetailsService.savePremiumDetails(premiumDetails);
		
	}
	return user1;

}
}
 