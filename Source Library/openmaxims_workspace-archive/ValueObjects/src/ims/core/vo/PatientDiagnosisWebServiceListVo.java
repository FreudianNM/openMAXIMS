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

package ims.core.vo;

/**
 * Linked to core.clinical.PatientDiagnosis business object (ID: 1003100016).
 */
public class PatientDiagnosisWebServiceListVo extends ims.core.clinical.vo.PatientDiagnosisRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientDiagnosisWebServiceListVo()
	{
	}
	public PatientDiagnosisWebServiceListVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientDiagnosisWebServiceListVo(ims.core.vo.beans.PatientDiagnosisWebServiceListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.diagnosis = bean.getDiagnosis() == null ? null : bean.getDiagnosis().buildVo();
		this.diagnosisdescription = bean.getDiagnosisDescription();
		this.diagnoseddate = bean.getDiagnosedDate() == null ? null : bean.getDiagnosedDate().buildPartialDate();
		this.dateonset = bean.getDateOnset() == null ? null : bean.getDateOnset().buildDate();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.PatientDiagnosisWebServiceListVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.diagnosis = bean.getDiagnosis() == null ? null : bean.getDiagnosis().buildVo(map);
		this.diagnosisdescription = bean.getDiagnosisDescription();
		this.diagnoseddate = bean.getDiagnosedDate() == null ? null : bean.getDiagnosedDate().buildPartialDate();
		this.dateonset = bean.getDateOnset() == null ? null : bean.getDateOnset().buildDate();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.PatientDiagnosisWebServiceListVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.PatientDiagnosisWebServiceListVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.PatientDiagnosisWebServiceListVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("DIAGNOSIS"))
			return getDiagnosis();
		if(fieldName.equals("DIAGNOSISDESCRIPTION"))
			return getDiagnosisDescription();
		if(fieldName.equals("DIAGNOSEDDATE"))
			return getDiagnosedDate();
		if(fieldName.equals("DATEONSET"))
			return getDateOnset();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getDiagnosisIsNotNull()
	{
		return this.diagnosis != null;
	}
	public ims.core.vo.DiagLiteVo getDiagnosis()
	{
		return this.diagnosis;
	}
	public void setDiagnosis(ims.core.vo.DiagLiteVo value)
	{
		this.isValidated = false;
		this.diagnosis = value;
	}
	public boolean getDiagnosisDescriptionIsNotNull()
	{
		return this.diagnosisdescription != null;
	}
	public String getDiagnosisDescription()
	{
		return this.diagnosisdescription;
	}
	public static int getDiagnosisDescriptionMaxLength()
	{
		return 255;
	}
	public void setDiagnosisDescription(String value)
	{
		this.isValidated = false;
		this.diagnosisdescription = value;
	}
	public boolean getDiagnosedDateIsNotNull()
	{
		return this.diagnoseddate != null;
	}
	public ims.framework.utils.PartialDate getDiagnosedDate()
	{
		return this.diagnoseddate;
	}
	public void setDiagnosedDate(ims.framework.utils.PartialDate value)
	{
		this.isValidated = false;
		this.diagnoseddate = value;
	}
	public boolean getDateOnsetIsNotNull()
	{
		return this.dateonset != null;
	}
	public ims.framework.utils.Date getDateOnset()
	{
		return this.dateonset;
	}
	public void setDateOnset(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.dateonset = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.diagnosisdescription == null || this.diagnosisdescription.length() == 0)
			listOfErrors.add("DiagnosisDescription is mandatory");
		else if(this.diagnosisdescription.length() > 255)
			listOfErrors.add("The length of the field [diagnosisdescription] in the value object [ims.core.vo.PatientDiagnosisWebServiceListVo] is too big. It should be less or equal to 255");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		PatientDiagnosisWebServiceListVo clone = new PatientDiagnosisWebServiceListVo(this.id, this.version);
		
		if(this.diagnosis == null)
			clone.diagnosis = null;
		else
			clone.diagnosis = (ims.core.vo.DiagLiteVo)this.diagnosis.clone();
		clone.diagnosisdescription = this.diagnosisdescription;
		if(this.diagnoseddate == null)
			clone.diagnoseddate = null;
		else
			clone.diagnoseddate = (ims.framework.utils.PartialDate)this.diagnoseddate.clone();
		if(this.dateonset == null)
			clone.dateonset = null;
		else
			clone.dateonset = (ims.framework.utils.Date)this.dateonset.clone();
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(PatientDiagnosisWebServiceListVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientDiagnosisWebServiceListVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientDiagnosisWebServiceListVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientDiagnosisWebServiceListVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.diagnosis != null)
			count++;
		if(this.diagnosisdescription != null)
			count++;
		if(this.diagnoseddate != null)
			count++;
		if(this.dateonset != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.core.vo.DiagLiteVo diagnosis;
	protected String diagnosisdescription;
	protected ims.framework.utils.PartialDate diagnoseddate;
	protected ims.framework.utils.Date dateonset;
	private boolean isValidated = false;
	private boolean isBusy = false;
}