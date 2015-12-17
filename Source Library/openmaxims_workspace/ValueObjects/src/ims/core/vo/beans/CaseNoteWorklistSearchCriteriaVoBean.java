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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.core.vo.beans;

public class CaseNoteWorklistSearchCriteriaVoBean extends ims.vo.ValueObjectBean
{
	public CaseNoteWorklistSearchCriteriaVoBean()
	{
	}
	public CaseNoteWorklistSearchCriteriaVoBean(ims.core.vo.CaseNoteWorklistSearchCriteriaVo vo)
	{
		this.searchtab = vo.getSearchTab();
		this.hospital = vo.getHospital() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getHospital().getBean();
		this.clinicname = vo.getClinicName() == null ? null : (ims.scheduling.vo.beans.ProfileLiteVoBean)vo.getClinicName().getBean();
		this.listowner = vo.getListOwner() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getListOwner().getBean();
		this.ward = vo.getWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getWard().getBean();
		this.requestorlocation = vo.getRequestorLocation() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getRequestorLocation().getBean();
		this.casenotesinmedicalrecords = vo.getCaseNotesInMedicalRecords();
		this.requestfromdate = vo.getRequestFromDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getRequestFromDate().getBean();
		this.requesttodate = vo.getRequestToDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getRequestToDate().getBean();
		this.requestfordays = vo.getRequestForDays();
		this.requestoverduedays = vo.getRequestOverdueDays();
		this.includecompletedrequests = vo.getIncludeCompletedRequests();
		this.requestreasons = vo.getRequestReasons() == null ? null : vo.getRequestReasons().getBeanCollection();
		this.hospitalbylocation = vo.getHospitalByLocation() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getHospitalByLocation().getBean();
		this.currentlocation = vo.getCurrentLocation() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getCurrentLocation().getBean();
		this.casenotesinmedicalrecordsbylocation = vo.getCaseNotesInMedicalRecordsByLocation();
		this.casenotebylocationoption = vo.getCaseNoteByLocationOption();
		this.periodincurrentlocationfrom = vo.getPeriodInCurrentLocationFrom() == null ? null : (ims.framework.utils.beans.DateBean)vo.getPeriodInCurrentLocationFrom().getBean();
		this.periodincurrentlocationto = vo.getPeriodInCurrentLocationTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getPeriodInCurrentLocationTo().getBean();
		this.incurrentlocationforlastdays = vo.getInCurrentLocationForLastDays();
		this.wastimeron = vo.getWasTimerOn();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.CaseNoteWorklistSearchCriteriaVo vo)
	{
		this.searchtab = vo.getSearchTab();
		this.hospital = vo.getHospital() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getHospital().getBean(map);
		this.clinicname = vo.getClinicName() == null ? null : (ims.scheduling.vo.beans.ProfileLiteVoBean)vo.getClinicName().getBean(map);
		this.listowner = vo.getListOwner() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getListOwner().getBean(map);
		this.ward = vo.getWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getWard().getBean(map);
		this.requestorlocation = vo.getRequestorLocation() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getRequestorLocation().getBean(map);
		this.casenotesinmedicalrecords = vo.getCaseNotesInMedicalRecords();
		this.requestfromdate = vo.getRequestFromDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getRequestFromDate().getBean();
		this.requesttodate = vo.getRequestToDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getRequestToDate().getBean();
		this.requestfordays = vo.getRequestForDays();
		this.requestoverduedays = vo.getRequestOverdueDays();
		this.includecompletedrequests = vo.getIncludeCompletedRequests();
		this.requestreasons = vo.getRequestReasons() == null ? null : vo.getRequestReasons().getBeanCollection();
		this.hospitalbylocation = vo.getHospitalByLocation() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getHospitalByLocation().getBean(map);
		this.currentlocation = vo.getCurrentLocation() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getCurrentLocation().getBean(map);
		this.casenotesinmedicalrecordsbylocation = vo.getCaseNotesInMedicalRecordsByLocation();
		this.casenotebylocationoption = vo.getCaseNoteByLocationOption();
		this.periodincurrentlocationfrom = vo.getPeriodInCurrentLocationFrom() == null ? null : (ims.framework.utils.beans.DateBean)vo.getPeriodInCurrentLocationFrom().getBean();
		this.periodincurrentlocationto = vo.getPeriodInCurrentLocationTo() == null ? null : (ims.framework.utils.beans.DateBean)vo.getPeriodInCurrentLocationTo().getBean();
		this.incurrentlocationforlastdays = vo.getInCurrentLocationForLastDays();
		this.wastimeron = vo.getWasTimerOn();
	}

