package com.team6.service;

import java.util.List;

import com.team6.model.ProjectInCharge;

public interface ProjectInchargeService
{
	
	public List<ProjectInCharge> getAllIncharge();
	public boolean addIncharge(ProjectInCharge newincharge);
	public boolean updIncharge(ProjectInCharge incharge);
	public boolean delIncharge(ProjectInCharge incharge);

}
