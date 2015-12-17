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

package ims.core.vo.beans;

public class PatientDiagnosisAtConsultationVoBean extends ims.vo.ValueObjectBean
{
	public PatientDiagnosisAtConsultationVoBean()
	{
	}
	public PatientDiagnosisAtConsultationVoBean(ims.core.vo.PatientDiagnosisAtConsultationVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.diagnosis = vo.getDiagnosis() == null ? null : (ims.core.vo.beans.DiagLiteVoBean)vo.getDiagnosis().getBean();
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
		this.diagnosisdescription = vo.getDiagnosisDescription();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.clinical.vo.beans.PatientDiagnosisStatusVoBean)vo.getCurrentStatus().getBean();
		this.authoringinfo = vo.getAuthoringInfo() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInfo().getBean();
		this.diagnoseddate = vo.getDiagnosedDate() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getDiagnosedDate().getBean();
		this.sourceofinformation = vo.getSourceofInformation() == null ? null : (ims.vo.LookupInstanceBean)vo.getSourceofInformation().getBean();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.primaryforcarespells = vo.getPrimaryForCareSpells() == null ? null : vo.getPrimaryForCareSpells().getBeanCollection();
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : new ims.vo.RefVoBean(vo.getEpisodeOfCare().getBoId(), vo.getEpisodeOfCare().getBoVersion());
		this.addedduringcoding = vo.getAddedDuringCoding();
		this.statushistory = vo.getStatusHistory() == null ? null : vo.getStatusHistory().getBeanCollection();
		this.codingsequence = vo.getCodingSequence();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.PatientDiagnosisAtConsultationVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.diagnosis = vo.getDiagnosis() == null ? null : (ims.core.vo.beans.DiagLiteVoBean)vo.getDiagnosis().getBean(map);
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
		this.diagnosisdescription = vo.getDiagnosisDescription();
		this.currentstatus = vo.getCurrentStatus() == null ? null : (ims.clinical.vo.beans.PatientDiagnosisStatusVoBean)vo.getCurrentStatus().getBean(map);
		this.authoringinfo = vo.getAuthoringInfo() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInfo().getBean(map);
		this.diagnoseddate = vo.getDiagnosedDate() == null ? null : (ims.framework.utils.beans.PartialDateBean)vo.getDiagnosedDate().getBean();
		this.sourceofinformation = vo.getSourceofInformation() == null ? null : (ims.vo.LookupInstanceBean)vo.getSourceofInformation().getBean();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.primaryforcarespells = vo.getPrimaryForCareSpells() == null ? null : vo.getPrimaryForCareSpells().getBeanCollection();
		this.episodeofcare = vo.getEpisodeOfCare() == null ? null : new ims.vo.RefVoBean(vo.getEpisodeOfCare().getBoId(), vo.getEpisodeOfCare().getBoVersion());
		this.addedduringcoding = vo.getAddedDuringCoding();
		this.statushistory = vo.getStatusHistory() == null ? null : vo.getStatusHistory().getBeanCollection();
		this.codingsequence = vo.getCodingSequence();
	}

	public ims.core.vo.PatientDiagnosisAtConsultationVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.PatientDiagnosisAtConsultationVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.PatientDiagnosisAtConsultationVo vo = null;
		if(map != null)
			vo = (ims.core.vo.PatientDiagnosisAtConsultationVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.PatientDiagnosisAtConsultationVo();
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
	public ims.core.vo.beans.DiagLiteVoBean getDiagnosis()
	{
		return this.diagnosis;
	}
	public void setDiagnosis(ims.core.vo.beans.DiagLiteVoBean value)
	{
		this.diagnosis = value;
	}
	public ims.vo.LookupInstanceBean getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(ims.vo.LookupInstanceBean value)
	{
		this.specialty = value;
	}
	public String getDiagnosisDescription()
	{
		return this.diagnosisdescription;
	}
	public void setDiagnosisDescription(String value)
	{
		this.diagnosisdescription = value;
	}
	public ims.clinical.vo.beans.PatientDiagnosisStatusVoBean getCurrentStatus()
	{
		return this.currentstatus;
	}
	public void setCurrentStatus(ims.clinical.vo.beans.PatientDiagnosisStatusVoBean value)
	{
		this.currentstatus = value;
	}
	public ims.core.vo.beans.AuthoringInformationVoBean getAuthoringInfo()
	{
		return this.authoringinfo;
	}
	public void setAuthoringInfo(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.authoringinfo = value;
	}
	public ims.framework.utils.beans.PartialDateBean getDiagnosedDate()
	{
		return this.diagnoseddate;
	}
	public void setDiagnosedDate(ims.framework.utils.beans.PartialDateBean value)
	{
		this.diagnoseddate = value;
	}
	public ims.vo.LookupInstanceBean getSourceofInformation()
	{
		return this.sourceofinformation;
	}
	public void setSourceofInformation(ims.vo.LookupInstanceBean value)
	{
		this.sourceofinformation = value;
	}
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}
	public ims.core.vo.beans.CSPrimaryDiagnosisShortVoBean[] getPrimaryForCareSpells()
	{
		return this.primaryforcarespells;
	}
	public void setPrimaryForCareSpells(ims.core.vo.beans.CSPrimaryDiagnosisShortVoBean[] value)
	{
		this.primaryforcarespells = value;
	}
	public ims.vo.RefVoBean getEpisodeOfCare()
	{
		return this.episodeofcare;
	}
	public void setEpisodeOfCare(ims.vo.RefVoBean value)
	{
		this.episodeofcare = value;
	}
	public Boolean getAddedDuringCoding()
	{
		return this.addedduringcoding;
	}
	public void setAddedDuringCoding(Boolean value)
	{
		this.addedduringcoding = value;
	}
	public ims.clinical.vo.beans.PatientDiagnosisStatusVoBean[] getStatusHistory()
	{
		return this.statushistory;
	}
	public void setStatusHistory(ims.clinical.vo.beans.PatientDiagnosisStatusVoBean[] value)
	{
		this.statushistory = value;
	}
	public Integer getCodingSequence()
	{
		return this.codingsequence;
	}
	public void setCodingSequence(Integer value)
	{
		this.codingsequence = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.DiagLiteVoBean diagnosis;
	private ims.vo.LookupInstanceBean specialty;
	private String diagnosisdescription;
	private ims.clinical.vo.beans.PatientDiagnosisStatusVoBean currentstatus;
	private ims.core.vo.beans.AuthoringInformationVoBean authoringinfo;
	private ims.framework.utils.beans.PartialDateBean diagnoseddate;
	private ims.vo.LookupInstanceBean sourceofinformation;
	private ims.vo.RefVoBean carecontext;
	private ims.core.vo.beans.CSPrimaryDiagnosisShortVoBean[] primaryforcarespells;
	private ims.vo.RefVoBean episodeofcare;
	private Boolean addedduringcoding;
	private ims.clinical.vo.beans.PatientDiagnosisStatusVoBean[] statushistory;
	private Integer codingsequence;
}