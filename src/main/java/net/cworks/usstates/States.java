package net.cworks.usstates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class States {

    private static final Map<String, List<State>> index = new HashMap<String, List<State>>();

    public static final State AL = new State().name("Alabama")
            .isoCode("US-AL")
            .ansiCode("AL")
            .ansiNumber(1)
            .usps("AL")
            .uscg("AL")
            .others("Ala")
            .admissionDate(toDate("1819-12-14"))
            .admissionRank(22)
            .capital("Montgomery")
            .motto("We dare defend our rights")
            .nickname("Heart of Dixie");

    public static final State AK = new State().name("Alaska")
            .isoCode("US-AK")
            .ansiCode("AK")
            .ansiNumber(2)
            .usps("AK")
            .uscg("AK")
            .others("Alas")
            .admissionDate(toDate("1959-01-03"))
            .admissionRank(49)
            .capital("Juneau")
            .motto("North to the Future")
            .nickname("The Last Frontier");

    public static final State AZ = new State().name("Arizona")
            .isoCode("US-AZ")
            .ansiCode("AZ")
            .ansiNumber(4)
            .usps("AZ")
            .uscg("AZ")
            .others("Ariz")
            .admissionDate(toDate("1912-02-14"))
            .admissionRank(48)
            .capital("Phoenix")
            .motto("God Enriches")
            .nickname("The Grand Canyon State");

    public static final State AR = new State().name("Arkansas")
            .isoCode("US-AR")
            .ansiCode("AR")
            .ansiNumber(5)
            .usps("AR")
            .uscg("AR")
            .others("Ark")
            .admissionDate(toDate("1836-06-15"))
            .admissionRank(25)
            .capital("Little Rock")
            .motto("The People Rule")
            .nickname("The Natural State");

    public static final State CA = new State().name("California")
            .isoCode("US-CA")
            .ansiCode("CA")
            .ansiNumber(6)
            .usps("CA")
            .uscg("CF")
            .others("Calif", "Cali", "Cal")
            .admissionDate(toDate("1850-12-09"))
            .admissionRank(31)
            .capital("Sacramento")
            .motto("Eureka")
            .nickname("The Golden State");

    public static final State CO = new State()
            .name("Colorado")
            .isoCode("US-CO")
            .ansiCode("CO")
            .ansiNumber(8)
            .usps("CO")
            .uscg("CL")
            .admissionDate(toDate("1876-08-01"))
            .admissionRank(38)
            .capital("Denver")
            .motto("Nothing without providence")
            .nickname("The Centennial State")
            .others("Colo", "Col");

    public static final State CT = new State()
            .name("Connecticut")
            .isoCode("US-CT")
            .ansiCode("CT")
            .ansiNumber(9)
            .usps("CT")
            .uscg("CT")
            .admissionDate(toDate("1788-01-09"))
            .admissionRank(5)
            .capital("Hartford")
            .motto("He who transplanted sustains")
            .nickname("The Constitution State")
            .others("Conn");

    public static final State DE = new State()
            .name("Delaware")
            .isoCode("US-DE")
            .ansiCode("DE")
            .ansiNumber(10)
            .usps("DE")
            .uscg("DL")
            .others("Del")
            .admissionDate(toDate("1787-12-07"))
            .admissionRank(1)
            .capital("Dover")
            .motto("Liberty and Independence")
            .nickname("The First State");

    public static final State FL = new State()
            .name("Florida")
            .isoCode("US-FL")
            .ansiCode("FL")
            .ansiNumber(12)
            .usps("FL")
            .uscg("FL")
            .others("Fla", "Flor")
            .admissionDate(toDate("1845-03-03"))
            .admissionRank(27)
            .capital("Tallahassee")
            .motto("In God We Trust")
            .nickname("The Sunshine State");

    public static final State GA = new State()
            .name("Georgia")
            .isoCode("US-GA")
            .ansiCode("GA")
            .ansiNumber(13)
            .usps("GA")
            .uscg("GA")
            .admissionDate(toDate("1788-01-02"))
            .admissionRank(4)
            .capital("Atlanta")
            .motto("Wisdom, Justice, Moderation")
            .nickname("Peach State");

    public static final State HA = new State()
            .name("Hawaii")
            .isoCode("US-HI")
            .ansiCode("HI")
            .ansiNumber(15)
            .usps("HI")
            .uscg("HA")
            .admissionDate(toDate("1959-08-21"))
            .admissionRank(50)
            .capital("Honolulu")
            .motto("The Life of the Land is Perpetuated in Righteousness")
            .nickname("The Aloha State");

    public static final State ID = new State()
            .name("Idaho")
            .isoCode("US-ID")
            .ansiCode("ID")
            .ansiNumber(16)
            .usps("ID")
            .uscg("ID")
            .others("Ida")
            .admissionDate(toDate("1890-07-03"))
            .admissionRank(38)
            .capital("Boise")
            .motto("Let it be eternal")
            .nickname("Gem State");

    public static final State IL = new State()
            .name("Illinois")
            .isoCode("US-IL")
            .ansiCode("IL")
            .ansiNumber(17)
            .usps("IL")
            .uscg("IL")
            .others("II", "IIIs")
            .admissionDate(toDate("1818-12-03"))
            .admissionRank(21)
            .capital("Springfield")
            .motto("State sovereignty")
            .nickname("Land of Lincoln");

    public static final State IN = new State()
            .name("Indiana")
            .isoCode("US-IN")
            .ansiCode("IN")
            .ansiNumber(18)
            .usps("IN")
            .uscg("IN")
            .others("Ind")
            .admissionDate(toDate("1816-12-11"))
            .admissionRank(19)
            .capital("Indianapolis")
            .motto("The Crossroads of America")
            .nickname("The Hoosier State");

    public static final State IA = new State()
            .name("Iowa")
            .isoCode("US-IA")
            .ansiCode("IA")
            .ansiNumber(19)
            .usps("IA")
            .uscg("IA")
            .others("Ioa")
            .admissionDate(toDate("1846-12-28"))
            .admissionRank(29)
            .capital("Des Moines")
            .motto("Our liberties we prize and our rights we will maintain")
            .nickname("The Hawkeye State");

    public static final State KS = new State()
            .name("Kansas")
            .isoCode("US-KS")
            .ansiCode("KS")
            .ansiNumber(20)
            .usps("KS")
            .uscg("KA")
            .others("Kans", "Kan", "Ka")
            .admissionDate(toDate("1861-01-29"))
            .admissionRank(34)
            .capital("Topeka")
            .motto("Through hardships to the stars")
            .nickname("The sunflower state");

    public static final State KY = new State()
            .name("Kentucky")
            .isoCode("US-KY")
            .ansiCode("KY")
            .ansiNumber(21)
            .usps("KY")
            .uscg("KY")
            .others("Ken", "Kent");

    public static final State LA = new State()
            .name("Louisiana")
            .isoCode("US-LA")
            .ansiCode("LA")
            .ansiNumber(22)
            .usps("LA")
            .uscg("LA");

    public static final State ME = new State().name("Maine").isoCode("US-ME").ansiCode("ME").ansiNumber(23).usps("ME").uscg("ME");
    public static final State MD = new State().name("Maryland").isoCode("US-MD").ansiCode("MD").ansiNumber(24).usps("MD").uscg("MD");
    public static final State MA = new State().name("Massachusetts").isoCode("US-MA").ansiCode("MA").ansiNumber(25).usps("MA").uscg("MS").others("Mass");
    public static final State MI = new State().name("Michigan").isoCode("US-MI").ansiCode("MI").ansiNumber(26).usps("MI").uscg("MC").others("Mich");
    public static final State MN = new State().name("Minnesota").isoCode("US-MN").ansiCode("MN").ansiNumber(27).usps("MN").uscg("MN").others("Minn");
    public static final State MS = new State().name("Mississippi").isoCode("US-MS").ansiCode("MS").ansiNumber(28).usps("MS").uscg("MI").others("Miss");
    public static final State MO = new State().name("Missouri").isoCode("US-MO").ansiCode("MO").ansiNumber(29).usps("MO").uscg("MO");
    public static final State MT = new State().name("Montana").isoCode("US-MT").ansiCode("MT").ansiNumber(30).usps("MT").uscg("MI").others("Mont");

    public static final State NE = new State()
            .name("Nebraska")
            .isoCode("US-NE")
            .ansiCode("NE")
            .ansiNumber(31)
            .usps("NE")
            .uscg("NB")
            .others("Nebr", "Neb")
            .admissionDate(toDate("1867-03-01"))
            .admissionRank(37)
            .capital("Lincoln")
            .motto("Equality before the law")
            .nickname("Cornhusker State");

    public static final State NV = new State()
            .name("Nevada")
            .isoCode("US-NV")
            .ansiCode("NV")
            .ansiNumber(32)
            .usps("NV")
            .uscg("NV")
            .others("Nev")
            .admissionDate(toDate("1864-10-31"))
            .admissionRank(36)
            .capital("Carson City")
            .motto("All for Our Country")
            .nickname("Silver State");

    public static final State NH = new State()
            .name("New Hampshire")
            .isoCode("US-NH")
            .ansiCode("NH")
            .ansiNumber(33)
            .usps("NH")
            .uscg("NH")
            .admissionDate(toDate("1788-06-21"))
            .admissionRank(9)
            .capital("Concord")
            .motto("Live Free or Die")
            .nickname("The Granite State");

    public static final State NJ = new State()
            .name("New Jersey")
            .isoCode("US-NJ")
            .ansiCode("NJ")
            .ansiNumber(34)
            .usps("NJ")
            .uscg("NJ")
            .admissionDate(toDate("1787-12-18"))
            .admissionRank(3)
            .capital("Trenton")
            .motto("Liberty and prosperity")
            .nickname("The Garden State");

    public static final State NM = new State()
            .name("New Mexico")
            .isoCode("US-NM")
            .ansiCode("NM")
            .ansiNumber(35)
            .usps("NM")
            .uscg("NM")
            .others("N. Mex", "New M.", "N.M.")
            .admissionDate(toDate("1912-01-06"))
            .admissionRank(47)
            .capital("Santa Fe")
            .motto("It grows as it goes")
            .nickname("Land of Enchantment");

    public static final State NY = new State()
            .name("New York")
            .isoCode("US-NY")
            .ansiCode("NY")
            .ansiNumber(36)
            .usps("NY")
            .uscg("NY")
            .others("N.Y.", "N. York", "New Y.")
            .admissionDate(toDate("1788-07-26"))
            .admissionRank(11)
            .capital("Albany")
            .motto("Ever upward")
            .nickname("The Empire State");

    public static final State NC = new State()
            .name("North Carolina")
            .isoCode("US-NC")
            .ansiCode("NC")
            .ansiNumber(37)
            .usps("NC")
            .uscg("NC")
            .others("N.C.", "N. Car")
            .admissionDate(toDate("1789-11-21"))
            .admissionRank(12)
            .capital("Raleigh")
            .motto("First in Flight")
            .nickname("Tar Heel State");

    public static final State ND = new State()
            .name("North Dakota")
            .isoCode("US-ND")
            .ansiCode("ND")
            .ansiNumber(38)
            .usps("ND")
            .uscg("ND")
            .others("N. Dak", "N.D.", "NoDak")
            .admissionDate(toDate("1889-11-02"))
            .admissionRank(39)
            .capital("Bismarck")
            .motto("Liberty and Union")
            .nickname("Peace Garden State");

    public static final State OH = new State().name("Ohio").isoCode("US-OH").ansiCode("OH").ansiNumber(39).usps("OH").uscg("OH");
    public static final State OK = new State().name("Oklahoma").isoCode("US-OK").ansiCode("OK").ansiNumber(40).usps("OK").uscg("OK").others("Okla");
    public static final State OR = new State().name("Oregon").isoCode("US-OR").ansiCode("OR").ansiNumber(41).usps("OR").uscg("OR").others("Oreg", "Ore");

    public static final State PA = new State().name("Pennsylvania").isoCode("US-PA").ansiCode("PA").ansiNumber(42).usps("PA").uscg("PA").others("Penn");

    public static final State RI = new State().name("Rhode Island").isoCode("US-RI").ansiCode("RI").ansiNumber(44).usps("RI").uscg("RI").others("R.I.");

    public static final State SC = new State().name("South Carolina").isoCode("US-SC").ansiCode("SC").ansiNumber(45).usps("SC").uscg("SC").others("S.C.", "S. Car");
    public static final State SD = new State().name("South Dakota").isoCode("US-SD").ansiCode("SD").ansiNumber(46).usps("SD").uscg("SD").others("S. Dak", "S.D.", "SoDak");

    public static final State TN = new State().name("Tennessee").isoCode("US-TN").ansiCode("TN").ansiNumber(47).usps("TN").uscg("TN").others("Tenn");

    public static final State TX = new State().name("Texas")
            .isoCode("US-TX")
            .ansiCode("TX")
            .ansiNumber(48)
            .usps("TX")
            .uscg("TX")
            .others("Tex")
            .admissionDate(toDate("1845-12-29"))
            .admissionRank(28)
            .capital("Austin")
            .motto("Friendship")
            .nickname("The Lone Star State");

    public static final State UT = new State().name("Utah").isoCode("US-UT").ansiCode("UT").ansiNumber(49).usps("UT").uscg("UT");

    public static final State VT = new State().name("Vermont").isoCode("US-VT").ansiCode("VT").ansiNumber(50).usps("VT").uscg("VT");
    public static final State VA = new State().name("Virginia").isoCode("US-VA").ansiCode("VA").ansiNumber(51).usps("VA").uscg("VA").others("Virg");

    public static final State WA = new State().name("Washington").isoCode("US-WA").ansiCode("WA").ansiNumber(53).usps("WA").uscg("WN").others("Wash", "Wn");
    public static final State WV = new State().name("West Virgina").isoCode("US-WV").ansiCode("WV").ansiNumber(54).usps("WV").uscg("WV").others("W. Va.", "W.V.", "W. Virg");
    public static final State WI = new State().name("Wisconsin").isoCode("US-WI").ansiCode("WI").ansiNumber(55).usps("WI").uscg("WS").others("Wis", "Wisc");
    public static final State WY = new State().name("Wyoming").isoCode("US-WY").ansiCode("WY").ansiNumber(56).usps("WY").uscg("WY").others("Wyo");

    private static List<State> states = new ArrayList<State>();

    static {
        states.add(AL); states.add(AK); states.add(AZ); states.add(AR);
        states.add(CA); states.add(CO); states.add(CT);
        states.add(DE);
        states.add(FL);
        states.add(GA);
        states.add(HA);
        states.add(IA); states.add(ID); states.add(IL); states.add(IN);
        states.add(KS); states.add(KY);
        states.add(LA);
        states.add(MA); states.add(MD); states.add(ME); states.add(MI); states.add(MN);
        states.add(MO); states.add(MS); states.add(MT);
        states.add(NC); states.add(ND); states.add(NE); states.add(NH); states.add(NJ);
        states.add(NM); states.add(NV); states.add(NY);
        states.add(OH); states.add(OK); states.add(OR);
        states.add(PA);
        states.add(RI);
        states.add(SC); states.add(SD);
        states.add(TN); states.add(TX);
        states.add(UT);
        states.add(VA); states.add(VT);
        states.add(WA); states.add(WV); states.add(WI); states.add(WY);

        //index.put("a", Arrays.asList(AL, AK, AZ, AR));
        index.put("a", states.subList(0,4));

        //index.put("c", Arrays.asList(CA, CO, CT));
        index.put("c", states.subList(4, 7));

        //index.put("d", Arrays.asList(DE));
        index.put("d", states.subList(7, 8));

        //index.put("f", Arrays.asList(FL));
        index.put("f", states.subList(8, 9));

        //index.put("g", Arrays.asList(GA));
        index.put("g", states.subList(9, 10));

        //index.put("h", Arrays.asList(HA));
        index.put("h", states.subList(10, 11));

        //index.put("i", Arrays.asList(IA, ID, IL, IN));
        index.put("i", states.subList(11, 15));

        //index.put("k", Arrays.asList(KS, KY));
        index.put("k", states.subList(15, 17));

        //index.put("l", Arrays.asList(LA));
        index.put("l", states.subList(17, 18));

        //index.put("m", Arrays.asList(MA, MD, ME, MI, MN, MO, MS, MT));
        index.put("m", states.subList(18, 26));

        //index.put("n", Arrays.asList(NC, ND, NE, NH, NJ, NM, NV, NY));
        index.put("n", states.subList(26, 34));

        //index.put("o", Arrays.asList(OH, OK, OR));
        index.put("o", states.subList(34, 37));

        //index.put("p", Arrays.asList(PA));
        index.put("p", states.subList(37, 38));

        //index.put("r", Arrays.asList(RI));
        index.put("r", states.subList(38, 39));

        //index.put("s", Arrays.asList(SC, SD));
        index.put("s", states.subList(39, 41));

        //index.put("t", Arrays.asList(TN, TX));
        index.put("t", states.subList(41, 43));

        //index.put("u", Arrays.asList(UT));
        index.put("u", states.subList(43, 44));

        //index.put("v", Arrays.asList(VA, VT));
        index.put("v", states.subList(44, 46));

        //index.put("w", Arrays.asList(WA, WV, WI, WY));
        index.put("w", states.subList(46, 50));
    }

    public static State fromAbbr(String abbr) {

        // if abbr is in isoCode format then we remove 'US-' prefix to get at 2 char state abbr
        if(isIsoCode(abbr)) {
            abbr = removeIsoCode(abbr);
        }

        String text = String.valueOf(abbr.charAt(0));
        List<State> group = index.get(text.toLowerCase());
        if(group == null) {
            return null;
        }

        for(State state : group) {
            if(abbr.equalsIgnoreCase(state.getAnsiCode())  ||
                    abbr.equalsIgnoreCase(state.getIsoCode())  ||
                    abbr.equalsIgnoreCase(state.getName())     ||
                    abbr.equalsIgnoreCase(state.getUsps())     ||
                    abbr.equalsIgnoreCase(state.getUscg())     ||
                    asList(state.getOthers()).contains(abbr)) {

                return state;
            }
        }

        return null;
    }

    public static State fromAbbr(int abbr) {

        for(State state : states) {
            if(abbr == state.getAnsiNumber()) {
                return state;
            }
        }

        return null;
    }

    private static boolean isIsoCode(String abbr) {
        return abbr.toUpperCase().startsWith("US-");
    }

    private static String removeIsoCode(String abbr) {
        return abbr.substring(3);
    }

    private static Date toDate(String text) {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = formatter.parse(text);
        } catch (ParseException e) { }
        return date;
    }

    public static synchronized SortOp orderBy() {

        List<State> contextList = new LinkedList<State>(asList(new State[states.size()]));
        Collections.copy(contextList, states);
        // SortOp is a chain
        SortOp sortOp = new SortOp(contextList);

        return sortOp;
    }

    public static synchronized FilterOp selectBy() {

        List<State> contextList = new LinkedList<State>(asList(new State[states.size()]));
        Collections.copy(contextList, states);
        // FilterOp is a chain
        FilterOp filterOp = new FilterOp(contextList);

        return filterOp;
    }

    public static List<State> list() {

        return Collections.unmodifiableList(states);

    }

}

