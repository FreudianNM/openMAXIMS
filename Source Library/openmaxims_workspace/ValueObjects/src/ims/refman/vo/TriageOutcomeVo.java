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

package ims.RefMan.vo;

/**
 * Linked to RefMan.TriageOutcome business object (ID: 1096100077).
 */
public class TriageOutcomeVo extends ims.RefMan.vo.TriageOutcomeRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public TriageOutcomeVo()
	{
	}
	public TriageOutcomeVo(Integer id, int version)
	{
		super(id, version);
	}
	public TriageOutcomeVo(ims.RefMan.vo.beans.TriageOutcomeVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.triageoutcomestatus = bean.getTriageOutcomeStatus() == null ? null : ims.RefMan.vo.lookups.TriageOutcomeStatus.buildLookup(bean.getTriageOutcomeStatus());
		this.accepteddetails = bean.getAcceptedDetails() == null ? null : bean.getAcceptedDetails().buildVo();
		this.triagependingdiagnosticresult = ims.RefMan.vo.LinkedDiagnosticVoCollection.buildFromBeanCollection(bean.getTriagePendingDiagnosticResult());
		this.redirectreferraldetails = bean.getRedirectReferralDetails() == null ? null : bean.getRedirectReferralDetails().buildVo();
		this.recordinguser = bean.getRecordingUser() == null ? null : new ims.core.resource.people.vo.MemberOfStaffRefVo(new Integer(bean.getRecordingUser().getId()), bean.getRecordingUser().getVersion());
		this.recordingdatetime = bean.getRecordingDateTime() == null ? null : bean.getRecordingDateTime().buildDateTime();
		this.triagependingdiagnosticresultcomment = bean.getTriagePendingDiagnosticResultComment();
		this.awaitingclinicalinformationcomment = bean.getAwaitingClinicalInformationComment();
		this.catsreferral = bean.getCatsReferral() == null ? null : new ims.RefMan.vo.CatsReferralRefVo(new Integer(bean.getCatsReferral().getId()), bean.getCatsReferral().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.TriageOutcomeVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.triageoutcomestatus = bean.getTriageOutcomeStatus() == null ? null : ims.RefMan.vo.lookups.TriageOutcomeStatus.buildLookup(bean.getTriageOutcomeStatus());
		this.accepteddetails = bean.getAcceptedDetails() == null ? null : bean.getAcceptedDetails().buildVo(map);
		this.triagependingdiagnosticresult = ims.RefMan.vo.LinkedDiagnosticVoCollection.buildFromBeanCollection(bean.getTriagePendingDiagnosticResult());
		this.redirectreferraldetails = bean.getRedirectReferralDetails() == null ? null : bean.getRedirectReferralDetails().buildVo(map);
		this.recordinguser = bean.getRecordingUser() == null ? null : new ims.core.resource.people.vo.MemberOfStaffRefVo(new Integer(bean.getRecordingUser().getId()), bean.getRecordingUser().getVersion());
		this.recordingdatetime = bean.getRecordingDateTime() == null ? null : bean.getRecordingDateTime().buildDateTime();
		this.triagependingdiagnosticresultcomment = bean.getTriagePendingDiagnosticResultComment();
		this.awaitingclinicalinformationcomment = bean.getAwaitingClinicalInformationComment();
		this.catsreferral = bean.getCatsReferral() == null ? null : new ims.RefMan.vo.CatsReferralRefVo(new Integer(bean.getCatsReferral().getId()), bean.getCatsReferral().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.TriageOutcomeVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.TriageOutcomeVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.TriageOutcomeVoBean();
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
		if(fieldName.equals("TRIAGEOUTCOMESTATUS"))
			return getTriageOutcomeStatus();
		if(fieldName.equals("ACCEPTEDDETAILS"))
			return getAcceptedDetails();
		if(fieldName.equals("TRIAGEPENDINGDIAGNOSTICRESULT"))
			return getTriagePendingDiagnosticResult();
		if(fieldName.equals("REDIRECTREFERRALDETAILS"))
			return getRedirectReferralDetails();
		if(fieldName.equals("RECORDINGUSER"))
			return getRecordingUser();
		if(fieldName.equals("RECORDINGDATETIME"))
			return getRecordingDateTime();
		if(fieldName.equals("TRIAGEPENDINGDIAGNOSTICRESULTCOMMENT"))
			return getTriagePendingDiagnosticResultComment();
		if(fieldName.equals("AWAITINGCLINICALINFORMATIONCOMMENT"))
			return getAwaitingClinicalInformationComment();
		if(fieldName.equals("CATSREFERRAL"))
			return getCatsReferral();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTriageOutcomeStatusIsNotNull()
	{
		return this.triageoutcomestatus != null;
	}
	public ims.RefMan.vo.lookups.TriageOutcomeStatus getTriageOutcomeStatus()
	{
		return this.triageoutcomestatus;
	}
	public void setTriageOutcomeStatus(ims.RefMan.vo.lookups.TriageOutcomeStatus value)
	{
		this.isValidated = false;
		this.triageoutcomestatus = value;
	}
	public boolean getAcceptedDetailsIsNotNull()
	{
		return this.accepteddetails != null;
	}
	public ims.RefMan.vo.OutcomeAcceptedDetailsVo getAcceptedDetails()
	{
		return this.accepteddetails;
	}
	public void setAcceptedDetails(ims.RefMan.vo.OutcomeAcceptedDetailsVo value)
	{
		this.isValidated = false;
		this.accepteddetails = value;
	}
	public boolean getTriagePendingDiagnosticResultIsNotNull()
	{
		return this.triagependingdiagnosticresult != null;
	}
	public ims.RefMan.vo.LinkedDiagnosticVoCollection getTriagePendingDiagnosticResult()
	{
		return this.triagependingdiagnosticresult;
	}
	public void setTriagePendingDiagnosticResult(ims.RefMan.vo.LinkedDiagnosticVoCollection value)
	{
		this.isValidated = false;
		this.triagependingdiagnosticresult = value;
	}
	public boolean getRedirectReferralDetailsIsNotNull()
	{
		return this.redirectreferraldetails != null;
	}
	public ims.RefMan.vo.RedirectReferralDetailsVo getRedirectReferralDetails()
	{
		return this.redirectreferraldetails;
	}
	public void setRedirectReferralDetails(ims.RefMan.vo.RedirectReferralDetailsVo value)
	{
		this.isValidated = false;
		this.redirectreferraldetails = value;
	}
	public boolean getRecordingUserIsNotNull()
	{
		return this.recordinguser != null;
	}
	public ims.core.resource.people.vo.MemberOfStaffRefVo getRecordingUser()
	{
		return this.recordinguser;
	}
	public void setRecordingUser(ims.core.resource.people.vo.MemberOfStaffRefVo value)
	{
		this.isValidated = false;
		this.recordinguser = value;
	}
	public boolean getRecordingDateTimeIsNotNull()
	{
		return this.recordingdatetime != null;
	}
	public ims.framework.utils.DateTime getRecordingDateTime()
	{
		return this.recordingdatetime;
	}
	public void setRecordingDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.recordingdatetime = value;
	}
	public boolean getTriagePendingDiagnosticResultCommentIsNotNull()
	{
		return this.triagependingdiagnosticresultcomment != null;
	}
	public String getTriagePendingDiagnosticResultComment()
	{
		return this.triagependingdiagnosticresultcomment;
	}
	public static int getTriagePendingDiagnosticResultCommentMaxLength()
	{
		return 5000;
	}
	public void setTriagePendingDiagnosticResultComment(String value)
	{
		this.isValidated = false;
		this.triagependingdiagnosticresultcomment = value;
	}
	public boolean getAwaitingClinicalInformationCommentIsNotNull()
	{
		return this.awaitingclinicalinformationcomment != null;
	}
	public String getAwaitingClinicalInformationComment()
	{
		return this.awaitingclinicalinformationcomment;
	}
	public static int getAwaitingClinicalInformationCommentMaxLength()
	{
		return 5000;
	}
	public void setAwaitingClinicalInformationComment(String value)
	{
		this.isValidated = false;
		this.awaitingclinicalinformationcomment = value;
	}
	public boolean getCatsReferralIsNotNull()
	{
		return this.catsreferral != null;
	}
	public ims.RefMan.vo.CatsReferralRefVo getCatsReferral()
	{
		return this.catsreferral;
	}
	public void setCatsReferral(ims.RefMan.vo.CatsReferralRefVo value)
	{
		this.isValidated = false;
		this.catsreferral = value;
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
		if(this.accepteddetails != null)
		{
			if(!this.accepteddetails.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.triagependingdiagnosticresult != null)
		{
			if(!this.triagependingdiagnosticresult.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.redirectreferraldetails != null)
		{
			if(!this.redirectreferraldetails.isValidated())
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
		if(this.triageoutcomestatus == null)
			listOfErrors.add("TriageOutcomeStatus is mandatory");
		if(this.accepteddetails != null)
		{
			String[] listOfOtherErrors = this.accepteddetails.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.triagependingdiagnosticresult != null)
		{
			String[] listOfOtherErrors = this.triagependingdiagnosticresult.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.redirectreferraldetails != null)
		{
			String[] listOfOtherErrors = this.redirectreferraldetails.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.recordinguser == null)
			listOfErrors.add("RecordingUser is mandatory");
		if(this.recordingdatetime == null)
			listOfErrors.add("RecordingDateTime is mandatory");
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
	
		TriageOutcomeVo clone = new TriageOutcomeVo(this.id, this.version);
		
		if(this.triageoutcomestatus == null)
			clone.triageoutcomestatus = null;
		else
			clone.triageoutcomestatus = (ims.RefMan.vo.lookups.TriageOutcomeStatus)this.triageoutcomestatus.clone();
		if(this.accepteddetails == null)
			clone.accepteddetails = null;
		else
			clone.accepteddetails = (ims.RefMan.vo.OutcomeAcceptedDetailsVo)this.accepteddetails.clone();
		if(this.triagependingdiagnosticresult == null)
			clone.triagependingdiagnosticresult = null;
		else
			clone.triagependingdiagnosticresult = (ims.RefMan.vo.LinkedDiagnosticVoCollection)this.triagependingdiagnosticresult.clone();
		if(this.redirectreferraldetails == null)
			clone.redirectreferraldetails = null;
		else
			clone.redirectreferraldetails = (ims.RefMan.vo.RedirectReferralDetailsVo)this.redirectreferraldetails.clone();
		clone.recordinguser = this.recordinguser;
		if(this.recordingdatetime == null)
			clone.recordingdatetime = null;
		else
			clone.recordingdatetime = (ims.framework.utils.DateTime)this.recordingdatetime.clone();
		clone.triagependingdiagnosticresultcomment = this.triagependingdiagnosticresultcomment;
		clone.awaitingclinicalinformationcomment = this.awaitingclinicalinformationcomment;
		clone.catsreferral = this.catsreferral;
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
		if (!(TriageOutcomeVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A TriageOutcomeVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((TriageOutcomeVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((TriageOutcomeVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.triageoutcomestatus != null)
			count++;
		if(this.accepteddetails != null)
			count++;
		if(this.triagependingdiagnosticresult != null)
			count++;
		if(this.redirectreferraldetails != null)
			count++;
		if(this.recordinguser != null)
			count++;
		if(this.recordingdatetime != null)
			count++;
		if(this.triagependingdiagnosticresultcomment != null)
			count++;
		if(this.awaitingclinicalinformationcomment != null)
			count++;
		if(this.catsreferral != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 9;
	}
	protected ims.RefMan.vo.lookups.TriageOutcomeStatus triageoutcomestatus;
	protected ims.RefMan.vo.OutcomeAcceptedDetailsVo accepteddetails;
	protected ims.RefMan.vo.LinkedDiagnosticVoCollection triagependingdiagnosticresult;
	protected ims.RefMan.vo.RedirectReferralDetailsVo redirectreferraldetails;
	protected ims.core.resource.people.vo.MemberOfStaffRefVo recordinguser;
	protected ims.framework.utils.DateTime recordingdatetime;
	protected String triagependingdiagnosticresultcomment;
	protected String awaitingclinicalinformationcomment;
	protected ims.RefMan.vo.CatsReferralRefVo catsreferral;
	private boolean isValidated = false;
	private boolean isBusy = false;
}