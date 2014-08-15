package org.soabridge.breeze.config;

/**
 * Created by geoff d'Alelio on 8/14/14.
 *
 */

public interface Configurator {
    //interface attributes go here
    //methods to obtain the classes that provide the base functions of the HIVE to be configured

    int addPreProcessor(Class preProcessor);        //returns an int as the index into the array
    int insertPreProcessor(Class preProcessor);     //returns an int as the index into the array

// Remove if we are not going to make the configuration modifiable on the fly

    void removePreProcessor(int indx);               //removes the PreProcessor Class at  index
    void removePostProcessor(int indx);              //removes the PostProcessor Class at index


}
