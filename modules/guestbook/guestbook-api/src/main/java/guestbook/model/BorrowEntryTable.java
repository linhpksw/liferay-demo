/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;GB_BorrowEntry&quot; database table.
 *
 * @author linhpksw
 * @see BorrowEntry
 * @generated
 */
public class BorrowEntryTable extends BaseTable<BorrowEntryTable> {

	public static final BorrowEntryTable INSTANCE = new BorrowEntryTable();

	public final Column<BorrowEntryTable, Long> mvccVersion = createColumn(
		"mvccVersion", Long.class, Types.BIGINT, Column.FLAG_NULLITY);
	public final Column<BorrowEntryTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, Long> entryId = createColumn(
		"entryId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<BorrowEntryTable, Long> bookId = createColumn(
		"bookId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, Date> borrowDate = createColumn(
		"borrowDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, Date> expectedReturnDate =
		createColumn(
			"expectedReturnDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, Date> actualReturnDate = createColumn(
		"actualReturnDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, Long> statusByUserId = createColumn(
		"statusByUserId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, String> statusByUserName =
		createColumn(
			"statusByUserName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<BorrowEntryTable, Date> statusDate = createColumn(
		"statusDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private BorrowEntryTable() {
		super("GB_BorrowEntry", BorrowEntryTable::new);
	}

}