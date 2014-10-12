package org.soabridge.breeze.config;

       /*
        * XMLConfiguration will use an XML file with properties to provide:
        *      - PreProcessor Classes
        *      - PostProcessor Classes
        *      - Connectors Classes - TBD Later...
        *
        *      PreProcessors will be added into an array of Classes for the Hive
        *      PostProcessors will be added into an array of Classes for the Hive
        *
        * @author <a href="geoff.dalelio@soabridge.com" >Geoff d'Alelio</a>
        * @since 1.0
        *
        */


public class XMLConfiguration implements Configuration {

    public void reload()  {

  /*      properties.load(new FileInputStream(propertiesFile));
        this.preProcessors  = properties.getProperty(PROP_PRE_PROCESSORS);
        this.postProcessors = properties.getProperty(PROP_POST_PROCESSORS);
        this.versionNumber  = properties.getProperty(PROP_VERSION_NUMBER);
        this.hiveName       = properties.getProperty(PROP_HIVE_NAME);
    */
    }




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
    public Class[] getConnectors() {
        return new Class[0];
    }
}
