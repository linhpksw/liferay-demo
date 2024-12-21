/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package guestbook.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author linhpksw
 */
public class NoSuchBorrowEntryException extends NoSuchModelException {

	public NoSuchBorrowEntryException() {
	}

	public NoSuchBorrowEntryException(String msg) {
		super(msg);
	}

	public NoSuchBorrowEntryException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchBorrowEntryException(Throwable throwable) {
		super(throwable);
	}

}