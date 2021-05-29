package com.company;

import weka.classifiers.functions.*;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.*;

public class MLLibSVMTest {
    public MLLibSVMTest(String filepath) {
        Instances data;
        try {
            data = DataSource.read(filepath);
            if (data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);
            LibSVM reg = new LibSVM();
            String[] options = weka.core.Utils.splitOptions("-K 0 -D 3");
            reg.setOptions(options);
            reg.buildClassifier(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
