package com.company.algorithms;

import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

public class MLAlgoritmoJ48 {
    public MLAlgoritmoJ48(String filepath) {
        Instances data;
        try {
            data = ConverterUtils.DataSource.read(filepath);
            if (data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);
            J48 reg = new J48();
            String[] options = weka.core.Utils.splitOptions("weka.classifiers.trees.J48 -C 0.25 -M 2");
            reg.setOptions(options);
            reg.buildClassifier(data);
            System.out.println(reg.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
