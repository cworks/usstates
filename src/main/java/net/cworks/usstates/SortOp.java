package net.cworks.usstates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static net.cworks.usstates.StateComparator.desc;


public class SortOp {

    private List<State> states;

    private FilterOp filterOp;

    private List<Comparator> comparators = new ArrayList<Comparator>();

    SortOp(List<State> states) {
        this.states = states;
    }

    SortOp(FilterOp filterOp) {
        this.filterOp = filterOp;
    }

    /**
     * Ascending sort by name
     * @return continued SortContext
     */
    public SortOp name() {
        comparators.add(new StateComparator("name"));
        return this;
    }

    /**
     * Ascending or descending sort by name
     * @param orderBy asc or desc
     * @return continued SortContext
     */
    public SortOp name(SortOrder orderBy) {
        if(orderBy == SortOrder.DESC) {
            comparators.add(desc(new StateComparator("name")));
            return this;
        }

        return name();
    }

    /**
     * Ascending sort by isoCode
     * @return continued SortContext
     */
    public SortOp isoCode() {
        comparators.add(new StateComparator("isoCode"));
        return this;
    }

    /**
     * Ascending or descending sort by isoCode
     * @param orderBy asc or desc
     * @return continued SortContext
     */
    public SortOp isoCode(SortOrder orderBy) {
        if(orderBy == SortOrder.DESC) {
            comparators.add(desc(new StateComparator("isoCode")));
            return this;
        }

        return isoCode();
    }

    /**
     * Ascending sort by ansiCode
     * @return continued SortContext
     */
    public SortOp ansiCode() {
        comparators.add(new StateComparator("ansiCode"));
        return this;
    }

    /**
     * Ascending or descending sort by ansiCode
     * @param orderBy asc or desc
     * @return continued SortContext
     */
    public SortOp ansiCode(SortOrder orderBy) {
        if(orderBy == SortOrder.DESC) {
            comparators.add(desc(new StateComparator("ansiCode")));
            return this;
        }

        return ansiCode();
    }

    /**
     * Ascending sort by ansiNumber
     * @return continued SortContext
     */
    public SortOp ansiNumber() {
        comparators.add(new StateComparator("ansiNumber"));
        return this;
    }

    /**
     * Ascending or descending sort by ansiNumber
     * @param orderBy asc or desc
     * @return continued SortContext
     */
    public SortOp ansiNumber(SortOrder orderBy) {
        if(orderBy == SortOrder.DESC) {
            comparators.add(desc(new StateComparator("ansiNumber")));
            return this;
        }

        return ansiNumber();
    }

    /**
     * Ascending sort by usps
     * @return continued SortContext
     */
    public SortOp usps() {
        comparators.add(new StateComparator("usps"));
        return this;
    }

    /**
     * Ascending or descending sort by usps
     * @param orderBy asc or desc
     * @return continued SortContext
     */
    public SortOp usps(SortOrder orderBy) {
        if(orderBy == SortOrder.DESC) {
            comparators.add(desc(new StateComparator("usps")));
            return this;
        }

        return usps();
    }

    /**
     * Ascending sort by uscg
     * @return continued SortContext
     */
    public SortOp uscg() {
        comparators.add(new StateComparator("uscg"));
        return this;
    }

    /**
     * Ascending or descending sort by uscg
     * @param orderBy asc or desc
     * @return continued SortContext
     */
    public SortOp uscg(SortOrder orderBy) {
        if(orderBy == SortOrder.DESC) {
            comparators.add(desc(new StateComparator("uscg")));
            return this;
        }

        return uscg();
    }

    /**
     * Ascending sort by capital
     * @return continued SortContext
     */
    public SortOp capital() {
        comparators.add(new StateComparator("capital"));
        return this;
    }

    /**
     * Ascending or descending sort by capital
     * @param orderBy asc or desc
     * @return continued SortContext
     */
    public SortOp capital(SortOrder orderBy) {
        if(orderBy == SortOrder.DESC) {
            comparators.add(desc(new StateComparator("capital")));
            return this;
        }

        return capital();
    }

    /**
     * Ascending sort by admissionDate
     * @return continued SortContext
     */
    public SortOp admissionDate() {
        comparators.add(new StateComparator("admissionDate"));
        return this;
    }

    /**
     * Ascending or descending sort by admissionDate
     * @param orderBy asc or desc
     * @return continued SortContext
     */
    public SortOp admissionDate(SortOrder orderBy) {
        if(orderBy == SortOrder.DESC) {
            comparators.add(desc(new StateComparator("admissionDate")));
            return this;
        }

        return admissionDate();
    }

    /**
     * Ascending sort by admissionRank
     * @return continued SortContext
     */
    public SortOp admissionRank() {
        comparators.add(new StateComparator("admissionRank"));
        return this;
    }

    /**
     * Ascending or descending sort by admissionRank
     * @param orderBy asc or desc
     * @return continued SortContext
     */
    public SortOp admissionRank(SortOrder orderBy) {
        if(orderBy == SortOrder.DESC) {
            comparators.add(desc(new StateComparator("admissionRank")));
            return this;
        }

        return admissionRank();
    }

    /**
     * Ascending sort by motto
     * @return continued SortContext
     */
    public SortOp motto() {
        comparators.add(new StateComparator("motto"));
        return this;
    }

    /**
     * Ascending or descending sort by motto
     * @param orderBy asc or desc
     * @return continued SortContext
     */
    public SortOp motto(SortOrder orderBy) {
        if(orderBy == SortOrder.DESC) {
            comparators.add(desc(new StateComparator("motto")));
            return this;
        }

        return motto();
    }

    /**
     * Ascending sort by nickname
     * @return continued SortContext
     */
    public SortOp nickname() {
        comparators.add(new StateComparator("nickname"));
        return this;
    }

    /**
     * Ascending or descending sort by nickname
     * @param orderBy asc or desc
     * @return continued SortContext
     */
    public SortOp nickname(SortOrder orderBy) {
        if(orderBy == SortOrder.DESC) {
            comparators.add(desc(new StateComparator("nickname")));
            return this;
        }

        return nickname();
    }

    /**
     * Apply any sort order and return an unmodifiable list of states (in sorted order of course)
     * @return
     */
    public List<State> list() {
        Collections.sort(states, getComparator());
        return Collections.unmodifiableList(states);
    }

    public FilterOp filterBy() {

        return null;
    }

    private Comparator<State> getComparator() {

        return new Comparator<State>() {
            @Override
            public int compare(State s1, State s2) {
                for(Comparator option : comparators) {
                    int result = option.compare(s1, s2);
                    if(result != 0) {
                        return result;
                    }
                }
                return 0;
            }
        };

    }

}
