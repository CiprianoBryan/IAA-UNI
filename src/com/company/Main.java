package com.company;

import com.company.algorithms.*;

public class Main {
    public static void main(String[] args) {
        MLAlgoritmoJ48 mlJ48Test = new MLAlgoritmoJ48("file:///C:/Program%20Files/Weka-3-9-5/data/iris-test.arff");
        MLAlgoritmoJ48 mlJ48Train = new MLAlgoritmoJ48("file:///C:/Program%20Files/Weka-3-9-5/data/iris-train.arff");

        MLAlgorithmNaiveBayes mlBAYESTest = new MLAlgorithmNaiveBayes("file:///C:/Bryan/UNI/21-1/IAA/Weka/src/com/datasets/medical/medical-test.arff");
        MLAlgorithmNaiveBayes mlBAYESTrain = new MLAlgorithmNaiveBayes("file:///C:/Bryan/UNI/21-1/IAA/Weka/src/com/datasets/medical/medical-train.arff");

        MLAlgoritmoSMOreg mlSMOTest = new MLAlgoritmoSMOreg("file:///C:/Bryan/UNI/21-1/IAA/Weka/src/com/datasets/medical/medical-test.arff");
        MLAlgoritmoSMOreg mlSMOTrain = new MLAlgoritmoSMOreg("file:///C:/Bryan/UNI/21-1/IAA/Weka/src/com/datasets/medical/medical-test.arff");

        MLLibSVMTest mllSVMTest = new MLLibSVMTest("file:///C:/Program%20Files/Weka-3-9-5/data/iris-test.arff");
        MLLibSVMTest mllSVMTrain = new MLLibSVMTest("file:///C:/Program%20Files/Weka-3-9-5/data/iris-train.arff");

        MLAlgoritmoReptree mlREPTREETest = new MLAlgoritmoReptree("file:///C:/Program%20Files/Weka-3-9-5/data/iris-test.arff");
        MLAlgoritmoReptree mlREPTREETrain = new MLAlgoritmoReptree("file:///C:/Program%20Files/Weka-3-9-5/data/iris-test.arff");
    }
}
