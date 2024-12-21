/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the BookDetail service. Represents a row in the &quot;GB_BookDetail&quot; database table, with each column mapped to a property of this class.
 *
 * @author linhpksw
 * @see BookDetailModel
 * @generated
 */
@ImplementationClassName("guestbook.model.impl.BookDetailImpl")
@ProviderType
public interface BookDetail extends BookDetailModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>guestbook.model.impl.BookDetailImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<BookDetail, Long> BOOK_ID_ACCESSOR =
		new Accessor<BookDetail, Long>() {

			@Override
			public Long get(BookDetail bookDetail) {
				return bookDetail.getBookId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<BookDetail> getTypeClass() {
				return BookDetail.class;
			}

		};

}