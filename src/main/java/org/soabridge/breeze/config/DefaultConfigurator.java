package org.soabridge.breeze.config;

/**
 * Created by geoff on 8/14/14.
 * ${Author}
 */
public abstract class DefaultConfigurator implements Configurator, Configuration {
   @Override
   public Class[] getPreProcessor() {
     return new Class[0];
    }

    @Override
    public Class[] getPostProcessor() {
        return new Class[0];
    }

    @Override
    public Class[] getService() {
        return new Class[0];
    }

    @Override
    public Class[] getConnectors(){
        return new Class [0];
    }

}
