package edu.upc.eetac.dsa.beeter;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by OriolGresa on 3/3/16.
 */
public class BeeterResourceConfig extends ResourceConfig{
    public BeeterResourceConfig() {
        packages("edu.upc.eetac.dsa.beeter");
    }
}


