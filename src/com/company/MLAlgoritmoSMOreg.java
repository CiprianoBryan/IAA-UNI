package com.company;

import weka.classifiers.functions.SMO;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

public class MLAlgoritmoSMOreg {
    public MLAlgoritmoSMOreg(String filepath){
        Instances data;
        try {
            data = ConverterUtils.DataSource.read(filepath);
            if (data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);
            SMO reg = new SMO();
            String[] options = weka.core.Utils.splitOptions("weka.classifiers.trees.J48 -C 0.25 -M 2");
            reg.setOptions(options);
            reg.buildClassifier(data);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