	public ims.core.vo.CaseNoteWorklistSearchCriteriaVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.CaseNoteWorklistSearchCriteriaVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.CaseNoteWorklistSearchCriteriaVo vo = null;
		if(map != null)
			vo = (ims.core.vo.CaseNoteWorklistSearchCriteriaVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.CaseNoteWorklistSearchCriteriaVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getSearchTab()
	{
		return this.searchtab;
	}
	public void setSearchTab(Integer value)
	{
		this.searchtab = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getHospital()
	{
		return this.hospital;
	}
	public void setHospital(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.hospital = value;
	}
	public ims.scheduling.vo.beans.ProfileLiteVoBean getClinicName()
	{
		return this.clinicname;
	}
	public void setClinicName(ims.scheduling.vo.beans.ProfileLiteVoBean value)
	{
		this.clinicname = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getListOwner()
	{
		return this.listowner;
	}
	public void setListOwner(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.listowner = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getWard()
	{
		return this.ward;
	}
	public void setWard(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.ward = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getRequestorLocation()
	{
		return this.requestorlocation;
	}
	public void setRequestorLocation(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.requestorlocation = value;
	}
	public Boolean getCaseNotesInMedicalRecords()
	{
		return this.casenotesinmedicalrecords;
	}
	public void setCaseNotesInMedicalRecords(Boolean value)
	{
		this.casenotesinmedicalrecords = value;
	}
	public ims.framework.utils.beans.DateBean getRequestFromDate()
	{
		return this.requestfromdate;
	}
	public void setRequestFromDate(ims.framework.utils.beans.DateBean value)
	{
		this.requestfromdate = value;
	}
	public ims.framework.utils.beans.DateBean getRequestToDate()
	{
		return this.requesttodate;
	}
	public void setRequestToDate(ims.framework.utils.beans.DateBean value)
	{
		this.requesttodate = value;
	}
	public Integer getRequestForDays()
	{
		return this.requestfordays;
	}
	public void setRequestForDays(Integer value)
	{
		this.requestfordays = value;
	}
	public Integer getRequestOverdueDays()
	{
		return this.requestoverduedays;
	}
	public void setRequestOverdueDays(Integer value)
	{
		this.requestoverduedays = value;
	}
	public Boolean getIncludeCompletedRequests()
	{
		return this.includecompletedrequests;
	}
	public void setIncludeCompletedRequests(Boolean value)
	{
		this.includecompletedrequests = value;
	}
	public java.util.Collection getRequestReasons()
	{
		return this.requestreasons;
	}
	public void setRequestReasons(java.util.Collection value)
	{
		this.requestreasons = value;
	}
	public void addRequestReasons(java.util.Collection value)
	{
		if(this.requestreasons == null)
			this.requestreasons = new java.util.ArrayList();
		this.requestreasons.add(value);
	}
	public ims.core.vo.beans.LocationLiteVoBean getHospitalByLocation()
	{
		return this.hospitalbylocation;
	}
	public void setHospitalByLocation(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.hospitalbylocation = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getCurrentLocation()
	{
		return this.currentlocation;
	}
	public void setCurrentLocation(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.currentlocation = value;
	}
	public Boolean getCaseNotesInMedicalRecordsByLocation()
	{
		return this.casenotesinmedicalrecordsbylocation;
	}
	public void setCaseNotesInMedicalRecordsByLocation(Boolean value)
	{
		this.casenotesinmedicalrecordsbylocation = value;
	}
	public Integer getCaseNoteByLocationOption()
	{
		return this.casenotebylocationoption;
	}
	public void setCaseNoteByLocationOption(Integer value)
	{
		this.casenotebylocationoption = value;
	}
	public ims.framework.utils.beans.DateBean getPeriodInCurrentLocationFrom()
	{
		return this.periodincurrentlocationfrom;
	}
	public void setPeriodInCurrentLocationFrom(ims.framework.utils.beans.DateBean value)
	{
		this.periodincurrentlocationfrom = value;
	}
	public ims.framework.utils.beans.DateBean getPeriodInCurrentLocationTo()
	{
		return this.periodincurrentlocationto;
	}
	public void setPeriodInCurrentLocationTo(ims.framework.utils.beans.DateBean value)
	{
		this.periodincurrentlocationto = value;
	}
	public Integer getInCurrentLocationForLastDays()
	{
		return this.incurrentlocationforlastdays;
	}
	public void setInCurrentLocationForLastDays(Integer value)
	{
		this.incurrentlocationforlastdays = value;
	}
	public Boolean getWasTimerOn()
	{
		return this.wastimeron;
	}
	public void setWasTimerOn(Boolean value)
	{
		this.wastimeron = value;
	}

	private Integer searchtab;
	private ims.core.vo.beans.LocationLiteVoBean hospital;
	private ims.scheduling.vo.beans.ProfileLiteVoBean clinicname;
	private ims.core.vo.beans.HcpLiteVoBean listowner;
	private ims.core.vo.beans.LocationLiteVoBean ward;
	private ims.core.vo.beans.LocationLiteVoBean requestorlocation;
	private Boolean casenotesinmedicalrecords;
	private ims.framework.utils.beans.DateBean requestfromdate;
	private ims.framework.utils.beans.DateBean requesttodate;
	private Integer requestfordays;
	private Integer requestoverduedays;
	private Boolean includecompletedrequests;
	private java.util.Collection requestreasons;
	private ims.core.vo.beans.LocationLiteVoBean hospitalbylocation;
	private ims.core.vo.beans.LocationLiteVoBean currentlocation;
	private Boolean casenotesinmedicalrecordsbylocation;
	private Integer casenotebylocationoption;
	private ims.framework.utils.beans.DateBean periodincurrentlocationfrom;
	private ims.framework.utils.beans.DateBean periodincurrentlocationto;
	private Integer incurrentlocationforlastdays;
	private Boolean wastimeron;
}