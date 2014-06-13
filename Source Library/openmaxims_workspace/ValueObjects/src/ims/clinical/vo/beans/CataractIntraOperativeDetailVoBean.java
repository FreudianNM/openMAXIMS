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

package ims.clinical.vo.beans;

public class CataractIntraOperativeDetailVoBean extends ims.vo.ValueObjectBean
{
	public CataractIntraOperativeDetailVoBean()
	{
	}
	public CataractIntraOperativeDetailVoBean(ims.clinical.vo.CataractIntraOperativeDetailVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.medications = vo.getMedications() == null ? null : vo.getMedications().getBeanCollection();
		this.skinpreperationused = vo.getSkinPreperationUsed() == null ? null : vo.getSkinPreperationUsed().getBeanCollection();
		this.localanaestheticused = vo.getLocalAnaestheticUsed() == null ? null : vo.getLocalAnaestheticUsed().getBeanCollection();
		this.dressings = vo.getDressings() == null ? null : vo.getDressings().getBeanCollection();
		this.swabneedlecount = vo.getSwabNeedleCount();
		this.wasswabneedlecountcorrect = vo.getWasSwabNeedleCountCorrect() == null ? null : (ims.vo.LookupInstanceBean)vo.getWasSwabNeedleCountCorrect().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.CataractIntraOperativeDetailVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.medications = vo.getMedications() == null ? null : vo.getMedications().getBeanCollection();
		this.skinpreperationused = vo.getSkinPreperationUsed() == null ? null : vo.getSkinPreperationUsed().getBeanCollection();
		this.localanaestheticused = vo.getLocalAnaestheticUsed() == null ? null : vo.getLocalAnaestheticUsed().getBeanCollection();
		this.dressings = vo.getDressings() == null ? null : vo.getDressings().getBeanCollection();
		this.swabneedlecount = vo.getSwabNeedleCount();
		this.wasswabneedlecountcorrect = vo.getWasSwabNeedleCountCorrect() == null ? null : (ims.vo.LookupInstanceBean)vo.getWasSwabNeedleCountCorrect().getBean();
	}

	public ims.clinical.vo.CataractIntraOperativeDetailVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.CataractIntraOperativeDetailVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.CataractIntraOperativeDetailVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.CataractIntraOperativeDetailVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.CataractIntraOperativeDetailVo();
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
	public ims.core.vo.beans.PatientMedicationLiteVoBean[] getMedications()
	{
		return this.medications;
	}
	public void setMedications(ims.core.vo.beans.PatientMedicationLiteVoBean[] value)
	{
		this.medications = value;
	}
	public ims.clinical.vo.beans.SkinPreperationVoBean[] getSkinPreperationUsed()
	{
		return this.skinpreperationused;
	}
	public void setSkinPreperationUsed(ims.clinical.vo.beans.SkinPreperationVoBean[] value)
	{
		this.skinpreperationused = value;
	}
	public ims.clinical.vo.beans.LocalAnaestheticAdministeredVoBean[] getLocalAnaestheticUsed()
	{
		return this.localanaestheticused;
	}
	public void setLocalAnaestheticUsed(ims.clinical.vo.beans.LocalAnaestheticAdministeredVoBean[] value)
	{
		this.localanaestheticused = value;
	}
	public java.util.Collection getDressings()
	{
		return this.dressings;
	}
	public void setDressings(java.util.Collection value)
	{
		this.dressings = value;
	}
	public void addDressings(java.util.Collection value)
	{
		if(this.dressings == null)
			this.dressings = new java.util.ArrayList();
		this.dressings.add(value);
	}
	public Integer getSwabNeedleCount()
	{
		return this.swabneedlecount;
	}
	public void setSwabNeedleCount(Integer value)
	{
		this.swabneedlecount = value;
	}
	public ims.vo.LookupInstanceBean getWasSwabNeedleCountCorrect()
	{
		return this.wasswabneedlecountcorrect;
	}
	public void setWasSwabNeedleCountCorrect(ims.vo.LookupInstanceBean value)
	{
		this.wasswabneedlecountcorrect = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.PatientMedicationLiteVoBean[] medications;
	private ims.clinical.vo.beans.SkinPreperationVoBean[] skinpreperationused;
	private ims.clinical.vo.beans.LocalAnaestheticAdministeredVoBean[] localanaestheticused;
	private java.util.Collection dressings;
	private Integer swabneedlecount;
	private ims.vo.LookupInstanceBean wasswabneedlecountcorrect;
}