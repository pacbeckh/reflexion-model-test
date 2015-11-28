# Reflexion model experiment
The reflexion model technique is applied on a very simple java student application. Note that RM Tool use java 1.4

Prerequisites to reproduce the experiment:  
-  [Eclipse 3.4.2](http://www.eclipse.org/downloads/packages/eclipse-classic-342/ganymedesr2 "Eclipse 3.4.2")  
-  [Eclipse RM Tool plugin](http://www.cs.ubc.ca/~murphy/jRMTool/doc/ "Eclipse RM Tool plugin") 


In order to generate the reflexion model a mapping between source entities and high-level entities and a high level model need to be created. Both are described in [src/reflexionmodeltest.rmt](src/reflexionmodeltest.rmt).

The generated model looks as follows:  

![alt text](https://github.com/pacbeckh/reflexion-model-test/blob/master/images/reflexionmodel_with_divergence.PNG "Reflexion model with a divergence")

This reflexion model shows us that there is a divergence between the services and the authorization entity. In Eclipse it is possible to click on a relation to show the source interactions that cause the divergence:

![alt text](https://github.com/pacbeckh/reflexion-model-test/blob/master/images/divergence.PNG "Eclipse divergence browser")

After removing the suspect method invocation and regenerating the model, the divergence is gone.

![alt text](https://github.com/pacbeckh/reflexion-model-test/blob/master/images/reflexionmodel_without_divergence.PNG "Reflexion model without divergences")
