/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BorrowEntryService}.
 *
 * @author linhpksw
 * @see BorrowEntryService
 * @generated
 */
public class BorrowEntryServiceWrapper
	implements BorrowEntryService, ServiceWrapper<BorrowEntryService> {

	public BorrowEntryServiceWrapper() {
		this(null);
	}

	public BorrowEntryServiceWrapper(BorrowEntryService borrowEntryService) {
		_borrowEntryService = borrowEntryService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _borrowEntryService.getOSGiServiceIdentifier();
	}

	@Override
	public BorrowEntryService getWrappedService() {
		return _borrowEntryService;
	}

	@Override
	public void setWrappedService(BorrowEntryService borrowEntryService) {
		_borrowEntryService = borrowEntryService;
	}

	private BorrowEntryService _borrowEntryService;

}