package guestbook.rest.internal.graphql.servlet.v1_0;

import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import guestbook.rest.internal.graphql.mutation.v1_0.Mutation;
import guestbook.rest.internal.graphql.query.v1_0.Query;
import guestbook.rest.resource.v1_0.BookDetailResource;
import guestbook.rest.resource.v1_0.BorrowEntryResource;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author linhp
 * @generated
 */
@Component(immediate = true, service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setBookDetailResourceComponentServiceObjects(
			_bookDetailResourceComponentServiceObjects);
		Mutation.setBorrowEntryResourceComponentServiceObjects(
			_borrowEntryResourceComponentServiceObjects);

		Query.setBookDetailResourceComponentServiceObjects(
			_bookDetailResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/guestbook-rest-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<BookDetailResource>
		_bookDetailResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<BorrowEntryResource>
		_borrowEntryResourceComponentServiceObjects;

}