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

package ims.ccosched.forms.unconfirmedappointments;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		CcoSched = new CcoSchedContext(context);
		Core = new CoreContext(context);
	}
	public final class CcoSchedContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CcoSchedContext(ims.framework.Context context)
		{
			this.context = context;

			BookingConfirmation = new BookingConfirmationContext(context);
			BookingSystemType = new BookingSystemTypeContext(context);
			PatientSearch = new PatientSearchContext(context);
			TreatmentPlan = new TreatmentPlanContext(context);
			ActivityView = new ActivityViewContext(context);
			CancelledAppointments = new CancelledAppointmentsContext(context);
			ClinicView = new ClinicViewContext(context);
			ClinicViewCancel = new ClinicViewCancelContext(context);
			LetterType = new LetterTypeContext(context);
		}
		public final class BookingConfirmationContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private BookingConfirmationContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getAPPT_UNIDIsNotNull()
			{
				return !cx_CcoSchedBookingConfirmationAPPT_UNID.getValueIsNull(context);
			}
			public Integer getAPPT_UNID()
			{
				return (Integer)cx_CcoSchedBookingConfirmationAPPT_UNID.getValue(context);
			}
		public void setAPPT_UNID(Integer value)
		{
				cx_CcoSchedBookingConfirmationAPPT_UNID.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedBookingConfirmationAPPT_UNID = new ims.framework.ContextVariable("CcoSched.BookingConfirmation.APPT_UNID", "_cv_CcoSched.BookingConfirmation.APPT_UNID");
			private ims.framework.Context context;
		}
		public final class BookingSystemTypeContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private BookingSystemTypeContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getSystemTypeIsNotNull()
			{
				return !cx_CcoSchedBookingSystemTypeSystemType.getValueIsNull(context);
			}
			public String getSystemType()
			{
				return (String)cx_CcoSchedBookingSystemTypeSystemType.getValue(context);
			}
		public void setSystemType(String value)
		{
				cx_CcoSchedBookingSystemTypeSystemType.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedBookingSystemTypeSystemType = new ims.framework.ContextVariable("CcoSched.BookingSystemType.SystemType", "_cv_CcoSched.BookingSystemType.SystemType");
			private ims.framework.Context context;
		}
		public final class PatientSearchContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private PatientSearchContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getAliveIsNotNull()
			{
				return !cx_CcoSchedPatientSearchAlive.getValueIsNull(context);
			}
			public Boolean getAlive()
			{
				return (Boolean)cx_CcoSchedPatientSearchAlive.getValue(context);
			}
		public void setAlive(Boolean value)
		{
				cx_CcoSchedPatientSearchAlive.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedPatientSearchAlive = new ims.framework.ContextVariable("CcoSched.PatientSearch.Alive", "_cv_CcoSched.PatientSearch.Alive");
			private ims.framework.Context context;
		}
		public final class TreatmentPlanContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private TreatmentPlanContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getActionIDIsNotNull()
			{
				return !cx_CcoSchedTreatmentPlanActionID.getValueIsNull(context);
			}
			public String getActionID()
			{
				return (String)cx_CcoSchedTreatmentPlanActionID.getValue(context);
			}
		public void setActionID(String value)
		{
				cx_CcoSchedTreatmentPlanActionID.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedTreatmentPlanActionID = new ims.framework.ContextVariable("CcoSched.TreatmentPlan.ActionID", "_cv_CcoSched.TreatmentPlan.ActionID");
			public boolean getTreatmentPlanDetailsIsNotNull()
			{
				return !cx_CcoSchedTreatmentPlanTreatmentPlanDetails.getValueIsNull(context);
			}
			public ims.dto.client.Go_ptreatpl.Go_ptreatplRecord getTreatmentPlanDetails()
			{
				return (ims.dto.client.Go_ptreatpl.Go_ptreatplRecord)cx_CcoSchedTreatmentPlanTreatmentPlanDetails.getValue(context);
			}
		public void setTreatmentPlanDetails(ims.dto.client.Go_ptreatpl.Go_ptreatplRecord value)
		{
				cx_CcoSchedTreatmentPlanTreatmentPlanDetails.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedTreatmentPlanTreatmentPlanDetails = new ims.framework.ContextVariable("CcoSched.TreatmentPlan.TreatmentPlanDetails", "_cv_CcoSched.TreatmentPlan.TreatmentPlanDetails");
			private ims.framework.Context context;
		}
		public final class ActivityViewContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private ActivityViewContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getActivitiesIsNotNull()
			{
				return !cx_CcoSchedActivityViewActivities.getValueIsNull(context);
			}
			public ims.dto.client.Sd_activity getActivities()
			{
				return (ims.dto.client.Sd_activity)cx_CcoSchedActivityViewActivities.getValue(context);
			}
		public void setActivities(ims.dto.client.Sd_activity value)
		{
				cx_CcoSchedActivityViewActivities.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedActivityViewActivities = new ims.framework.ContextVariable("CcoSched.ActivityView.Activities", "_cv_CcoSched.ActivityView.Activities");
			public boolean getActivityGroupsIsNotNull()
			{
				return !cx_CcoSchedActivityViewActivityGroups.getValueIsNull(context);
			}
			public ims.dto.client.Sd_activity_grp getActivityGroups()
			{
				return (ims.dto.client.Sd_activity_grp)cx_CcoSchedActivityViewActivityGroups.getValue(context);
			}
		public void setActivityGroups(ims.dto.client.Sd_activity_grp value)
		{
				cx_CcoSchedActivityViewActivityGroups.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedActivityViewActivityGroups = new ims.framework.ContextVariable("CcoSched.ActivityView.ActivityGroups", "_cv_CcoSched.ActivityView.ActivityGroups");
			private ims.framework.Context context;
		}
		public final class CancelledAppointmentsContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private CancelledAppointmentsContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getRebookAppointmentDetailIsNotNull()
			{
				return !cx_CcoSchedCancelledAppointmentsRebookAppointmentDetail.getValueIsNull(context);
			}
			public String getRebookAppointmentDetail()
			{
				return (String)cx_CcoSchedCancelledAppointmentsRebookAppointmentDetail.getValue(context);
			}
		public void setRebookAppointmentDetail(String value)
		{
				cx_CcoSchedCancelledAppointmentsRebookAppointmentDetail.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedCancelledAppointmentsRebookAppointmentDetail = new ims.framework.ContextVariable("CcoSched.CancelledAppointments.RebookAppointmentDetail", "_cv_CcoSched.CancelledAppointments.RebookAppointmentDetail");
			private ims.framework.Context context;
		}
		public final class ClinicViewContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private ClinicViewContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getAppointmentHeaderIDIsNotNull()
			{
				return !cx_CcoSchedClinicViewAppointmentHeaderID.getValueIsNull(context);
			}
			public String getAppointmentHeaderID()
			{
				return (String)cx_CcoSchedClinicViewAppointmentHeaderID.getValue(context);
			}
		public void setAppointmentHeaderID(String value)
		{
				cx_CcoSchedClinicViewAppointmentHeaderID.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedClinicViewAppointmentHeaderID = new ims.framework.ContextVariable("CcoSched.ClinicView.AppointmentHeaderID", "_cv_CcoSched.ClinicView.AppointmentHeaderID");
			public boolean getAppointmentIDListIsNotNull()
			{
				return !cx_CcoSchedClinicViewAppointmentIDList.getValueIsNull(context);
			}
			public java.util.ArrayList getAppointmentIDList()
			{
				return (java.util.ArrayList)cx_CcoSchedClinicViewAppointmentIDList.getValue(context);
			}
		public void setAppointmentIDList(java.util.ArrayList value)
		{
				cx_CcoSchedClinicViewAppointmentIDList.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedClinicViewAppointmentIDList = new ims.framework.ContextVariable("CcoSched.ClinicView.AppointmentIDList", "_cv_CcoSched.ClinicView.AppointmentIDList");
			public boolean getPatientDetailsIsNotNull()
			{
				return !cx_CcoSchedClinicViewPatientDetails.getValueIsNull(context);
			}
			public ims.dto.client.Patient.PatientRecord getPatientDetails()
			{
				return (ims.dto.client.Patient.PatientRecord)cx_CcoSchedClinicViewPatientDetails.getValue(context);
			}
		public void setPatientDetails(ims.dto.client.Patient.PatientRecord value)
		{
				cx_CcoSchedClinicViewPatientDetails.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedClinicViewPatientDetails = new ims.framework.ContextVariable("CcoSched.ClinicView.PatientDetails", "_cv_CcoSched.ClinicView.PatientDetails");
			private ims.framework.Context context;
		}
		public final class ClinicViewCancelContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private ClinicViewCancelContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getDialogTitleIsNotNull()
			{
				return !cx_CcoSchedClinicViewCancelDialogTitle.getValueIsNull(context);
			}
			public String getDialogTitle()
			{
				return (String)cx_CcoSchedClinicViewCancelDialogTitle.getValue(context);
			}
		public void setDialogTitle(String value)
		{
				cx_CcoSchedClinicViewCancelDialogTitle.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedClinicViewCancelDialogTitle = new ims.framework.ContextVariable("CcoSched.ClinicViewCancel.DialogTitle", "_cv_CcoSched.ClinicViewCancel.DialogTitle");
			private ims.framework.Context context;
		}
		public final class LetterTypeContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private LetterTypeContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getPatientLetterIsNotNull()
			{
				return !cx_CcoSchedLetterTypePatientLetter.getValueIsNull(context);
			}
			public Boolean getPatientLetter()
			{
				return (Boolean)cx_CcoSchedLetterTypePatientLetter.getValue(context);
			}
		public void setPatientLetter(Boolean value)
		{
				cx_CcoSchedLetterTypePatientLetter.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_CcoSchedLetterTypePatientLetter = new ims.framework.ContextVariable("CcoSched.LetterType.PatientLetter", "_cv_CcoSched.LetterType.PatientLetter");
			private ims.framework.Context context;
		}

		public boolean getSelectLetterTypeIsNotNull()
		{
			return !cx_CcoSchedSelectLetterType.getValueIsNull(context);
		}
		public String getSelectLetterType()
		{
			return (String)cx_CcoSchedSelectLetterType.getValue(context);
		}
		public void setSelectLetterType(String value)
		{
			cx_CcoSchedSelectLetterType.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CcoSchedSelectLetterType = new ims.framework.ContextVariable("CcoSched.SelectLetterType", "_cv_CcoSched.SelectLetterType");
		public boolean getAppointmentHeaderIdIsNotNull()
		{
			return !cx_CcoSchedAppointmentHeaderId.getValueIsNull(context);
		}
		public String getAppointmentHeaderId()
		{
			return (String)cx_CcoSchedAppointmentHeaderId.getValue(context);
		}
		public void setAppointmentHeaderId(String value)
		{
			cx_CcoSchedAppointmentHeaderId.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CcoSchedAppointmentHeaderId = new ims.framework.ContextVariable("CcoSched.AppointmentHeaderId", "_cv_CcoSched.AppointmentHeaderId");
		public boolean getAppointmentIdIsNotNull()
		{
			return !cx_CcoSchedAppointmentId.getValueIsNull(context);
		}
		public String getAppointmentId()
		{
			return (String)cx_CcoSchedAppointmentId.getValue(context);
		}
		public void setAppointmentId(String value)
		{
			cx_CcoSchedAppointmentId.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CcoSchedAppointmentId = new ims.framework.ContextVariable("CcoSched.AppointmentId", "_cv_CcoSched.AppointmentId");

		public BookingConfirmationContext BookingConfirmation;
		public BookingSystemTypeContext BookingSystemType;
		public PatientSearchContext PatientSearch;
		public TreatmentPlanContext TreatmentPlan;
		public ActivityViewContext ActivityView;
		public CancelledAppointmentsContext CancelledAppointments;
		public ClinicViewContext ClinicView;
		public ClinicViewCancelContext ClinicViewCancel;
		public LetterTypeContext LetterType;
		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}
		public void setPatientShort(ims.core.vo.PatientShort value)
		{
			cx_CorePatientShort.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");

		private ims.framework.Context context;
	}

	public CcoSchedContext CcoSched;
	public CoreContext Core;
}
