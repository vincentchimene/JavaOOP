package nigeria;

public class GeoPoliticalZones{

    public String getGeoZone(String state){
        if(state == null){
            return "Unknown State";
        }
        String lowerState = state.toLowerCase().trim();
        if(lowerState.equals("benue") || lowerState.equals("fct") || lowerState.equals("kogi") ||
                lowerState.equals("kwara") || lowerState.equals("nasarawa") || lowerState.equals("niger") ||
                lowerState.equals("plateau")){
            return "North-Central";
        }

        if(lowerState.equals("adamawa") || lowerState.equals("bauchi") || lowerState.equals("borno") ||
                lowerState.equals("gombe") || lowerState.equals("taraba") || lowerState.equals("yobe")){
            return "North-East";
        }

        if(lowerState.equals("kaduna") || lowerState.equals("katsina") || lowerState.equals("kano") ||
                lowerState.equals("kebbi") || lowerState.equals("sokoto") || lowerState.equals("jigawa") ||
                lowerState.equals("zamfara")){
            return "North-West";
        }

        if(lowerState.equals("abia") || lowerState.equals("anambra") || lowerState.equals("ebonyi") ||
                lowerState.equals("enugu") || lowerState.equals("imo")){
            return "South-East";
        }

                if (lowerState.equals("akwa-ibom") || lowerState.equals("akwa ibom") || lowerState.equals("bayelsa") ||
                lowerState.equals("cross-river") || lowerState.equals("cross river") || lowerState.equals("delta") ||
                lowerState.equals("edo") || lowerState.equals("rivers"))
                {
            return "South-South";
        }

        if(lowerState.equals("ekiti") || lowerState.equals("lagos") || lowerState.equals("osun") ||
                lowerState.equals("ondo") || lowerState.equals("ogun") || lowerState.equals("oyo")){
            return "South-West";
        }

        return "Unknown State";
    }
}