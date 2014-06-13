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

package ims.clinicaladmin.vo;

/**
 * Linked to Oncology.Configuration.TumourCategory business object (ID: 1074100008).
 */
public class TumourCategoryVo extends ims.clinicaladmin.vo.TumourCategoryListVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TumourCategoryVo()
	{
	}
	public TumourCategoryVo(Integer id, int version)
	{
		super(id, version);
	}
	public TumourCategoryVo(ims.clinicaladmin.vo.beans.TumourCategoryVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.categoryname = bean.getCategoryName();
		this.categorydescription = bean.getCategoryDescription();
		this.isactive = bean.getIsActive();
		if(bean.getVersionGroups() != null)
		{
			this.versiongroups = new ims.oncology.configuration.vo.TumourCategoryVersionGroupsRefVoCollection();
			for(int versiongroups_i = 0; versiongroups_i < bean.getVersionGroups().length; versiongroups_i++)
			{
				this.versiongroups.add(new ims.oncology.configuration.vo.TumourCategoryVersionGroupsRefVo(new Integer(bean.getVersionGroups()[versiongroups_i].getId()), bean.getVersionGroups()[versiongroups_i].getVersion()));
			}
		}
		this.taxonomymap = ims.core.vo.TaxonomyMapCollection.buildFromBeanCollection(bean.getTaxonomyMap());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinicaladmin.vo.beans.TumourCategoryVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.categoryname = bean.getCategoryName();
		this.categorydescription = bean.getCategoryDescription();
		this.isactive = bean.getIsActive();
		if(bean.getVersionGroups() != null)
		{
			this.versiongroups = new ims.oncology.configuration.vo.TumourCategoryVersionGroupsRefVoCollection();
			for(int versiongroups_i = 0; versiongroups_i < bean.getVersionGroups().length; versiongroups_i++)
			{
				this.versiongroups.add(new ims.oncology.configuration.vo.TumourCategoryVersionGroupsRefVo(new Integer(bean.getVersionGroups()[versiongroups_i].getId()), bean.getVersionGroups()[versiongroups_i].getVersion()));
			}
		}
		this.taxonomymap = ims.core.vo.TaxonomyMapCollection.buildFromBeanCollection(bean.getTaxonomyMap());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinicaladmin.vo.beans.TumourCategoryVoBean bean = null;
		if(map != null)
			bean = (ims.clinicaladmin.vo.beans.TumourCategoryVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinicaladmin.vo.beans.TumourCategoryVoBean();
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
		if(fieldName.equals("TAXONOMYMAP"))
			return getTaxonomyMap();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTaxonomyMapIsNotNull()
	{
		return this.taxonomymap != null;
	}
	public ims.core.vo.TaxonomyMapCollection getTaxonomyMap()
	{
		return this.taxonomymap;
	}
	public void setTaxonomyMap(ims.core.vo.TaxonomyMapCollection value)
	{
		this.isValidated = false;
		this.taxonomymap = value;
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
		if(this.taxonomymap != null)
		{
			if(!this.taxonomymap.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.categoryname == null || this.categoryname.length() == 0)
			listOfErrors.add("CategoryName is mandatory");
		else if(this.categoryname.length() > 255)
			listOfErrors.add("The length of the field [categoryname] in the value object [ims.clinicaladmin.vo.TumourCategoryVo] is too big. It should be less or equal to 255");
		if(this.categorydescription != null)
			if(this.categorydescription.length() > 255)
				listOfErrors.add("The length of the field [categorydescription] in the value object [ims.clinicaladmin.vo.TumourCategoryVo] is too big. It should be less or equal to 255");
		if(this.taxonomymap != null)
		{
			String[] listOfOtherErrors = this.taxonomymap.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
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
	
		TumourCategoryVo clone = new TumourCategoryVo(this.id, this.version);
		
		clone.categoryname = this.categoryname;
		clone.categorydescription = this.categorydescription;
		clone.isactive = this.isactive;
		clone.versiongroups = this.versiongroups;
		if(this.taxonomymap == null)
			clone.taxonomymap = null;
		else
			clone.taxonomymap = (ims.core.vo.TaxonomyMapCollection)this.taxonomymap.clone();
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
		if (!(TumourCategoryVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TumourCategoryVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TumourCategoryVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TumourCategoryVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.taxonomymap != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 1;
	}
	protected ims.core.vo.TaxonomyMapCollection taxonomymap;
	private boolean isValidated = false;
	private boolean isBusy = false;
}