package guestbook.rest.client.function;

import javax.annotation.Generated;

/**
 * @author linhp
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}