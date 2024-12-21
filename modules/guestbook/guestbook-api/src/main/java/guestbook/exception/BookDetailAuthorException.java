/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package guestbook.exception;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author linhpksw
 */
public class BookDetailAuthorException extends PortalException {

	public BookDetailAuthorException() {
	}

	public BookDetailAuthorException(String msg) {
		super(msg);
	}

	public BookDetailAuthorException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public BookDetailAuthorException(Throwable throwable) {
		super(throwable);
	}

}