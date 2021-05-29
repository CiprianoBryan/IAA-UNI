package com.company;

import weka.core.converters.ConverterUtils.DataSource;
import weka.core.Instances;
import weka.classifiers.functions.SMO;
import weka.classifiers.bayes.NaiveBayes;



class MLAlgoritmoSMOreg {
    public MLAlgoritmoSMOreg(String filepath){
        Instances data;
        try {
            data = DataSource.read(filepath);
            if (data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);
            SMO reg = new SMO();
            String[] options = weka.core.Utils.splitOptions("weka.classifiers.functions.SMO -C 1.0 -L 0.001 -P 1.0E-12 -N 0 -V -1 -W 1 -K \"weka.classifiers.functions.supportVector.PolyKernel -E 1.0 -C 250007\" -calibrator \"weka.classifiers.functions.Logistic -R 1.0E-8 -M -1 -num-decimal-places 4\"");
            reg.setOptions(options);
            reg.buildClassifier(data);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        System.out.println("primer algoritmo en java");
       //MLAlgoritmoSMOreg mlsmoreg = new MLAlgoritmoSMOreg("C:\\Program Files\\Weka-3-8-5\\data\\iris.arff");
        DataSource ds = new DataSource("C:\\Program Files\\Weka-3-8-5\\data\\iris.arff");
        Instances ins = ds.getDataSet();
        NaiveBayes nb = new NaiveBayes();
        nb.buildClassifier(ins);
        System.out.println(nb.toString());





    }
}
