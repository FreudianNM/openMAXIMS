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

package ims.core.forms.pdspatientsearch;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode
{
	abstract protected void bindcmbLocalSearchIdTypeLookup();
	abstract protected void defaultcmbLocalSearchIdTypeLookupValue();
	abstract protected void bindcmbLocalSearchCountyLookup();
	abstract protected void defaultcmbLocalSearchCountyLookupValue();
	abstract protected void bindcmbLocalSearchSexLookup();
	abstract protected void defaultcmbLocalSearchSexLookupValue();
	abstract protected void bindcmbPdsSearchSexLookup();
	abstract protected void defaultcmbPdsSearchSexLookupValue();
	abstract protected void onFormModeChanged();
	abstract protected void onMessageBoxClosed(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onBtnSelectClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDyngrdSearchRowSelectionChanged(ims.framework.controls.DynamicGridRow row) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onDyngrdSearchColumnHeaderClicked(ims.framework.controls.DynamicGridColumn column);
	abstract protected void onlyrSearchTabChanged(ims.framework.LayerBridge tab);
	abstract protected void onImbLocalSearchPoscodeClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbLocalSearchIdTypeValueSet(Object value);
	abstract protected void onChkExtendedDoDValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkExtendedDoBValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbLocalSearchCountyValueSet(Object value);
	abstract protected void oncmbLocalSearchSexValueSet(Object value);
	abstract protected void onChkLocalSearchSwapNamesChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onTxtLocalSearchForenameValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onTxtLocalSearchSurnameValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbLocalSearchClearClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbLocalSearchSearchClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbLocalSearchNewPatClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbPdsSearchClearClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbPdsSearchSearchClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbPdsSearchNewPatClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbPdsSearchGPClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbPdsSearchPostcodeClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkPdsSearchAlgorithmicTraceValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkPdsSearchExtendedDoDValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onChkPdsSearchExtendedDoBValueChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbPdsSearchSexValueSet(Object value);
	abstract protected void onChkPdsSearchSwapNamesChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onTimer(ims.framework.controls.Timer timer) throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setFormModeChangedEvent(new FormModeChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle()
			{
				onFormModeChanged();
			}
		});
		this.form.setMessageBoxClosedEvent(new MessageBoxClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onMessageBoxClosed(messageBoxId, result);
			}
		});
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
				onFormOpen(args);
			}
		});
		this.form.setFormDialogClosedEvent(new FormDialogClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormDialogClosed(formName, result);
			}
		});
		this.form.btnSelect().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onBtnSelectClick();
			}
		});
		this.form.dyngrdSearch().setDynamicGridRowSelectionChangedEvent(new DynamicGridRowSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.DynamicGridRow row, ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onDyngrdSearchRowSelectionChanged(row);
			}
		});
		this.form.dyngrdSearch().setDynamicGridColumnHeaderClickedEvent(new DynamicGridColumnHeaderClicked()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.DynamicGridColumn column) throws ims.framework.exceptions.PresentationLogicException
			{
				onDyngrdSearchColumnHeaderClicked(column);
			}
		});
		this.form.lyrSearch().tabLocalSearch().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrSearchtabLocalSearchActivated();
			}
		});
		this.form.lyrSearch().tabPDSSearch().setTabActivatedEvent(new ims.framework.delegates.TabActivated()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onlyrSearchtabPDSSearchActivated();
			}
		});
		this.form.lyrSearch().tabLocalSearch().imbLocalSearchPoscode().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbLocalSearchPoscodeClick();
			}
		});
		this.form.lyrSearch().tabLocalSearch().cmbLocalSearchIdType().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbLocalSearchIdTypeValueSet(value);
			}
		});
		this.form.lyrSearch().tabLocalSearch().chkLocalSearchExtendedDoD().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkExtendedDoDValueChanged();
			}
		});
		this.form.lyrSearch().tabLocalSearch().chkLocalSearchExtendedDoB().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkExtendedDoBValueChanged();
			}
		});
		this.form.lyrSearch().tabLocalSearch().cmbLocalSearchCounty().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbLocalSearchCountyValueSet(value);
			}
		});
		this.form.lyrSearch().tabLocalSearch().cmbLocalSearchSex().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbLocalSearchSexValueSet(value);
			}
		});
		this.form.lyrSearch().tabLocalSearch().chkLocalSearchSwapNames().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkLocalSearchSwapNamesChanged();
			}
		});
		this.form.lyrSearch().tabLocalSearch().txtLocalSearchForename().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onTxtLocalSearchForenameValueChanged();
			}
		});
		this.form.lyrSearch().tabLocalSearch().txtLocalSearchSurname().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onTxtLocalSearchSurnameValueChanged();
			}
		});
		this.form.lyrSearch().tabLocalSearch().imbLocalSearchClear().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbLocalSearchClearClick();
			}
		});
		this.form.lyrSearch().tabLocalSearch().imbLocalSearchSearch().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbLocalSearchSearchClick();
			}
		});
		this.form.lyrSearch().tabLocalSearch().imbLocalSearchNewPat().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbLocalSearchNewPatClick();
			}
		});
		this.form.lyrSearch().tabPDSSearch().imbPdsSearchClear().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbPdsSearchClearClick();
			}
		});
		this.form.lyrSearch().tabPDSSearch().imbPdsSearchSearch().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbPdsSearchSearchClick();
			}
		});
		this.form.lyrSearch().tabPDSSearch().imbPdsSearchNewPat().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbPdsSearchNewPatClick();
			}
		});
		this.form.lyrSearch().tabPDSSearch().imbPdsSearchGP().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbPdsSearchGPClick();
			}
		});
		this.form.lyrSearch().tabPDSSearch().imbPdsSearchPostcode().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbPdsSearchPostcodeClick();
			}
		});
		this.form.lyrSearch().tabPDSSearch().chkPdsSearchAlgorithmicTrace().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkPdsSearchAlgorithmicTraceValueChanged();
			}
		});
		this.form.lyrSearch().tabPDSSearch().chkPdsSearchExtendedDoD().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkPdsSearchExtendedDoDValueChanged();
			}
		});
		this.form.lyrSearch().tabPDSSearch().chkPdsSearchExtendedDoB().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkPdsSearchExtendedDoBValueChanged();
			}
		});
		this.form.lyrSearch().tabPDSSearch().cmbPdsSearchSex().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbPdsSearchSexValueSet(value);
			}
		});
		this.form.lyrSearch().tabPDSSearch().chkPdsSearchSwap().setValueChangedEvent(new ValueChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onChkPdsSearchSwapNamesChanged();
			}
		});
		this.form.setTimerElapsedEvent(new ims.framework.delegates.TimerElapsed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.controls.Timer timer) throws ims.framework.exceptions.PresentationLogicException
			{
				onTimer(timer);
			}
		});
		this.form.getContextMenus().Core.getPDSPatientSearcchMenuSelectItem().setClickEvent(new ims.framework.delegates.MenuItemClick()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
			{
				onContextMenuItemClick(GenForm.ContextMenus.CoreNamespace.PDSPatientSearcchMenu.Select, sender);
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbLocalSearchIdTypeLookup();
		bindcmbLocalSearchCountyLookup();
		bindcmbLocalSearchSexLookup();
		bindcmbPdsSearchSexLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbLocalSearchIdTypeLookup();
		bindcmbLocalSearchCountyLookup();
		bindcmbLocalSearchSexLookup();
		bindcmbPdsSearchSexLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbLocalSearchIdTypeLookupValue();
		defaultcmbLocalSearchCountyLookupValue();
		defaultcmbLocalSearchSexLookupValue();
		defaultcmbPdsSearchSexLookupValue();
	}
	private void onlyrSearchtabLocalSearchActivated()
	{
		this.form.lyrSearch().showtabLocalSearch();
		onlyrSearchTabChanged(this.form.lyrSearch().tabLocalSearch());
	}
	private void onlyrSearchtabPDSSearchActivated()
	{
		this.form.lyrSearch().showtabPDSSearch();
		onlyrSearchTabChanged(this.form.lyrSearch().tabPDSSearch());
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}