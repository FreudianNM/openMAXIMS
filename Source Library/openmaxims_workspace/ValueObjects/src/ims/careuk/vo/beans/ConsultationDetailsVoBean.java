//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.careuk.vo.beans;

public class ConsultationDetailsVoBean extends ims.vo.ValueObjectBean
{
	public ConsultationDetailsVoBean()
	{
	}
	public ConsultationDetailsVoBean(ims.careuk.vo.ConsultationDetailsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean();
		this.referralsummary = vo.getReferralSummary() == null ? null : (ims.careuk.vo.beans.PresentationReferralSummaryVoBean)vo.getReferralSummary().getBean();
		this.baselineobs = vo.getBaselineObs() == null ? null : (ims.careuk.vo.beans.BaselineObservationsVoBean)vo.getBaselineObs().getBean();
		this.onexam = vo.getOnExam() == null ? null : (ims.careuk.vo.beans.onExaminationVoBean)vo.getOnExam().getBean();
		this.atconsultation = vo.getAtConsultation() == null ? null : (ims.careuk.vo.beans.AtConsultationVoBean)vo.getAtConsultation().getBean();
		this.outcome = vo.getOutcome() == null ? null : (ims.careuk.vo.beans.ReferralOutcomeVoBean)vo.getOutcome().getBean();
		this.catsreferral = vo.getCATSReferral() == null ? null : new ims.vo.RefVoBean(vo.getCATSReferral().getBoId(), vo.getCATSReferral().getBoVersion());
		this.consultationtimes = vo.getConsultationTimes() == null ? null : vo.getConsultationTimes().getBeanCollection();
		this.tlttimes = vo.getTltTimes() == null ? null : vo.getTltTimes().getBeanCollection();
		this.clinicalcontacttime = vo.getClinicalContactTime() == null ? null : vo.getClinicalContactTime().getBeanCollection();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.careuk.vo.ConsultationDetailsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean(map);
		this.referralsummary = vo.getReferralSummary() == null ? null : (ims.careuk.vo.beans.PresentationReferralSummaryVoBean)vo.getReferralSummary().getBean(map);
		this.baselineobs = vo.getBaselineObs() == null ? null : (ims.careuk.vo.beans.BaselineObservationsVoBean)vo.getBaselineObs().getBean(map);
		this.onexam = vo.getOnExam() == null ? null : (ims.careuk.vo.beans.onExaminationVoBean)vo.getOnExam().getBean(map);
		this.atconsultation = vo.getAtConsultation() == null ? null : (ims.careuk.vo.beans.AtConsultationVoBean)vo.getAtConsultation().getBean(map);
		this.outcome = vo.getOutcome() == null ? null : (ims.careuk.vo.beans.ReferralOutcomeVoBean)vo.getOutcome().getBean(map);
		this.catsreferral = vo.getCATSReferral() == null ? null : new ims.vo.RefVoBean(vo.getCATSReferral().getBoId(), vo.getCATSReferral().getBoVersion());
		this.consultationtimes = vo.getConsultationTimes() == null ? null : vo.getConsultationTimes().getBeanCollection();
		this.tlttimes = vo.getTltTimes() == null ? null : vo.getTltTimes().getBeanCollection();
		this.clinicalcontacttime = vo.getClinicalContactTime() == null ? null : vo.getClinicalContactTime().getBeanCollection();
	}

	public ims.careuk.vo.ConsultationDetailsVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.careuk.vo.ConsultationDetailsVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.careuk.vo.ConsultationDetailsVo vo = null;
		if(map != null)
			vo = (ims.careuk.vo.ConsultationDetailsVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.careuk.vo.ConsultationDetailsVo();
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
	public ims.core.vo.beans.AuthoringInformationVoBean getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.authoringinformation = value;
	}
	public ims.careuk.vo.beans.PresentationReferralSummaryVoBean getReferralSummary()
	{
		return this.referralsummary;
	}
	public void setReferralSummary(ims.careuk.vo.beans.PresentationReferralSummaryVoBean value)
	{
		this.referralsummary = value;
	}
	public ims.careuk.vo.beans.BaselineObservationsVoBean getBaselineObs()
	{
		return this.baselineobs;
	}
	public void setBaselineObs(ims.careuk.vo.beans.BaselineObservationsVoBean value)
	{
		this.baselineobs = value;
	}
	public ims.careuk.vo.beans.onExaminationVoBean getOnExam()
	{
		return this.onexam;
	}
	public void setOnExam(ims.careuk.vo.beans.onExaminationVoBean value)
	{
		this.onexam = value;
	}
	public ims.careuk.vo.beans.AtConsultationVoBean getAtConsultation()
	{
		return this.atconsultation;
	}
	public void setAtConsultation(ims.careuk.vo.beans.AtConsultationVoBean value)
	{
		this.atconsultation = value;
	}
	public ims.careuk.vo.beans.ReferralOutcomeVoBean getOutcome()
	{
		return this.outcome;
	}
	public void setOutcome(ims.careuk.vo.beans.ReferralOutcomeVoBean value)
	{
		this.outcome = value;
	}
	public ims.vo.RefVoBean getCATSReferral()
	{
		return this.catsreferral;
	}
	public void setCATSReferral(ims.vo.RefVoBean value)
	{
		this.catsreferral = value;
	}
	public ims.careuk.vo.beans.ConsultationTimeVoBean[] getConsultationTimes()
	{
		return this.consultationtimes;
	}
	public void setConsultationTimes(ims.careuk.vo.beans.ConsultationTimeVoBean[] value)
	{
		this.consultationtimes = value;
	}
	public ims.careuk.vo.beans.TLTContactTimeVoBean[] getTltTimes()
	{
		return this.tlttimes;
	}
	public void setTltTimes(ims.careuk.vo.beans.TLTContactTimeVoBean[] value)
	{
		this.tlttimes = value;
	}
	public ims.careuk.vo.beans.ClinicalContactTimeVoBean[] getClinicalContactTime()
	{
		return this.clinicalcontacttime;
	}
	public void setClinicalContactTime(ims.careuk.vo.beans.ClinicalContactTimeVoBean[] value)
	{
		this.clinicalcontacttime = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.AuthoringInformationVoBean authoringinformation;
	private ims.careuk.vo.beans.PresentationReferralSummaryVoBean referralsummary;
	private ims.careuk.vo.beans.BaselineObservationsVoBean baselineobs;
	private ims.careuk.vo.beans.onExaminationVoBean onexam;
	private ims.careuk.vo.beans.AtConsultationVoBean atconsultation;
	private ims.careuk.vo.beans.ReferralOutcomeVoBean outcome;
	private ims.vo.RefVoBean catsreferral;
	private ims.careuk.vo.beans.ConsultationTimeVoBean[] consultationtimes;
	private ims.careuk.vo.beans.TLTContactTimeVoBean[] tlttimes;
	private ims.careuk.vo.beans.ClinicalContactTimeVoBean[] clinicalcontacttime;
}