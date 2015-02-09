package net.cworks.usstates;

import java.util.Comparator;

public class StateComparator implements Comparator<State> {

    /**
     * field within State instance this Comparator will check against
     */
    private String field;

    public StateComparator(String field) {
        this.field = field;
    }

    @Override
    public int compare(final State state1, final State state2) {

        if("name".equalsIgnoreCase(field)) {
            return state1.getName().compareToIgnoreCase(state2.getName());
        }

        if("isoCode".equalsIgnoreCase(field)) {
            return state1.getIsoCode().compareToIgnoreCase(state2.getIsoCode());
        }

        if("ansiCode".equalsIgnoreCase(field)) {
            return state1.getAnsiCode().compareToIgnoreCase(state2.getAnsiCode());
        }

        if("usps".equalsIgnoreCase(field)) {
            return state1.getUsps().compareToIgnoreCase(state2.getUsps());
        }

        if("uscg".equalsIgnoreCase(field)) {
            return state1.getUscg().compareToIgnoreCase(state2.getUscg());
        }

        if("capital".equalsIgnoreCase(field)) {
            return state1.getCapital().compareToIgnoreCase(state2.getCapital());
        }

        if("motto".equalsIgnoreCase(field)) {
            return state1.getMotto().compareToIgnoreCase(state2.getMotto());
        }

        if("nickname".equalsIgnoreCase(field)) {
            return state1.getNickname().compareToIgnoreCase(state2.getNickname());
        }

        if("ansiNumber".equalsIgnoreCase(field)) {
            return state1.getAnsiNumber().compareTo(state2.getAnsiNumber());
        }

        if("admissionRank".equalsIgnoreCase(field)) {
            return state1.getAdmissionRank().compareTo(state2.getAdmissionRank());
        }

        if("admissionDate".equalsIgnoreCase(field)) {
            return state1.getAdmissionDate().compareTo(state2.getAdmissionDate());
        }


        return state1.getName().compareToIgnoreCase(state2.getName());
    }

    /**
     * Return a Comparator that represents the opposite (descending) evaluation
     * @param other
     * @return
     */
    public static Comparator<State> desc(final Comparator<State> other) {

        return new Comparator<State>() {
            @Override
            public int compare(State state1, State state2) {
                return -1 * other.compare(state1, state2);
            }
        };
    }
}
