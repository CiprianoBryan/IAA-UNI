package com.company;

import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

public class Main {
    public static void main(String[] args) {
        //MLAlgoritmoSMOreg mlsmoreg = new MLAlgoritmoSMOreg("file:///C:/Program%20Files/Weka-3-9-5/data/iris.arff");
        MLLibSVMTest mllsvm = new MLLibSVMTest("file:///C:/Program%20Files/Weka-3-9-5/data/iris.arff");
    }
}
