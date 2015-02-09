package net.cworks.usstates;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StatesTest {

    private boolean chatty = false;

    @Test
    public void testFromAbbr() {

        State texas = States.fromAbbr("US-TX");

        Assert.assertEquals("US-TX", texas.getIsoCode());
        Assert.assertEquals("TX", texas.getAnsiCode());
        Assert.assertEquals(Long.valueOf(48), Long.valueOf(texas.getAnsiNumber()));
        Assert.assertEquals("TX", texas.getUsps());
        Assert.assertEquals("TX", texas.getUscg());

        texas = States.fromAbbr("TX");

        Assert.assertEquals("US-TX", texas.getIsoCode());
        Assert.assertEquals("TX", texas.getAnsiCode());
        Assert.assertEquals(Long.valueOf(48), Long.valueOf(texas.getAnsiNumber()));
        Assert.assertEquals("TX", texas.getUsps());
        Assert.assertEquals("TX", texas.getUscg());

        texas = States.fromAbbr("Tex");

        Assert.assertEquals("US-TX", texas.getIsoCode());
        Assert.assertEquals("TX", texas.getAnsiCode());
        Assert.assertEquals(Long.valueOf(48), Long.valueOf(texas.getAnsiNumber()));
        Assert.assertEquals("TX", texas.getUsps());
        Assert.assertEquals("TX", texas.getUscg());

        texas = States.fromAbbr("Tx");

        Assert.assertEquals("US-TX", texas.getIsoCode());
        Assert.assertEquals("TX", texas.getAnsiCode());
        Assert.assertEquals(Long.valueOf(48), Long.valueOf(texas.getAnsiNumber()));
        Assert.assertEquals("TX", texas.getUsps());
        Assert.assertEquals("TX", texas.getUscg());

    }

    @Test
    public void testFromAbbrAnsiCode() {

        State state = States.fromAbbr(35);
        Assert.assertEquals(Long.valueOf(35), Long.valueOf(state.getAnsiNumber()));
        Assert.assertEquals("New Mexico", state.getName());
        Assert.assertEquals("US-NM", state.getIsoCode());
        Assert.assertEquals("NM", state.getAnsiCode());
        Assert.assertEquals("NM", state.getUsps());
        Assert.assertEquals("NM", state.getUscg());
        Assert.assertEquals("N. Mex", state.getOthers()[0]);
        Assert.assertEquals("New M.", state.getOthers()[1]);
        Assert.assertEquals("N.M.", state.getOthers()[2]);
    }

    @Test
    public void testDefaultListing() {
        List<State> states = States.list();
        for(int i = 0; i < states.size(); i++) {
            if((i % 10) == 0) {
                if(i == 0) {
                    Assert.assertEquals("Alabama", states.get(i).getName());
                } else if(i == 10) {
                    Assert.assertEquals("Hawaii", states.get(i).getName());
                } else if(i == 20) {
                    Assert.assertEquals("Maine", states.get(i).getName());
                } else if(i == 30) {
                    Assert.assertEquals("New Jersey", states.get(i).getName());
                } else if(i == 40) {
                    Assert.assertEquals("South Dakota", states.get(i).getName());
                }
            }
        }
    }

    @Test
    public void testOrderByName() {
        List<State> states = States.orderBy().name().list();
        Assert.assertEquals("Alabama", states.get(0).getName());
        Assert.assertEquals("Wyoming", states.get(49).getName());

        printStates(states);
    }

    @Test
    public void testOrderByNameDesc() {
        List<State> states = States.orderBy().name(SortOrder.DESC).list();
        Assert.assertEquals("Wyoming", states.get(0).getName());
        Assert.assertEquals("Texas", states.get(7).getName());
        Assert.assertEquals("New Mexico", states.get(19).getName());
        Assert.assertEquals("Idaho", states.get(38).getName());
        Assert.assertEquals("Alabama", states.get(49).getName());

        printStates(states);
    }

    @Test
    public void testOrderByNameAndAdmissionRank() {
        List<State> states = States.orderBy().name().admissionRank().list();
        printStates(states);
    }

    @Test
    public void testOrderByNameAndAdmissionRankDesc() {
        List<State> states = States.orderBy().name(SortOrder.DESC).admissionRank(SortOrder.DESC).list();
        printStates(states);
    }

    @Test
    public void testBeginsWithNLessThan20() {
        List<State> results = States.selectBy().name().beginsWith("N").admissionRank().lt(20).list();
        Assert.assertTrue(results.contains(States.NH));
        Assert.assertTrue(results.contains(States.NJ));
        Assert.assertTrue(results.contains(States.NY));
    }

    @Test
    public void testSelectTexas() {

        List<State> results = States.selectBy().name().equal("Texas").list();
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Austin", results.get(0).getCapital());

    }

    @Test
    public void playingAround() {
        /*
        States.orderBy().admissionRank().desc().list();
        States.orderBy().isoCode().list();
        States.orderBy().name().desc().list();
        States.list();

        States.list(new Collector() {
            void value(State state) {

            }
        });
        */

        /**
         * Problem #1 implementing the ListingContext from a static method
         *
         * When selectBy or orderBy is called we create an ListingContext unique to this listing, this
         * means if selectBy is called after orderBy on the same ListingContext we don't want to create
         * a new ListingContext but associate the selectBy with the existing ListingContext.  Likewise
         * when orderBy is called after selectBy on the same ListingContext we don't want to create a
         * new ListingContext but associate the orderBy with the existing ListingContext.
         *
         */

        /**
         * Problem #2 implementing a chain of each operation
         *
         * Calling selectBy creates a new FilterOp chain and returns an appropriate Filter
         * (Text or Number) which is a link in the chain and thus returns an appropriate
         * Filter or a new or reference to the SortOp chain
         *
         */
        List<State> result = States.selectBy().name().beginsWith("N").admissionRank().lt(20).list();
        for (State state : result) {
            System.out.println(state.toString());
        }
        /*
        States.selectBy().name().equal("Texas").list();
        States.selectBy().admissionRank().lt(10).list();
        States.selectBy().name().beginsWith("New").orderBy().admissionRank().list();

        States.orderBy().name().list();

        States.orderBy().name().admissionRank().ansiCode().selectBy().name().beginsWith("A").list();

        States.orderBy().admissionRank(SortOrder.DESC)
            .selectBy().admissionRank().lt(10).list();

        //States.selectBy().admissionDate().gt("1900-01-01").orderBy().admissionDate().list();

        */
        /*
         * In thread 1
         */
        //List<State> states1 = States.orderBy().name().list();

        /*
         * At same time in thread 2 this is called.
         */
        //List<State> states2 = States.orderBy().name().desc().list();


    }

    private void printStates(List<State> states) {
        if(chatty) {
            for (State state : states) {
                System.out.println(state.toString());
            }
        }
    }

}
