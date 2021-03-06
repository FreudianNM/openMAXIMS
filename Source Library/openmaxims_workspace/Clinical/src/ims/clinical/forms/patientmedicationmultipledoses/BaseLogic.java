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

package ims.clinical.forms.patientmedicationmultipledoses;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.clinical.domain.PatientMedicationMultipleDoses.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.clinical.domain.PatientMedicationMultipleDoses domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbCommencedByValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnDetails().cmbCommencedBy().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.MedicationCommencedDiscontinuedType existingInstance = (ims.core.vo.lookups.MedicationCommencedDiscontinuedType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbCommencedByLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.MedicationCommencedDiscontinuedType)
		{
			ims.core.vo.lookups.MedicationCommencedDiscontinuedType instance = (ims.core.vo.lookups.MedicationCommencedDiscontinuedType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbCommencedByLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.MedicationCommencedDiscontinuedType existingInstance = (ims.core.vo.lookups.MedicationCommencedDiscontinuedType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnDetails().cmbCommencedBy().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbCommencedByLookup()
	{
		this.form.ctnDetails().cmbCommencedBy().clear();
		ims.core.vo.lookups.MedicationCommencedDiscontinuedTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getMedicationCommencedDiscontinuedType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnDetails().cmbCommencedBy().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbCommencedByLookupValue(int id)
	{
		ims.core.vo.lookups.MedicationCommencedDiscontinuedType instance = ims.core.vo.lookups.LookupHelper.getMedicationCommencedDiscontinuedTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnDetails().cmbCommencedBy().setValue(instance);
	}
	protected final void defaultcmbCommencedByLookupValue()
	{
		this.form.ctnDetails().cmbCommencedBy().setValue((ims.core.vo.lookups.MedicationCommencedDiscontinuedType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.MedicationCommencedDiscontinuedType.class, engine.getFormName().getID(), ims.core.vo.lookups.MedicationCommencedDiscontinuedType.TYPE_ID));
	}
	protected final void oncmbFrequencyValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnDetails().cmbFrequency().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.MedicationFrequency existingInstance = (ims.core.vo.lookups.MedicationFrequency)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbFrequencyLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.MedicationFrequency)
		{
			ims.core.vo.lookups.MedicationFrequency instance = (ims.core.vo.lookups.MedicationFrequency)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbFrequencyLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.MedicationFrequency existingInstance = (ims.core.vo.lookups.MedicationFrequency)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnDetails().cmbFrequency().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbFrequencyLookup()
	{
		this.form.ctnDetails().cmbFrequency().clear();
		ims.core.vo.lookups.MedicationFrequencyCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getMedicationFrequency(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnDetails().cmbFrequency().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbFrequencyLookupValue(int id)
	{
		ims.core.vo.lookups.MedicationFrequency instance = ims.core.vo.lookups.LookupHelper.getMedicationFrequencyInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnDetails().cmbFrequency().setValue(instance);
	}
	protected final void defaultcmbFrequencyLookupValue()
	{
		this.form.ctnDetails().cmbFrequency().setValue((ims.core.vo.lookups.MedicationFrequency)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.MedicationFrequency.class, engine.getFormName().getID(), ims.core.vo.lookups.MedicationFrequency.TYPE_ID));
	}
	protected final void oncmbSourceValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnDetails().cmbSource().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceofInformation existingInstance = (ims.core.vo.lookups.SourceofInformation)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbSourceLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.SourceofInformation)
		{
			ims.core.vo.lookups.SourceofInformation instance = (ims.core.vo.lookups.SourceofInformation)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbSourceLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceofInformation existingInstance = (ims.core.vo.lookups.SourceofInformation)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnDetails().cmbSource().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbSourceLookup()
	{
		this.form.ctnDetails().cmbSource().clear();
		ims.core.vo.lookups.SourceofInformationCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getSourceofInformation(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnDetails().cmbSource().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbSourceLookupValue(int id)
	{
		ims.core.vo.lookups.SourceofInformation instance = ims.core.vo.lookups.LookupHelper.getSourceofInformationInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnDetails().cmbSource().setValue(instance);
	}
	protected final void defaultcmbSourceLookupValue()
	{
		this.form.ctnDetails().cmbSource().setValue((ims.core.vo.lookups.SourceofInformation)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.SourceofInformation.class, engine.getFormName().getID(), ims.core.vo.lookups.SourceofInformation.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.clinical.domain.PatientMedicationMultipleDoses domain;
}
