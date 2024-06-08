package solarSystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        SolarSystemBasics solarS = new SolarSystemBasics();
        solarS.sun="1";
        solarS.planet="2";
        solarS.star="2";
        System.out.println("the solar system is ready");


        FeatureSun xros = new FeatureSun();
        xros.color="pink";
        xros.temp="2451NN";
        xros.size="0KM";

        Planet2 perox = new Planet2();
        perox.color="Green";
        perox.size="1m";
        perox.radius="3m";


    }
}
