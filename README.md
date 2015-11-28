# Reflexion model experiment
The reflexion model technique is applied on a very simple java student application.  

Prerequisites:  
-  [Eclipse 3.4.2](http://www.eclipse.org/downloads/packages/eclipse-classic-342/ganymedesr2 "Eclipse 3.4.2")  
-  [Eclipse RM Tool plugin](http://www.cs.ubc.ca/~murphy/jRMTool/doc/ "Eclipse RM Tool plugin") 

The mapping and the high level model are located in the file src/reflexionmodeltest.rmt

The generated model looks as follows:  

![alt text](https://github.com/pacbeckh/reflexion-model-test/blob/master/images/reflexionmodel_with_divergence.PNG "Reflexion model with a divergence")

The reflexion model shows us that there is a divergence between the services and the authorization. In Eclipse it is possible to click on a relation to show the source interactions that cause the divergence:

![alt text](https://github.com/pacbeckh/reflexion-model-test/blob/master/images/divergence.PNG "Eclipse divergence browser")

After removing the suspect method invocation the reflexion model shows no more divergences:


![alt text](https://github.com/pacbeckh/reflexion-model-test/blob/master/images/reflexionmodel_without_divergence.PNG "Reflexion model without divergences")
