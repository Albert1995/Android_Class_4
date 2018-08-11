package br.pucpr.appdev.recycler.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private static DataStore instance = null;

    private List<City> cities;
    private Context context;

    protected DataStore() {}

    public static DataStore sharedInstance() {

        if (instance == null)
            instance = new DataStore();

        return instance;
    }

    public void setContext(Context context) {

        this.context = context;
        cities = new ArrayList<>();
        addCity(new City("Curitiba", 1750000));
        addCity(new City("São Paulo", 12100000));
        addCity(new City("Assis Chateaubriand", 34000));
    }

    public void addCity(City city) {

        cities.add(city);
    }

    public void removeCity(int position) {

        cities.remove(position);
    }

    public void editCity(City city, int position) {

        cities.set(position, city);
    }

    public void clearCities() {

        cities.clear();
    }

    public List<City> getCities() {

        return cities;
    }

    public City getCity(int position) {

        return cities.get(position);
    }
}
