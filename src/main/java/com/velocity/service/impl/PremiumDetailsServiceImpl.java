package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.PremiumDetails;
import com.velocity.repository.PremiumDetailsRepository;
import com.velocity.service.PremiumDetailsService;
@Service
public class PremiumDetailsServiceImpl implements PremiumDetailsService {
	@Autowired
	private PremiumDetailsRepository premiumDetailsRepository;

	@Override
	public PremiumDetails savePremiumDetails(PremiumDetails premiumDetails) {
		// TODO Auto-generated method stub
		return premiumDetailsRepository.save(premiumDetails);
	

}
}