package ReefParametersTracker.java;
public class AquariumLogEntry {
    private String date;
    private double temperature;
    private double alkalinity;
    private double pH;
    private double ammonia;
    private double nitrite;
    private double nitrate;
    private double phosphate;
    private double calcium;
    private double salinity;


    public AquariumLogEntry(String date, double temperature, double ammonia, double nitrite, double nitrate, double pH, double alkalinity, double phosphate, double calcium, double salinity) {
        this.date = date;
        this.temperature=temperature;
        this.ammonia=ammonia;
        this.nitrite=nitrite;
        this.nitrate=nitrate;
        this.pH=pH;
        this.alkalinity=alkalinity;
        this.phosphate=phosphate;
        this.calcium=calcium;
        this.salinity=salinity;
    }
    //date setter
    public void setDate(String date){
        this.date=date;
    }
    //date getter
    public String getDate(){
        return date;
    }
    //temperature setter
    public void setTemperature(double temperature){
        this.temperature=temperature;
    }
    //temperature getter
    public double getTemperature(){
        return temperature;
    }
    //ammonia setter
    public void setAmmonia(double ammonia){
        this.ammonia=ammonia;
    }
    //ammonia getter
    public double getAmmonia(){
        return ammonia;
    }
    //nitrite setter
    public void setNitrite(double nitrite){
        this.nitrite=nitrite;
    }
    //nitrite getter
    public double getNitrite(){
        return nitrite;
    }
    //nitrate setter
    public void setNitrate(double nitrate){
        this.nitrate=nitrate;
    }
    //nitrate getter
    public double getNitrate(){
        return nitrate;
    }
    //pH setter
    public void setpH(double pH){
        this.pH=pH;
    }
    //pH getter
    public double getpH(){
        return pH;
    }
    //alkalinity setter
    public void setAlkalinity(double alkalinity){
        this.alkalinity=alkalinity;
    }
    //alkalinity getter
    public double getAlkalinity(){
        return alkalinity;
    }
    //phosphate setter
    public void setPhosphate(double phosphate){
        this.phosphate=phosphate;
    }
    //phosphate getter
    public double getPhosphate(){
        return phosphate;
    }
    //calcium setter
    public void setCalcium(double calcium){
        this.calcium=calcium;
    }
    //calcium getter
    public double getCalcium(){
        return calcium;
    }
    //salinity setter
    public void setSalinity(double salinity){
        this.salinity=salinity;
    }
    //salinity getter
    public double getSalinity(){
        return salinity;
    }
    //toString
    public String toString(){
        return date+","+temperature+","+ammonia+","+nitrite+","+nitrate+","+pH+","+alkalinity+","+phosphate+","+calcium+", "+salinity;
    }
    public double getParameterValue(String parameterName) {
        switch (parameterName.toLowerCase()) {
            case "temperature":
                return getTemperature();
            case "ammonia":
                return getAmmonia();
            case "nitrite":
                return getNitrite();
            case "nitrate":
                return getNitrate();
            case "ph":
                return getpH();
            case "alkalinity":
                return getAlkalinity();
            case "phosphate":
                return getPhosphate();
            case "calcium":
                return getCalcium();
            case "salinity":
                return getSalinity();
            default:
                throw new IllegalArgumentException("Invalid parameter name: " + parameterName);
        }
    }
}