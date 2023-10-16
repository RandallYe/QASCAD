When we are parsing the properties, we need to use Java Regex to match and extract the name activity and its nodes. However, Epsilon doesn't support this directly. We also failed to use the Native way in Epsilon to create an instance of `java.util.regex.Pattern` and then call its compile. Eventually, we use **Call Java from Epsilon** by creating a Java plugin and then calling the methods of a class from the plugin in etl to parse and extract necessary information from properties.

The plugin project is named `org.eclipse.epsilon.ad2prism.tools`.

# Call Java from Epsilon
See video [here](https://www.youtube.com/watch?v=wSqEfhe3k5A) and help [here](https://eclipse.dev/epsilon/doc/articles/call-java-from-epsilon/)

1. create a plugin project and configure it 
2. export the plugin as "Deployable plug-ins and fragments" 
3. choose "Install into host. Repositories", or to a folder and then copy the exported jar file into the plugins folder of the running Eclipse instance for Epsilon.
   + if failed to install into host, please update the version number for the plugin, such as 1.0.0.qualifier to 1.0.1.qualifier 
4. Call the java class from etl
``` java
var temp = new Native("org.eclipse.epsilon.ad2prism.tools.AD2PRISM_Tools");
	("reaches at: " + temp.parseReachesAt(p.value)).println();
```

# Deployment of the plugin to be used in our transformation 
1. export the plugin as "Deployable plug-ins and fragments" 
2. choose "Install into host. Repositories", and choose the `plugins` folder in our Eclipse installation folder.
3. restart Eclipse
