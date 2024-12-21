/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package guestbook.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.model.BaseModel;

import guestbook.model.GuestbookTable;
import guestbook.model.impl.GuestbookImpl;
import guestbook.model.impl.GuestbookModelImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.service.component.annotations.Component;

/**
 * The arguments resolver class for retrieving value from Guestbook.
 *
 * @author linhpksw
 * @generated
 */
@Component(
	property = {
		"class.name=guestbook.model.impl.GuestbookImpl",
		"table.name=GB_Guestbook"
	},
	service = ArgumentsResolver.class
)
public class GuestbookModelArgumentsResolver implements ArgumentsResolver {

	@Override
	public Object[] getArguments(
		FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
		boolean original) {

		String[] columnNames = finderPath.getColumnNames();

		if ((columnNames == null) || (columnNames.length == 0)) {
			if (baseModel.isNew()) {
				return new Object[0];
			}

			return null;
		}

		GuestbookModelImpl guestbookModelImpl = (GuestbookModelImpl)baseModel;

		long columnBitmask = guestbookModelImpl.getColumnBitmask();

		if (!checkColumn || (columnBitmask == 0)) {
			return _getValue(guestbookModelImpl, columnNames, original);
		}

		Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
			finderPath);

		if (finderPathColumnBitmask == null) {
			finderPathColumnBitmask = 0L;

			for (String columnName : columnNames) {
				finderPathColumnBitmask |= guestbookModelImpl.getColumnBitmask(
					columnName);
			}

			_finderPathColumnBitmasksCache.put(
				finderPath, finderPathColumnBitmask);
		}

		if ((columnBitmask & finderPathColumnBitmask) != 0) {
			return _getValue(guestbookModelImpl, columnNames, original);
		}

		return null;
	}

	@Override
	public String getClassName() {
		return GuestbookImpl.class.getName();
	}

	@Override
	public String getTableName() {
		return GuestbookTable.INSTANCE.getTableName();
	}

	private static Object[] _getValue(
		GuestbookModelImpl guestbookModelImpl, String[] columnNames,
		boolean original) {

		Object[] arguments = new Object[columnNames.length];

		for (int i = 0; i < arguments.length; i++) {
			String columnName = columnNames[i];

			if (original) {
				arguments[i] = guestbookModelImpl.getColumnOriginalValue(
					columnName);
			}
			else {
				arguments[i] = guestbookModelImpl.getColumnValue(columnName);
			}
		}

		return arguments;
	}

	private static final Map<FinderPath, Long> _finderPathColumnBitmasksCache =
		new ConcurrentHashMap<>();

}