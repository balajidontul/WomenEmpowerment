package com.team6.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team6.model.ProjectInCharge;
import com.team6.repository.ProjectInchargeRepository;


@Service
@Transactional
public class ProjectInchargeServiceImpl implements ProjectInchargeService
{
	
	@Autowired
	ProjectInchargeRepository inchargerepo;
	
	@Override
	public List<ProjectInCharge> getAllIncharge()
	{
		return inchargerepo.findAll();
	}
	
	@Override
	public boolean addIncharge(ProjectInCharge newincharge)
	{
		inchargerepo.save(newincharge);
		return true;
	}
	
	@Override
	public boolean updIncharge(ProjectInCharge incharge)
	{
		ProjectInCharge updincharge = inchargerepo.findById(incharge.getProjectid()).get();
		updincharge=incharge;
		inchargerepo.save(incharge);
		return true;
	}
	
	@Override
	public boolean delIncharge(ProjectInCharge incharge)
	{
		inchargerepo.delete(incharge);
		return true;
	}

}
