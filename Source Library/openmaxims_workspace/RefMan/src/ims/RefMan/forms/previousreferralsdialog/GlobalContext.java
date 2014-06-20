// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.previousreferralsdialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		RefMan = new RefManContext(context);
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPreviousReferralsIsNotNull()
		{
			return !cx_RefManPreviousReferrals.getValueIsNull(context);
		}
		public ims.RefMan.vo.CatsReferralForClinicalNotesVoCollection getPreviousReferrals()
		{
			return (ims.RefMan.vo.CatsReferralForClinicalNotesVoCollection)cx_RefManPreviousReferrals.getValue(context);
		}
		public void setPreviousReferrals(ims.RefMan.vo.CatsReferralForClinicalNotesVoCollection value)
		{
			cx_RefManPreviousReferrals.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManPreviousReferrals = new ims.framework.ContextVariable("RefMan.PreviousReferrals", "_cv_RefMan.PreviousReferrals");

		private ims.framework.Context context;
	}

	public RefManContext RefMan;
}