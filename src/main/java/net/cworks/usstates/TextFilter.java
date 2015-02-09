package net.cworks.usstates;

import java.lang.reflect.Method;

public class TextFilter implements Filter {

    /**
     * A State field name that we're going to perform a filter operation on.
     */
    private String field;

    /**
     * The value to filter on
     */
    private String value;

    /**
     * Internal Filter implementation
     */
    private Filter filter;

    /**
     * The filterOp chain from whence this TextFilter has been called.
     */
    private FilterOp chain;

    /**
     * Create this TextFilter for the given field and presumably the FilterOp chain.  The FilterOp
     * argument would imply this TextFilter is one of many Filters in an Chain of Filters, where
     * each Filter will be 'applied' in order.
     * @param field field/property to filter on
     * @param chain FilterOp chain that this TextFilter will participate in
     */
    TextFilter(String field, FilterOp chain) {
        this.field = field;
        this.chain = chain;
    }

    public boolean apply(State state) {

        return filter.apply(state);
    }

    public FilterOp equal(String value) {

        return null;
    }

    public FilterOp notEqual(String value) {

        return null;
    }

    /**
     * Queue the beginsWith filter and return the FilterOp chain
     * @param value
     * @return
     */
    public FilterOp beginsWith(final String value) {

        this.filter = new Filter() {
            @Override
            public boolean apply(State state) {
                try {
                    Method method = State.class.getMethod(
                            "get" + Character.toUpperCase(field.charAt(0)) + field.substring(1));
                    Object o = method.invoke(state);
                    if(o instanceof String) {
                        String s = (String)o;
                        return s.startsWith(value);
                    }
                } catch (Exception ex) {
                    return false;
                }

                return false;
            }
        };

        return chain;
    }

    public FilterOp notBeginsWith(String value) {

        return null;
    }

    public FilterOp endsWith(String value) {

        return null;
    }

    public FilterOp notEndsWith(String value) {

        return null;
    }

    public FilterOp contains(String value) {

        return null;
    }

    public FilterOp notContains(String value) {

        return null;
    }
}
