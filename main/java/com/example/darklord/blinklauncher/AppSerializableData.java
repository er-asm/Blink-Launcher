package com.example.darklord.blinklauncher;

/**
 * Created by darklord on 20/08/2017.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AppSerializableData implements Serializable {
    private static final long serialVersionUID = 2292680772212306803L;

    List<Pac> apps = new ArrayList<Pac>();

}