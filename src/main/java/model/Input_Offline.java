package model;

import java.io.IOException;

public class Input_Offline implements InputFacade{

    @Override
    public String Input_listSupportedCountries() {
        return null;
    }

    @Override
    public String Input_listSupportedStatesFromChosenCountry(String country) throws IOException, InterruptedException {
        return null;
    }

    @Override
    public String Input_listSupportedCitiesFromChosenState(String state, String country) throws IOException, InterruptedException {
        return null;
    }

    @Override
    public String Input_listSpecifiedCityDataFromChosenState(String city, String state, String country) throws IOException, InterruptedException {
        return null;
    }
}
