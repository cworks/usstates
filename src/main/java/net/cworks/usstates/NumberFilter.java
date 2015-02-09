package net.cworks.usstates;

import java.lang.reflect.Method;

public class NumberFilter implements Filter {

    /**
     * A State field name that we're going to perform a filter operation on.
     */
    private String field;

    /**
     * The value to filter on
     */
    private Number value;

    /**
     * Internal filter operation
     */
    private Filter filter;

    /**
     * The filterOp chain from whence this NumberFilter has been called.
     */
    private FilterOp chain;

    NumberFilter(String field, FilterOp chain) {
        this.field = field;
        this.chain = chain;
    }

    public boolean apply(State state) {

        return filter.apply(state);
    }

    public void equal(Number value) {

    }

    public void notEqual(Number value) {

    }

    public void gt(Number value) {

    }

    public void gte(Number value) {

    }

    /**
     * Queue the less than filter operation and return the FilterOp chain
     * @param value
     * @return
     */
    public FilterOp lt(final Number value) {
        this.filter = new Filter() {
            @Override
            public boolean apply(State state) {
                try {
                    Method method = State.class.getMethod(
                            "get" + Character.toUpperCase(field.charAt(0)) + field.substring(1));
                    Object o = method.invoke(state);
                    if(o instanceof Number) {
                        Number n = (Number)o;
                        return n.floatValue() < value.floatValue();
                    }
                } catch (Exception ex) {
                    return false;
                }

                return false;
            }
        };

        return chain;
    }

    public void lte(Number value) {

    }

    public void between(Number start, Number end) {

    }

    public void top(int n) {

    }

    public void above(int n) {

    }

    public void below(int n) {

    }

    public void aboveAverage(Number value) {

    }

    public void belowAverage(Number value) {

    }



}
