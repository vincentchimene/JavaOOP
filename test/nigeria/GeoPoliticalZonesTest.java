package nigeria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeoPoliticalZonesTest {

    @Test
    public void testThatBothLagos(){

        GeoPoliticalZones zone = new GeoPoliticalZones();

        assertEquals("South West", zone.getGeoZone("Lagos"));
    }

    @Test
    public void testBenue(){

        GeoPoliticalZones zone = new GeoPoliticalZones();

        assertEquals("North Central", zone.getGeoZone("Benue"));
    }

    @Test
    public void testAbia(){

        GeoPoliticalZones zone = new GeoPoliticalZones();

        assertEquals("South East", zone.getGeoZone("Abia"));
    }

    @Test
    public void invalidState(){

        GeoPoliticalZones zone = new GeoPoliticalZones();

        assertEquals("Invalid State", zone.getGeoZone("London"));
    }

}