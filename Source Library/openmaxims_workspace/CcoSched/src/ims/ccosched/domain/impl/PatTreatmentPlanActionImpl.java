//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Sean Nesbitt using IMS Development Environment (version 1.80 build 4198.17562)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.ccosched.domain.impl;

import ims.ccosched.domain.base.impl.BasePatTreatmentPlanActionImpl;
import ims.ccosched.vo.PatTreatPlanActionVo;
import ims.ccosched.vo.PatTreatPlanActionVoCollection;
import ims.ccosched.vo.PatTreatmentPlanLiteVo;
import ims.ccosched.vo.PatTreatmentPlanVo;
import ims.ccosched.vo.domain.PatTreatPlanActionVoAssembler;
import ims.ccosched.vo.domain.PatTreatmentPlanVoAssembler;
import ims.ccosched.vo.lookups.AppointmentStatus;
import ims.ccosched.vo.lookups.TechniquesCollection;
import ims.core.resource.people.domain.objects.Hcp;
import ims.core.resource.people.domain.objects.Medic;
import ims.core.vo.HcpLiteVoCollection;
import ims.core.vo.domain.HcpLiteVoAssembler;
import ims.core.vo.lookups.HcpDisType;
import ims.core.vo.lookups.MedicGrade;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UnqViolationUncheckedException;
import ims.domain.lookups.LookupMapping;
import ims.dto_move.domain.objects.Appointment;
import ims.dto_move.domain.objects.AppointmentDetail;
import ims.dtomove.vo.ActionVoCollection;
import ims.dtomove.vo.ActivityActionVoCollection;
import ims.dtomove.vo.ActivityGroupVoCollection;
import ims.dtomove.vo.GroupSiteVoCollection;
import ims.dtomove.vo.GroupVoCollection;
import ims.dtomove.vo.SchedActivityVoCollection;
import ims.dtomove.vo.domain.ActionVoAssembler;
import ims.dtomove.vo.domain.ActivityActionVoAssembler;
import ims.dtomove.vo.domain.ActivityGroupVoAssembler;
import ims.dtomove.vo.domain.GroupVoAssembler;
import ims.dtomove.vo.domain.SchedActivityVoAssembler;
import ims.oncology.domain.objects.PatAction;
import ims.oncology.domain.objects.PatTreatmentPlan;
import ims.oncology.vo.domain.TreatmentGroupTechniqueConfigVoAssembler;
import ims.oncology.vo.lookups.TreatmentGroupSite;
import ims.vo.LookupInstVo;
import ims.vo.LookupMappingVo;
import ims.vo.LookupMappingVoCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PatTreatmentPlanActionImpl extends BasePatTreatmentPlanActionImpl
{

	private static final long serialVersionUID = 1L;

	public HcpLiteVoCollection listConsultants() 
	{
		DomainFactory factory = getDomainFactory();
		
		List hcps = null;
		String hql = "";
		ArrayList markers = new ArrayList();
		ArrayList values = new ArrayList();	
		StringBuffer condStr = new StringBuffer();
	
		//wdev-13667
		hql = " select hp from StaffActivity as s1_1 left join s1_1.mos as m1_1 left join m1_1.hcp as hp ";

		condStr.append(" s1_1.active =:active");
		markers.add("active");
		values.add("Y");
		
		condStr.append(" order by hp.mos.name.upperSurname,hp.mos.name.upperForename");//WDEV-14526
		hql += " where ";
		hql += condStr.toString();
		hcps = factory.find(hql, markers, values);

		HcpLiteVoCollection voCollHcps = new HcpLiteVoCollection();
		if(hcps != null)
		{			
			for(int i=0;i<hcps.size();i++)
			{
				Hcp hcp = (Hcp)hcps.get(i);
				if (Medic.class.isAssignableFrom(hcp.getClass()))
					voCollHcps.add(HcpLiteVoAssembler.create((Medic)hcp));
			}
		}
		
		return voCollHcps;
}


	public GroupVoCollection listGroupConfig(Integer groupId) 
	{
		DomainFactory factory = getDomainFactory();
		
		List<?> grpList = factory.find("from Group as grp where grp.id = :groupId and active = :activeStr", new String[] {"groupId","activeStr"}, new Object[] {groupId,"Y"});
		
		if(grpList == null || grpList.size() == 0)
			return null;
		
		return GroupVoAssembler.createGroupVoCollectionFromGroup(grpList);
	}


	public GroupVoCollection listGroupConfig(Integer groupId, String active) 
	{
		DomainFactory factory = getDomainFactory();
		
		List<?> grpList = factory.find("from Group as grp where grp.id = :groupId and active = :activeStr", new String[] {"groupId","activeStr"}, new Object[] {groupId,active});
		
		if(grpList == null || grpList.size() == 0)
			return null;
		
		return GroupVoAssembler.createGroupVoCollectionFromGroup(grpList);
	}


	public ActionVoCollection listActions() 
	{
		DomainFactory factory = getDomainFactory();
		
		List<?> actionList = factory.find("from Action as action");
		
		if(actionList == null || actionList.size() == 0)
			return null;
		
		return ActionVoAssembler.createActionVoCollectionFromAction(actionList);
	}


	public SchedActivityVoCollection listActivities() 
	{
		DomainFactory factory = getDomainFactory();
		
		List<?> activityList = factory.find("from SchedActivity as activity order by activity.name asc");//WDEV-14301
		
		if(activityList == null || activityList.size() == 0)
			return null;
		
		return SchedActivityVoAssembler.createSchedActivityVoCollectionFromSchedActivity(activityList);
	}


	public ActivityGroupVoCollection listActivityGroups() 
	{
		DomainFactory factory = getDomainFactory();
		
		List<?> activityList = factory.find("from ActivityGroup as actGroup order by actGroup.activityGroupName ");//WDEV-14301
		
		if(activityList == null || activityList.size() == 0)
			return null;
		
		return ActivityGroupVoAssembler.createActivityGroupVoCollectionFromActivityGroup(activityList);
	}


	public PatTreatmentPlanVo getTreatmentPlan(PatTreatmentPlanLiteVo treatmentPlanLiteVo) 
	{
		if(treatmentPlanLiteVo == null)
			throw new DomainRuntimeException("Cannot get PatTreatmentPlanLiteVo for null voTreatmentPlan");
		
		DomainFactory factory = getDomainFactory();
		PatTreatmentPlan doPTP = (PatTreatmentPlan)factory.getDomainObject(PatTreatmentPlan.class,treatmentPlanLiteVo.getID_PatTreatmentPlan());
		PatTreatmentPlanVo vo = PatTreatmentPlanVoAssembler.create(doPTP);		
		populateApptDetails(factory, vo.getActions());
		return vo;
	}


	public ActivityActionVoCollection listActivityActions() 
	{
		DomainFactory factory = getDomainFactory();
		
		List<?> activityactionList = factory.find("from ActivityAction as activityAction order by activityAction.action.name ",1000); //WDEV-14318
		
		if(activityactionList == null || activityactionList.size() == 0)
			return null;
		
		return ActivityActionVoAssembler.createActivityActionVoCollectionFromActivityAction(activityactionList);		
	}


	public PatTreatmentPlanVo saveTreatmentPlan(PatTreatmentPlanVo treatmentPlanVo) throws DomainInterfaceException, StaleObjectException 
	{
		if (!treatmentPlanVo.isValidated())
		{
			throw new DomainRuntimeException("treatmentPlanVo VO has not be validated.");
		}

		DomainFactory factory = getDomainFactory();
		
		PatTreatmentPlan patTP = PatTreatmentPlanVoAssembler.extractPatTreatmentPlan(factory, treatmentPlanVo);
		
		try
		{
			factory.save(patTP);
		} 
		catch (UnqViolationUncheckedException e) 
		{	
			throw (e);
		}
		
		return PatTreatmentPlanVoAssembler.create(patTP);
	}


	public PatTreatPlanActionVo saveAction(PatTreatPlanActionVo actionVo) throws DomainInterfaceException, StaleObjectException 
	{
		if (!actionVo.isValidated())
		{
			throw new DomainRuntimeException("actionVo VO has not be validated.");
		}

		DomainFactory factory = getDomainFactory();
		
		PatAction patTPAction = PatTreatPlanActionVoAssembler.extractPatAction(factory, actionVo);
		
		try
		{
			factory.save(patTPAction);
		} 
		catch (UnqViolationUncheckedException e) 
		{	
			throw (e);
		}
		
		return PatTreatPlanActionVoAssembler.create(patTPAction);
		
	}


	public PatTreatPlanActionVo getTreatmentPlanAction(PatTreatPlanActionVo patTPActionVo) 
	{
		if(patTPActionVo == null)
			throw new DomainRuntimeException("Cannot get PatTreatPlanActionVo for null patTPActionVo");
		
		DomainFactory factory = getDomainFactory();
		PatAction doPTPAction = (PatAction)factory.getDomainObject(PatAction.class,patTPActionVo.getID_PatAction());
		return PatTreatPlanActionVoAssembler.create(doPTPAction);		
	}

	private void populateApptDetails(DomainFactory factory, PatTreatPlanActionVoCollection actions)
	{
		Iterator it = actions.iterator();
		while (it.hasNext())
		{
			PatTreatPlanActionVo voPTPAct = (PatTreatPlanActionVo) it.next();
			if (voPTPAct != null && voPTPAct.getApptHeadId() != null)
			{
				Appointment doAppt = (Appointment) factory.getDomainObject(Appointment.class, voPTPAct.getApptHeadId());
				if (doAppt != null)
				{
					// 	First appt is the first in list and last appt is the last in list as this is saved as a list
					if (doAppt.getApptDetail() != null && doAppt.getApptDetail().size() > 0)
					{
						AppointmentDetail doFirstAppt=null;
						AppointmentDetail doLastAppt=null;
						// as idx is not guaranteed to be in order and some list items could be null we have to list until we find the first one
						for (int x=0; x<doAppt.getApptDetail().size(); x++)
						{
							if (doAppt.getApptDetail().get(x) != null)
							{
								if (doFirstAppt == null)
									doFirstAppt = (AppointmentDetail) doAppt.getApptDetail().get(x);
								doLastAppt = (AppointmentDetail)doAppt.getApptDetail().get(x);
							}
						}
						if (doFirstAppt != null)
						{
							voPTPAct.setFirstApptDate(new ims.framework.utils.Date(doFirstAppt.getApptDate()));
							voPTPAct.setFirstApptStatus((AppointmentStatus) getLookupService().getLookupInstance(AppointmentStatus.class, doFirstAppt.getApptStatus()));
						}
						if (doLastAppt != null)
							voPTPAct.setLastAppointmentDate(new ims.framework.utils.Date(doLastAppt.getApptDate()));
					}
				}
			}
			
		}
	}

	public LookupInstVo getMappings(LookupInstVo lookupInstance) 
	{
		DomainFactory factory = getDomainFactory();
		ims.domain.lookups.LookupInstance doInst = factory.getLookupInstance(lookupInstance.getId());
		Set mappings = doInst.getMappings();
		LookupMappingVoCollection mapColl = new LookupMappingVoCollection();
		Iterator iter = mappings.iterator();
		LookupMapping doMapping;
		while (iter.hasNext())
		{
			doMapping = (LookupMapping) iter.next();
			mapColl.add(new LookupMappingVo(doMapping.getExtSystem(), doMapping.getExtCode()));
		}
		mapColl.sort();
		lookupInstance.setMappings(mapColl);
		return lookupInstance;
		
	}


	public GroupSiteVoCollection listGroupSites() 
	{
//		DomainFactory factory = getDomainFactory();
//		
//		List<?> groupSiteList = factory.find("from Group as grp where ");
//		
//		if(groupSiteList == null || groupSiteList.size() == 0)
//			return null;
//		
//		return GroupSiteVoAssembler.createGroupSiteVoCollectionFromGroupSite(groupSiteList);
		
		return null;
		
	}


	public TechniquesCollection listTreatmentGroupsTechniques(TreatmentGroupSite lkupGroupSite)
	{
		if(lkupGroupSite == null)
			return null;

		StringBuilder query = new StringBuilder();
		String groupId = "GROUP_ID";
		query.append("from TreatmentGroupTechniqueConfig as tr where tr.treatmentGroup = :" + groupId);
		List list = getDomainFactory().find(query.toString(), groupId, getDomLookup(lkupGroupSite));
		if (list != null && list.size() > 0)
			return TreatmentGroupTechniqueConfigVoAssembler.createTreatmentGroupTechniqueConfigVoCollectionFromTreatmentGroupTechniqueConfig(list).get(0).getTreatmentTechniques();
		else
			return null;
	}


	public PatTreatPlanActionVo saveTreatmentPlan(PatTreatmentPlanVo treatmentPlanVo, PatTreatPlanActionVo actionVo) throws DomainInterfaceException, StaleObjectException
	{
		if (!treatmentPlanVo.isValidated())
		{
			throw new DomainRuntimeException("treatmentPlanVo VO has not be validated.");
		}

		DomainFactory factory = getDomainFactory();
		
		PatAction patTPAction = PatTreatPlanActionVoAssembler.extractPatAction(factory, actionVo);

		try
		{
			factory.save(patTPAction);
		} 
		catch (UnqViolationUncheckedException e) 
		{	
			throw (e);
		}
		
		ims.oncology.domain.objects.PatTreatmentPlan patTP = PatTreatmentPlanVoAssembler.extractPatTreatmentPlan(factory, treatmentPlanVo);
		patTP.getActions().add(patTPAction);
		
		try
		{
			factory.save(patTP);
		} 
		catch (UnqViolationUncheckedException e) 
		{	
			throw (e);
		}
		
		return PatTreatPlanActionVoAssembler.create(patTPAction);
	}

}