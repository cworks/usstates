package net.cworks.usstates;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterOp {

    private List<State> states;

    private List<Filter> filters = new ArrayList<Filter>();

    FilterOp(List<State> states) {
        this.states = states;
    }

    /**
     * Filter the states list based on name
     * @return
     */
    public TextFilter name() {
        TextFilter filter = new TextFilter("name", this);
        filters.add(filter);
        return filter;
    }

    /**
     * Filter the states list based on isoCode
     * @return
     */
    public TextFilter isoCode() {
        TextFilter filter = new TextFilter("isoCode", this);
        filters.add(filter);
        return filter;
    }

    /**
     * Filter the states list based on ansiCode
     * @return
     */
    public TextFilter ansiCode() {
        TextFilter filter = new TextFilter("ansiCode", this);
        filters.add(filter);
        return filter;
    }

    /**
     * Filter the states list based on ansiNumber
     * @return
     */
    public NumberFilter ansiNumber() {
        NumberFilter filter = new NumberFilter("ansiNumber", this);
        filters.add(filter);
        return filter;
    }

    /**
     * Filter the states list based on usps
     * @return
     */
    public TextFilter usps() {
        TextFilter filter = new TextFilter("usps", this);
        filters.add(filter);
        return filter;
    }

    /**
     * Filter the states list based on uscg
     * @return
     */
    public TextFilter uscg() {
        TextFilter filter = new TextFilter("uscg", this);
        filters.add(filter);
        return filter;
    }

    /**
     * Filter the states list based on capital
     * @return
     */
    public TextFilter capital() {
        TextFilter filter = new TextFilter("capital", this);
        filters.add(filter);
        return filter;
    }

    /**
     * Filter the states list based on admissionDate
     * @return
     */
    public DateFilter admissionDate() {
        DateFilter filter = new DateFilter("admissionDate", this);
        filters.add(filter);
        return filter;
    }

    /**
     * Filter the states list based on admissionRank
     * @return
     */
    public NumberFilter admissionRank() {
        NumberFilter filter = new NumberFilter("admissionRank", this);
        filters.add(filter);
        return filter;
    }

    /**
     * Filter the states list based on motto
     * @return
     */
    public TextFilter motto() {
        TextFilter filter = new TextFilter("motto", this);
        filters.add(filter);
        return filter;
    }

    /**
     * Filter the states list based on nickname
     * @return
     */
    public TextFilter nickname() {
        TextFilter filter = new TextFilter("nickname", this);
        filters.add(filter);
        return filter;
    }

    /**
     * list is the terminal method that completes evaluations of each filter in
     * the chain.
     * @return
     */
    public List<State> list() {

        for(Iterator<State> iterator = states.iterator(); iterator.hasNext();) {
            State state = iterator.next();
            for(Filter select : filters) {
                if(!select.apply(state)) {
                    iterator.remove();
                    break;
                }
            }
        }

        return states;
    }

    /**
     * Caller has been using filtering and now wants to do some sorting on the
     * same context.  The SortOp will be using the same states list as this
     * FilterOp so we pass it as an argument.
     * @return
     */
    public SortOp orderBy() {
        return new SortOp(this.states);
    }
}
