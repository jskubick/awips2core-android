This was supposed to be an example project to illustrate the use of awips2-core in a native Android app.

As of now, my attempt to directly use awips2-core with an Android app is dead. Awips2-core has
library and Java-dependencies that are fundamentally insatiable with Android. Specifically:

* JAXB isn't supported by Android, and can't be added as an external library due to namespace
collisions and dependencies on introspection capabilities that exist in Java, but don't work
With Android.

* Apache Camel is fundamentally incompatible with Android. Literally, it's a dead-end brick wall.
Camel works by dynamically building classes and compiling them for its own use at runtime. 
Android doesn't allow you to do that.

By the time you eliminate awips2-core's dependencies on Camel and JAXB, there's nothing
LEFT of the original code to make it worth attempting to reuse.

I'm going to delete this repo eventually, but I'm leaving the readme here for now as a warning
to anyone else who gets the bright idea of trying to use awips2-core directly with Android.