/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BookDetailService}.
 *
 * @author linhpksw
 * @see BookDetailService
 * @generated
 */
public class BookDetailServiceWrapper
	implements BookDetailService, ServiceWrapper<BookDetailService> {

	public BookDetailServiceWrapper() {
		this(null);
	}

	public BookDetailServiceWrapper(BookDetailService bookDetailService) {
		_bookDetailService = bookDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bookDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public BookDetailService getWrappedService() {
		return _bookDetailService;
	}

	@Override
	public void setWrappedService(BookDetailService bookDetailService) {
		_bookDetailService = bookDetailService;
	}

	private BookDetailService _bookDetailService;

}