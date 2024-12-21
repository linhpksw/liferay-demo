/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package guestbook.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author linhpksw
 */
public class NoSuchBookDetailException extends NoSuchModelException {

	public NoSuchBookDetailException() {
	}

	public NoSuchBookDetailException(String msg) {
		super(msg);
	}

	public NoSuchBookDetailException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchBookDetailException(Throwable throwable) {
		super(throwable);
	}

}