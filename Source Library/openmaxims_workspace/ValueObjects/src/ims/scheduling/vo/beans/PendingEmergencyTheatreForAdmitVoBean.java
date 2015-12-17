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

package ims.scheduling.vo.beans;

public class PendingEmergencyTheatreForAdmitVoBean extends ims.vo.ValueObjectBean
{
	public PendingEmergencyTheatreForAdmitVoBean()
	{
	}
	public PendingEmergencyTheatreForAdmitVoBean(ims.scheduling.vo.PendingEmergencyTheatreForAdmitVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientLite_IdentifiersVoBean)vo.getPatient().getBean();
		this.referral = vo.getReferral() == null ? null : (ims.RefMan.vo.beans.CatsReferralForClinicListVoBean)vo.getReferral().getBean();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getCurrentStatus().getBean();
		this.expecteddatetime = vo.getExpectedDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getExpectedDateTime().getBean();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean();
		this.admissiondetail = vo.getAdmissionDetail() == null ? null : new ims.vo.RefVoBean(vo.getAdmissionDetail().getBoId(), vo.getAdmissionDetail().getBoVersion());
		this.responsiblehcp = vo.getResponsibleHCP() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getResponsibleHCP().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.PendingEmergencyTheatreForAdmitVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientLite_IdentifiersVoBean)vo.getPatient().getBean(map);
		this.referral = vo.getReferral() == null ? null : (ims.RefMan.vo.beans.CatsReferralForClinicListVoBean)vo.getReferral().getBean(map);
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getCurrentStatus().getBean();
		this.expecteddatetime = vo.getExpectedDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getExpectedDateTime().getBean();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean(map);
		this.admissiondetail = vo.getAdmissionDetail() == null ? null : new ims.vo.RefVoBean(vo.getAdmissionDetail().getBoId(), vo.getAdmissionDetail().getBoVersion());
		this.responsiblehcp = vo.getResponsibleHCP() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getResponsibleHCP().getBean(map);
	}

	public ims.scheduling.vo.PendingEmergencyTheatreForAdmitVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.PendingEmergencyTheatreForAdmitVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.PendingEmergencyTheatreForAdmitVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.PendingEmergencyTheatreForAdmitVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.PendingEmergencyTheatreForAdmitVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.core.vo.beans.PatientLite_IdentifiersVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.beans.PatientLite_IdentifiersVoBean value)
	{
		this.patient = value;
	}
	public ims.RefMan.vo.beans.CatsReferralForClinicListVoBean getReferral()
	{
		return this.referral;
	}
	public void setReferral(ims.RefMan.vo.beans.CatsReferralForClinicListVoBean value)
	{
		this.referral = value;
	}
	public ims.vo.LookupInstanceBean getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.vo.LookupInstanceBean value)
	{
		this.currentstatus = value;
	}
	public ims.framework.utils.beans.DateTimeBean getExpectedDateTime()
	{
		return this.expecteddatetime;
	}
	public void setExpectedDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.expecteddatetime = value;
	}
	public ims.core.vo.beans.ServiceLiteVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.core.vo.beans.ServiceLiteVoBean value)
	{
		this.service = value;
	}
	public ims.vo.RefVoBean getAdmissionDetail()
	{
		return this.admissiondetail;
	}
	public void setAdmissionDetail(ims.vo.RefVoBean value)
	{
		this.admissiondetail = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getResponsibleHCP()
	{
		return this.responsiblehcp;
	}
	public void setResponsibleHCP(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.responsiblehcp = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.PatientLite_IdentifiersVoBean patient;
	private ims.RefMan.vo.beans.CatsReferralForClinicListVoBean referral;
	private ims.vo.LookupInstanceBean currentstatus;
	private ims.framework.utils.beans.DateTimeBean expecteddatetime;
	private ims.core.vo.beans.ServiceLiteVoBean service;
	private ims.vo.RefVoBean admissiondetail;
	private ims.core.vo.beans.HcpLiteVoBean responsiblehcp;
}