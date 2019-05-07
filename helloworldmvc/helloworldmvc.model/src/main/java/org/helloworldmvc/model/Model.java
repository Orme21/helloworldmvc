package org.helloworldmvc.model;
import java.io.BufferedReader;
import java.io.FilterReader;

import org.helloworldmvc.contract.*;

public class Model implements IModel {

    public BufferedReader fichierHelloWorld = null;
    public String ligne;

    public String getHelloWorld(){

        fichierHelloWorld = new BufferedReader(new FileReader("helloworld.txt"));

        return ligne;
    }
}