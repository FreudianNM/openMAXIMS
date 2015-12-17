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

package ims.emergency.forms.systemreview;

import ims.framework.*;
import ims.framework.controls.*;
import ims.framework.enumerations.*;
import ims.framework.utils.RuntimeAnchoring;

public class GenForm extends FormBridge
{
	private static final long serialVersionUID = 1L;

	protected void fireCustomControlValueChanged()
	{
		super.fireValueChanged();
	}
	public boolean canProvideData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).canProvideData();
	}
	public boolean hasData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).hasData();
	}
	public IReportField[] getData(IReportSeed[] reportSeeds)
	{
		return getData(reportSeeds, false);
	}
	public IReportField[] getData(IReportSeed[] reportSeeds, boolean excludeNulls)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields(), excludeNulls).getData();
	}
	public static class grdSystemReviewRow extends GridRowBridge
	{
		private static final long serialVersionUID = 1L;
		
		protected grdSystemReviewRow(GridRow row)
		{
			super(row);
		}
		public void showOpened(int column)
		{
			super.row.showOpened(column);
		}
		public void setColumnSystemReviewReadOnly(boolean value)
		{
			super.row.setReadOnly(0, value);
		}
		public boolean isColumnSystemReviewReadOnly()
		{
			return super.row.isReadOnly(0);
		}
		public void showColumnSystemReviewOpened()
		{
			super.row.showOpened(0);
		}
		public void setTooltipForColumnSystemReview(String value)
		{
			super.row.setTooltip(0, value);
		}
		public String getColumnSystemReview()
		{
			return (String)super.row.get(0);
		}
		public void setColumnSystemReview(String value)
		{
			super.row.set(0, value);
		}
		public void setCellColumnSystemReviewTooltip(String value)
		{
			super.row.setTooltip(0, value);
		}
		public void setColumnAuthoringDateTimeReadOnly(boolean value)
		{
			super.row.setReadOnly(1, value);
		}
		public boolean isColumnAuthoringDateTimeReadOnly()
		{
			return super.row.isReadOnly(1);
		}
		public void showColumnAuthoringDateTimeOpened()
		{
			super.row.showOpened(1);
		}
		public void setTooltipForColumnAuthoringDateTime(String value)
		{
			super.row.setTooltip(1, value);
		}
		public String getColumnAuthoringDateTime()
		{
			return (String)super.row.get(1);
		}
		public void setColumnAuthoringDateTime(String value)
		{
			super.row.set(1, value);
		}
		public void setCellColumnAuthoringDateTimeTooltip(String value)
		{
			super.row.setTooltip(1, value);
		}
		public void setColumnAuthoringHCPReadOnly(boolean value)
		{
			super.row.setReadOnly(2, value);
		}
		public boolean isColumnAuthoringHCPReadOnly()
		{
			return super.row.isReadOnly(2);
		}
		public void showColumnAuthoringHCPOpened()
		{
			super.row.showOpened(2);
		}
		public void setTooltipForColumnAuthoringHCP(String value)
		{
			super.row.setTooltip(2, value);
		}
		public String getColumnAuthoringHCP()
		{
			return (String)super.row.get(2);
		}
		public void setColumnAuthoringHCP(String value)
		{
			super.row.set(2, value);
		}
		public void setCellColumnAuthoringHCPTooltip(String value)
		{
			super.row.setTooltip(2, value);
		}
		public void setColumnNoteReadOnly(boolean value)
		{
			super.row.setReadOnly(3, value);
		}
		public boolean isColumnNoteReadOnly()
		{
			return super.row.isReadOnly(3);
		}
		public void showColumnNoteOpened()
		{
			super.row.showOpened(3);
		}
		public void setTooltipForColumnNote(String value)
		{
			super.row.setTooltip(3, value);
		}
		public String getColumnNote()
		{
			return (String)super.row.get(3);
		}
		public void setColumnNote(String value)
		{
			super.row.set(3, value);
		}
		public void setCellColumnNoteTooltip(String value)
		{
			super.row.setTooltip(3, value);
		}
		public ims.emergency.vo.SystemReviewVo getValue()
		{
			return (ims.emergency.vo.SystemReviewVo)super.row.getValue();
		}
		public void setValue(ims.emergency.vo.SystemReviewVo value)
		{
			super.row.setValue(value);
		}
	}
	public static class grdSystemReviewRowCollection extends GridRowCollectionBridge
	{
		private static final long serialVersionUID = 1L;
		
		private grdSystemReviewRowCollection(GridRowCollection collection)
		{
			super(collection);
		}
		public grdSystemReviewRow get(int index)
		{
			return new grdSystemReviewRow(super.collection.get(index));
		}
		public grdSystemReviewRow newRow()
		{
			return new grdSystemReviewRow(super.collection.newRow());
		}
		public grdSystemReviewRow newRow(boolean autoSelect)
		{
			return new grdSystemReviewRow(super.collection.newRow(autoSelect));
		}
		public grdSystemReviewRow newRowAt(int index)
		{
			return new grdSystemReviewRow(super.collection.newRowAt(index));
		}
		public grdSystemReviewRow newRowAt(int index, boolean autoSelect)
		{
			return new grdSystemReviewRow(super.collection.newRowAt(index, autoSelect));
		}
	}
	public static class grdSystemReviewGrid extends GridBridge
	{
		private static final long serialVersionUID = 1L;
		
		private void addStringColumn(String caption, int captionAlignment, int alignment, int width, boolean readOnly, boolean bold, int sortOrder, int maxLength, boolean canGrow, ims.framework.enumerations.CharacterCasing casing)
		{
			super.grid.addStringColumn(caption, captionAlignment, alignment, width, readOnly, bold, sortOrder, maxLength, canGrow, casing);
		}
		public ims.emergency.vo.SystemReviewVoCollection getValues()
		{
			ims.emergency.vo.SystemReviewVoCollection listOfValues = new ims.emergency.vo.SystemReviewVoCollection();
			for(int x = 0; x < this.getRows().size(); x++)
			{
				listOfValues.add(this.getRows().get(x).getValue());
			}
			return listOfValues;
		}
		public ims.emergency.vo.SystemReviewVo getValue()
		{
			return (ims.emergency.vo.SystemReviewVo)super.grid.getValue();
		}
		public void setValue(ims.emergency.vo.SystemReviewVo value)
		{
			super.grid.setValue(value);
		}
		public grdSystemReviewRow getSelectedRow()
		{
			return super.grid.getSelectedRow() == null ? null : new grdSystemReviewRow(super.grid.getSelectedRow());
		}
		public int getSelectedRowIndex()
		{
			return super.grid.getSelectedRowIndex();
		}
		public grdSystemReviewRowCollection getRows()
		{
			return new grdSystemReviewRowCollection(super.grid.getRows());
		}
		public grdSystemReviewRow getRowByValue(ims.emergency.vo.SystemReviewVo value)
		{
			GridRow row = super.grid.getRowByValue(value);
			return row == null?null:new grdSystemReviewRow(row);
		}
		public void setColumnSystemReviewHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(0, value);
		}
		public String getColumnSystemReviewHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(0);
		}
		public void setColumnAuthoringDateTimeHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(1, value);
		}
		public String getColumnAuthoringDateTimeHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(1);
		}
		public void setColumnAuthoringHCPHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(2, value);
		}
		public String getColumnAuthoringHCPHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(2);
		}
		public void setColumnNoteHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(3, value);
		}
		public String getColumnNoteHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(3);
		}
	}
	private void validateContext(ims.framework.Context context)
	{
		if(context == null)
			return;
		if(!context.isValidContextType(ims.core.vo.PatientShort.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.PatientShort' of the global context variable 'Core.PatientShort' is not supported.");
		if(!context.isValidContextType(ims.core.vo.CareContextShortVo.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.CareContextShortVo' of the global context variable 'Core.CurrentCareContext' is not supported.");
	}
	public boolean supportsRecordedInError()
	{
		return true;
	}
	public ims.vo.ValueObject getRecordedInErrorVo()
	{
		return this.getLocalContext().getSelectedSystemReview();
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context) throws Exception
	{
		setContext(loader, form, appForm, factory, context, Boolean.FALSE, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context, Boolean skipContextValidation) throws Exception
	{
		setContext(loader, form, appForm, factory, context, skipContextValidation, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, ims.framework.Context context, Boolean skipContextValidation, Integer startControlID, ims.framework.utils.SizeInfo runtimeSize, ims.framework.Control control, Integer startTabIndex) throws Exception
	{
		if(loader == null); // this is to avoid eclipse warning only.
		if(factory == null); // this is to avoid eclipse warning only.
		if(runtimeSize == null); // this is to avoid eclipse warning only.
		if(appForm == null)
			throw new RuntimeException("Invalid application form");
		if(startControlID == null)
			throw new RuntimeException("Invalid startControlID");
		if(control == null); // this is to avoid eclipse warning only.
		if(startTabIndex == null)
			throw new RuntimeException("Invalid startTabIndex");
		this.context = context;
		this.componentIdentifier = startControlID.toString();
		this.formInfo = form.getFormInfo();
		this.globalContext = new GlobalContext(context);
	
		if(skipContextValidation == null || !skipContextValidation.booleanValue())
		{
			validateContext(context);
		}
	
		super.setContext(form);

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(672, 392);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setFormReferences(FormReferencesFlyweightFactory.getInstance().create(Forms.class));
		super.setGlobalContext(ContextBridgeFlyweightFactory.getInstance().create(GlobalContextBridge.class, context, false));
		super.setLocalContext(new LocalContext(context, form.getFormInfo(), componentIdentifier));


		// Button Controls
		RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 168, 368, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(anchoringHelper1.getX()), new Integer(anchoringHelper1.getY()), new Integer(anchoringHelper1.getWidth()), new Integer(anchoringHelper1.getHeight()), new Integer(startTabIndex.intValue() + 4), ControlState.UNKNOWN, ControlState.DISABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT, "RIE Note", Boolean.TRUE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper2 = new RuntimeAnchoring(designSize, runtimeSize, 88, 368, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1001), new Integer(anchoringHelper2.getX()), new Integer(anchoringHelper2.getY()), new Integer(anchoringHelper2.getWidth()), new Integer(anchoringHelper2.getHeight()), new Integer(startTabIndex.intValue() + 3), ControlState.UNKNOWN, ControlState.DISABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT, "Correct Note", Boolean.TRUE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper3 = new RuntimeAnchoring(designSize, runtimeSize, 8, 368, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1002), new Integer(anchoringHelper3.getX()), new Integer(anchoringHelper3.getY()), new Integer(anchoringHelper3.getWidth()), new Integer(anchoringHelper3.getHeight()), new Integer(startTabIndex.intValue() + 2), ControlState.UNKNOWN, ControlState.DISABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT, "New Review", Boolean.TRUE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));

		// Grid Controls
		RuntimeAnchoring anchoringHelper4 = new RuntimeAnchoring(designSize, runtimeSize, 8, 8, 656, 352, ims.framework.enumerations.ControlAnchoring.ALL);
		Grid m_grdSystemReviewTemp = (Grid)factory.getControl(Grid.class, new Object[] { control, new Integer(startControlID.intValue() + 1003), new Integer(anchoringHelper4.getX()), new Integer(anchoringHelper4.getY()), new Integer(anchoringHelper4.getWidth()), new Integer(anchoringHelper4.getHeight()), new Integer(startTabIndex.intValue() + 1), ControlState.READONLY, ControlState.DISABLED, ims.framework.enumerations.ControlAnchoring.ALL,Boolean.TRUE, Boolean.FALSE, new Integer(24), Boolean.TRUE, null, Boolean.FALSE, Boolean.FALSE, new Integer(0), null, Boolean.FALSE, Boolean.TRUE});
		addControl(m_grdSystemReviewTemp);
		grdSystemReviewGrid grdSystemReview = (grdSystemReviewGrid)GridFlyweightFactory.getInstance().createGridBridge(grdSystemReviewGrid.class, m_grdSystemReviewTemp);
		grdSystemReview.addStringColumn("System Reviewed", 0, 0, 146, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdSystemReview.addStringColumn("Authoring Date Time", 0, 0, 145, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdSystemReview.addStringColumn("Authoring HCP", 0, 0, 145, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdSystemReview.addStringColumn("Notes", 0, 0, -1, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		super.addGrid(grdSystemReview);
	}



	public Forms getForms()
	{
		return (Forms)super.getFormReferences();
	}
	public Button btnRie()
	{
		return (Button)super.getControl(0);
	}
	public Button btnCorrect()
	{
		return (Button)super.getControl(1);
	}
	public Button btnNew()
	{
		return (Button)super.getControl(2);
	}
	public grdSystemReviewGrid grdSystemReview()
	{
		return (grdSystemReviewGrid)super.getGrid(0);
	}

	public static class Forms implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		protected final class LocalFormName extends FormName
		{
			private static final long serialVersionUID = 1L;
		
			private LocalFormName(int name)
			{
				super(name);
			}
		}

		private Forms()
		{
			Emergency = new EmergencyForms();
			Core = new CoreForms();
		}
		public final class EmergencyForms implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private EmergencyForms()
			{
				SystemsReviewDialog = new LocalFormName(129152);
				SystemReview = new LocalFormName(129151);
				SystemReviewNotesDialog = new LocalFormName(129197);
				NoteCorrectionDialog = new LocalFormName(129199);
			}
			public final FormName SystemsReviewDialog;
			public final FormName SystemReview;
			public final FormName SystemReviewNotesDialog;
			public final FormName NoteCorrectionDialog;
		}
		public final class CoreForms implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private CoreForms()
			{
				RieConfirmationDialog = new LocalFormName(102370);
			}
			public final FormName RieConfirmationDialog;
		}

		public EmergencyForms Emergency;
		public CoreForms Core;
	}

	public GlobalContext getGlobalContext()
	{
		return this.globalContext;
	}
	public static class GlobalContextBridge extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
	}
	public LocalContext getLocalContext()
	{
		return (LocalContext)super.getLocalCtx();
	}
	public class LocalContext extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
		
		public LocalContext(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			super.setContext(context);
			String prefix = formInfo.getLocalVariablesPrefix();
			cxl_SelectedSystemReview = new ims.framework.ContextVariable("SelectedSystemReview", prefix + "_lv_Emergency.SystemReview.__internal_x_context__SelectedSystemReview_" + componentIdentifier + "");
			cxl_PatientRef = new ims.framework.ContextVariable("PatientRef", prefix + "_lv_Emergency.SystemReview.__internal_x_context__PatientRef_" + componentIdentifier + "");
			cxl_CareContextRef = new ims.framework.ContextVariable("CareContextRef", prefix + "_lv_Emergency.SystemReview.__internal_x_context__CareContextRef_" + componentIdentifier + "");
			cxl_EpisodeOfCareRef = new ims.framework.ContextVariable("EpisodeOfCareRef", prefix + "_lv_Emergency.SystemReview.__internal_x_context__EpisodeOfCareRef_" + componentIdentifier + "");
			cxl_ClinicalProblemRef = new ims.framework.ContextVariable("ClinicalProblemRef", prefix + "_lv_Emergency.SystemReview.__internal_x_context__ClinicalProblemRef_" + componentIdentifier + "");
			cxl_isEnabled = new ims.framework.ContextVariable("isEnabled", prefix + "_lv_Emergency.SystemReview.__internal_x_context__isEnabled_" + componentIdentifier + "");
			cxl_SelectedEvent = new ims.framework.ContextVariable("SelectedEvent", prefix + "_lv_Emergency.SystemReview.__internal_x_context__SelectedEvent_" + componentIdentifier + "");
		}
		
		public boolean getSelectedSystemReviewIsNotNull()
		{
			return !cxl_SelectedSystemReview.getValueIsNull(context);
		}
		public ims.emergency.vo.SystemReviewVo getSelectedSystemReview()
		{
			return (ims.emergency.vo.SystemReviewVo)cxl_SelectedSystemReview.getValue(context);
		}
		public void setSelectedSystemReview(ims.emergency.vo.SystemReviewVo value)
		{
			cxl_SelectedSystemReview.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_SelectedSystemReview = null;
		public boolean getPatientRefIsNotNull()
		{
			return !cxl_PatientRef.getValueIsNull(context);
		}
		public ims.core.patient.vo.PatientRefVo getPatientRef()
		{
			return (ims.core.patient.vo.PatientRefVo)cxl_PatientRef.getValue(context);
		}
		public void setPatientRef(ims.core.patient.vo.PatientRefVo value)
		{
			if(value != null && (value.getBoId() == null || value.getBoId().intValue() < 1))
				throw new ims.framework.exceptions.CodingRuntimeException("Invalid domain object id for 'PatientRef' RefVo context variable.");
			if(value == null)
				cxl_PatientRef.setValue(context, null);
			else
				cxl_PatientRef.setValue(context, new ims.core.patient.vo.PatientRefVo(value.getBoId(), value.getBoVersion()));
		}
		private ims.framework.ContextVariable cxl_PatientRef = null;
		public boolean getCareContextRefIsNotNull()
		{
			return !cxl_CareContextRef.getValueIsNull(context);
		}
		public ims.core.admin.vo.CareContextRefVo getCareContextRef()
		{
			return (ims.core.admin.vo.CareContextRefVo)cxl_CareContextRef.getValue(context);
		}
		public void setCareContextRef(ims.core.admin.vo.CareContextRefVo value)
		{
			if(value != null && (value.getBoId() == null || value.getBoId().intValue() < 1))
				throw new ims.framework.exceptions.CodingRuntimeException("Invalid domain object id for 'CareContextRef' RefVo context variable.");
			if(value == null)
				cxl_CareContextRef.setValue(context, null);
			else
				cxl_CareContextRef.setValue(context, new ims.core.admin.vo.CareContextRefVo(value.getBoId(), value.getBoVersion()));
		}
		private ims.framework.ContextVariable cxl_CareContextRef = null;
		public boolean getEpisodeOfCareRefIsNotNull()
		{
			return !cxl_EpisodeOfCareRef.getValueIsNull(context);
		}
		public ims.core.admin.vo.EpisodeOfCareRefVo getEpisodeOfCareRef()
		{
			return (ims.core.admin.vo.EpisodeOfCareRefVo)cxl_EpisodeOfCareRef.getValue(context);
		}
		public void setEpisodeOfCareRef(ims.core.admin.vo.EpisodeOfCareRefVo value)
		{
			if(value != null && (value.getBoId() == null || value.getBoId().intValue() < 1))
				throw new ims.framework.exceptions.CodingRuntimeException("Invalid domain object id for 'EpisodeOfCareRef' RefVo context variable.");
			if(value == null)
				cxl_EpisodeOfCareRef.setValue(context, null);
			else
				cxl_EpisodeOfCareRef.setValue(context, new ims.core.admin.vo.EpisodeOfCareRefVo(value.getBoId(), value.getBoVersion()));
		}
		private ims.framework.ContextVariable cxl_EpisodeOfCareRef = null;
		public boolean getClinicalProblemRefIsNotNull()
		{
			return !cxl_ClinicalProblemRef.getValueIsNull(context);
		}
		public ims.clinical.configuration.vo.ClinicalProblemRefVo getClinicalProblemRef()
		{
			return (ims.clinical.configuration.vo.ClinicalProblemRefVo)cxl_ClinicalProblemRef.getValue(context);
		}
		public void setClinicalProblemRef(ims.clinical.configuration.vo.ClinicalProblemRefVo value)
		{
			if(value != null && (value.getBoId() == null || value.getBoId().intValue() < 1))
				throw new ims.framework.exceptions.CodingRuntimeException("Invalid domain object id for 'ClinicalProblemRef' RefVo context variable.");
			if(value == null)
				cxl_ClinicalProblemRef.setValue(context, null);
			else
				cxl_ClinicalProblemRef.setValue(context, new ims.clinical.configuration.vo.ClinicalProblemRefVo(value.getBoId(), value.getBoVersion()));
		}
		private ims.framework.ContextVariable cxl_ClinicalProblemRef = null;
		public boolean getisEnabledIsNotNull()
		{
			return !cxl_isEnabled.getValueIsNull(context);
		}
		public Boolean getisEnabled()
		{
			return (Boolean)cxl_isEnabled.getValue(context);
		}
		public void setisEnabled(Boolean value)
		{
			cxl_isEnabled.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_isEnabled = null;
		public boolean getSelectedEventIsNotNull()
		{
			return !cxl_SelectedEvent.getValueIsNull(context);
		}
		public ims.emergency.vo.enums.EdAssessment_CustomControlsEvents getSelectedEvent()
		{
			return (ims.emergency.vo.enums.EdAssessment_CustomControlsEvents)cxl_SelectedEvent.getValue(context);
		}
		public void setSelectedEvent(ims.emergency.vo.enums.EdAssessment_CustomControlsEvents value)
		{
			cxl_SelectedEvent.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_SelectedEvent = null;
	}
	private IReportField[] getFormReportFields()
	{
		if(this.context == null)
			return null;
		if(this.reportFields == null)
			this.reportFields = new ReportFields(this.context, this.formInfo, this.componentIdentifier).getReportFields();
		return this.reportFields;
	}
	private class ReportFields
	{
		public ReportFields(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			this.context = context;
			this.formInfo = formInfo;
			this.componentIdentifier = componentIdentifier;
		}
		public IReportField[] getReportFields()
		{
			String prefix = formInfo.getLocalVariablesPrefix();
			IReportField[] fields = new IReportField[91];
			fields[0] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ID", "ID_Patient");
			fields[1] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SEX", "Sex");
			fields[2] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOB", "Dob");
			fields[3] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOD", "Dod");
			fields[4] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-RELIGION", "Religion");
			fields[5] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISACTIVE", "IsActive");
			fields[6] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ETHNICORIGIN", "EthnicOrigin");
			fields[7] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-MARITALSTATUS", "MaritalStatus");
			fields[8] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SCN", "SCN");
			fields[9] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SOURCEOFINFORMATION", "SourceOfInformation");
			fields[10] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-TIMEOFDEATH", "TimeOfDeath");
			fields[11] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISQUICKREGISTRATIONPATIENT", "IsQuickRegistrationPatient");
			fields[12] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-CURRENTRESPONSIBLECONSULTANT", "CurrentResponsibleConsultant");
			fields[13] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-ID", "ID_Patient");
			fields[14] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-SEX", "Sex");
			fields[15] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-DOB", "Dob");
			fields[16] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ID", "ID_ClinicalContact");
			fields[17] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-SPECIALTY", "Specialty");
			fields[18] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CONTACTTYPE", "ContactType");
			fields[19] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-STARTDATETIME", "StartDateTime");
			fields[20] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ENDDATETIME", "EndDateTime");
			fields[21] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CARECONTEXT", "CareContext");
			fields[22] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ISCLINICALNOTECREATED", "IsClinicalNoteCreated");
			fields[23] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ID", "ID_Hcp");
			fields[24] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-HCPTYPE", "HcpType");
			fields[25] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISACTIVE", "IsActive");
			fields[26] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISHCPARESPONSIBLEHCP", "IsHCPaResponsibleHCP");
			fields[27] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISARESPONSIBLEEDCLINICIAN", "IsAResponsibleEDClinician");
			fields[28] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ID", "ID_CareContext");
			fields[29] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-CONTEXT", "Context");
			fields[30] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ORDERINGHOSPITAL", "OrderingHospital");
			fields[31] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ESTIMATEDDISCHARGEDATE", "EstimatedDischargeDate");
			fields[32] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-STARTDATETIME", "StartDateTime");
			fields[33] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ENDDATETIME", "EndDateTime");
			fields[34] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-LOCATIONTYPE", "LocationType");
			fields[35] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-RESPONSIBLEHCP", "ResponsibleHCP");
			fields[36] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ID", "ID_EpisodeOfCare");
			fields[37] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-CARESPELL", "CareSpell");
			fields[38] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-SPECIALTY", "Specialty");
			fields[39] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-RELATIONSHIP", "Relationship");
			fields[40] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-STARTDATE", "StartDate");
			fields[41] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ENDDATE", "EndDate");
			fields[42] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[43] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALNOTE", "ClinicalNote");
			fields[44] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTETYPE", "NoteType");
			fields[45] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-DISCIPLINE", "Discipline");
			fields[46] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALCONTACT", "ClinicalContact");
			fields[47] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISDERIVEDNOTE", "IsDerivedNote");
			fields[48] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEW", "ForReview");
			fields[49] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[50] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-REVIEWINGDATETIME", "ReviewingDateTime");
			fields[51] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISCORRECTED", "IsCorrected");
			fields[52] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISTRANSCRIBED", "IsTranscribed");
			fields[53] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-SOURCEOFNOTE", "SourceOfNote");
			fields[54] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-RECORDINGDATETIME", "RecordingDateTime");
			fields[55] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-INHOSPITALREPORT", "InHospitalReport");
			fields[56] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[57] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[58] = new ims.framework.ReportField(this.context, "_cvp_STHK.AvailableBedsListFilter", "BO-1014100009-ID", "ID_BedSpaceState");
			fields[59] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ID", "ID_PendingEmergencyAdmission");
			fields[60] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ADMISSIONSTATUS", "AdmissionStatus");
			fields[61] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ID", "ID_InpatientEpisode");
			fields[62] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ESTDISCHARGEDATE", "EstDischargeDate");
			fields[63] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[64] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEW", "ForReview");
			fields[65] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[66] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[67] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[68] = new ims.framework.ReportField(this.context, "_cvp_Core.PasEvent", "BO-1014100003-ID", "ID_PASEvent");
			fields[69] = new ims.framework.ReportField(this.context, "_cvp_Correspondence.CorrespondenceDetails", "BO-1052100001-ID", "ID_CorrespondenceDetails");
			fields[70] = new ims.framework.ReportField(this.context, "_cvp_RefMan.CatsReferral", "BO-1004100035-ID", "ID_CatsReferral");
			fields[71] = new ims.framework.ReportField(this.context, "_cv_Emergency.SystemReview", "BO-1086100022-ID", "ID_SystemsReview");
			fields[72] = new ims.framework.ReportField(this.context, "_cv_Emergency.SystemReview", "BO-1086100022-PATIENT", "Patient");
			fields[73] = new ims.framework.ReportField(this.context, "_cv_Emergency.SystemReview", "BO-1086100022-EPISODE", "Episode");
			fields[74] = new ims.framework.ReportField(this.context, "_cv_Emergency.SystemReview", "BO-1086100022-ATTENDANCE", "Attendance");
			fields[75] = new ims.framework.ReportField(this.context, "_cv_Emergency.SystemReview", "BO-1086100022-SYSTEMREVIEWNOTE", "SystemReviewNote");
			fields[76] = new ims.framework.ReportField(this.context, "_cv_Emergency.SystemReview", "BO-1086100022-SYSTEMS", "Systems");
			fields[77] = new ims.framework.ReportField(this.context, "_cv_Emergency.SystemReview", "BO-1086100022-ISCORRECTED", "IsCorrected");
			fields[78] = new ims.framework.ReportField(this.context, "_cv_Emergency.SystemReview", "BO-1086100022-CORRECTIONCOMMENTS", "CorrectionComments");
			fields[79] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.SystemReview.__internal_x_context__SelectedSystemReview_" + componentIdentifier, "BO-1086100022-ID", "ID_SystemsReview");
			fields[80] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.SystemReview.__internal_x_context__SelectedSystemReview_" + componentIdentifier, "BO-1086100022-PATIENT", "Patient");
			fields[81] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.SystemReview.__internal_x_context__SelectedSystemReview_" + componentIdentifier, "BO-1086100022-EPISODE", "Episode");
			fields[82] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.SystemReview.__internal_x_context__SelectedSystemReview_" + componentIdentifier, "BO-1086100022-ATTENDANCE", "Attendance");
			fields[83] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.SystemReview.__internal_x_context__SelectedSystemReview_" + componentIdentifier, "BO-1086100022-SYSTEMREVIEWNOTE", "SystemReviewNote");
			fields[84] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.SystemReview.__internal_x_context__SelectedSystemReview_" + componentIdentifier, "BO-1086100022-SYSTEMS", "Systems");
			fields[85] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.SystemReview.__internal_x_context__SelectedSystemReview_" + componentIdentifier, "BO-1086100022-ISCORRECTED", "IsCorrected");
			fields[86] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.SystemReview.__internal_x_context__SelectedSystemReview_" + componentIdentifier, "BO-1086100022-CORRECTIONCOMMENTS", "CorrectionComments");
			fields[87] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.SystemReview.__internal_x_context__PatientRef_" + componentIdentifier, "BO-1001100000-ID", "ID_Patient");
			fields[88] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.SystemReview.__internal_x_context__CareContextRef_" + componentIdentifier, "BO-1004100019-ID", "ID_CareContext");
			fields[89] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.SystemReview.__internal_x_context__EpisodeOfCareRef_" + componentIdentifier, "BO-1004100018-ID", "ID_EpisodeOfCare");
			fields[90] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.SystemReview.__internal_x_context__ClinicalProblemRef_" + componentIdentifier, "BO-1073100005-ID", "ID_ClinicalProblem");
			return fields;
		}
		protected Context context = null;
		protected ims.framework.FormInfo formInfo;
		protected String componentIdentifier;
	}
	public String getUniqueIdentifier()
	{
		return formInfo.getLocalVariablesPrefix() + formInfo.getNamespaceName() + formInfo.getFormName() + formInfo.getFormId() + "_" + this.componentIdentifier;
	}
	private Context context = null;
	private ims.framework.FormInfo formInfo = null;
	private String componentIdentifier;
	private GlobalContext globalContext = null;
	private IReportField[] reportFields = null;
}